#include <bits/stdc++.h>
#define rep(i,n) for(int i=0;i<n;++i)
#define REP(i,n) for(int i=1;i<=n;++i)
#define FAST cin.tie(NULL);cout.tie(NULL); ios::sync_with_stdio(false)
using namespace std;

typedef pair<int, int> pii;

long long ans;
int N, M,a,b;
vector<pii> edge;

int fenwick[2001];

void update(int idx, int val) {
    while (idx <= N) {
        fenwick[idx] += val;
        idx += idx & -idx;
    }
}

int query(int idx) {
    int ret = 0;
    while (idx) {
        ret += fenwick[idx];
        idx -= idx & -idx;
    }
    return ret;
}

int main() {
    FAST;
    cin >> N >> M;
    while(M--) {
        cin >> a >> b;
        edge.emplace_back(a, b);
    }
    sort(edge.begin(), edge.end());

    for (auto [A, B] : edge) {
        ans += query(N) - query(B);
        update(B,1);
    }
    cout << ans;
    return 0;
}