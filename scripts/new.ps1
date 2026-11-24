# usage: .\scripts\new.ps1 <boj|pgs> <dir under src> <problem number>
# ex)    .\scripts\new.ps1 boj src\BaekJoon\Binary_Search 2512
#        -> src\BaekJoon\Binary_Search\P2512\Main.java (package BaekJoon.Binary_Search.P2512)
#        P2512 already taken -> P2512_2\Main.java, then P2512_3, ...
param(
    [Parameter(Mandatory)][ValidateSet('boj', 'pgs')][string]$Type,
    [Parameter(Mandatory)][string]$Path,
    [Parameter(Mandatory)][int]$Number
)

# path as given, else under repo root / src / src\BaekJoon (so `np boj Two_Pointer 2230` works from anywhere)
foreach ($c in $Path, "$PSScriptRoot\..\$Path", "$PSScriptRoot\..\src\$Path", "$PSScriptRoot\..\src\BaekJoon\$Path") {
    if (Test-Path -PathType Container $c) { $Path = $c; break }
}
if (-not (Test-Path -PathType Container $Path)) { throw "directory not found: $Path" }
$full = (Resolve-Path $Path).Path
$parts = $full.Split([IO.Path]::DirectorySeparatorChar)
$srcIndex = [Array]::LastIndexOf($parts, 'src')
if ($srcIndex -lt 0) { throw "path must be under a 'src' directory: $full" }

$sub = if ($srcIndex -lt $parts.Length - 1) { $parts[($srcIndex + 1)..($parts.Length - 1)] } else { @() }

# P<n> is taken if a P<n>.java class or a P<n> dir exists (same-name package/class clash) -> P<n>_2, P<n>_3, ...
$name = "P$Number"
for ($i = 2; (Test-Path (Join-Path $full "$name.java")) -or (Test-Path (Join-Path $full $name)); $i++) {
    $name = "P${Number}_$i"
}
$pkg = (@($sub) + $name) -join '.'

$dir = Join-Path $full $name
$file = Join-Path $dir 'Main.java'

if ($Type -eq 'boj') {
    $body = @"
package $pkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // TODO

        bw.flush();
    }
}
"@
} else {
    $body = @"
package $pkg;

public class Main {

    public static int solution() {
        int answer = 0;
        // TODO
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution());
    }
}
"@
}

New-Item -ItemType Directory -Force $dir | Out-Null
[IO.File]::WriteAllText($file, $body, (New-Object Text.UTF8Encoding($false)))
Write-Host "created $file"
