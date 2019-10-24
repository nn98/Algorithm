package BaekJoon;

import java.util.Scanner;

public class P12791 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j;
		String[]a=("1967 DavidBowie\r\n" + 
				"1969 SpaceOddity\r\n" + 
				"1970 TheManWhoSoldTheWorld\r\n" + 
				"1971 HunkyDory\r\n" + 
				"1972 TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars\r\n" + 
				"1973 AladdinSane\r\n" + 
				"1973 PinUps\r\n" + 
				"1974 DiamondDogs\r\n" + 
				"1975 YoungAmericans\r\n" + 
				"1976 StationToStation\r\n" + 
				"1977 Low\r\n" + 
				"1977 Heroes\r\n" + 
				"1979 Lodger\r\n" + 
				"1980 ScaryMonstersAndSuperCreeps\r\n" + 
				"1983 LetsDance\r\n" + 
				"1984 Tonight\r\n" + 
				"1987 NeverLetMeDown\r\n" + 
				"1993 BlackTieWhiteNoise\r\n" + 
				"1995 1.Outside\r\n" + 
				"1997 Earthling\r\n" + 
				"1999 Hours\r\n" + 
				"2002 Heathen\r\n" + 
				"2003 Reality\r\n" + 
				"2013 TheNextDay\r\n" + 
				"2016 BlackStar").replaceAll("\r","").split("\n");
		for(;i<n;i++) {
			String r="\n";
			int f=s.nextInt(),t=s.nextInt(),d,u=0;
			for(j=0;j<25;j++) {
				String[]e=a[j].split(" ");
				d=Integer.parseInt(e[0]);
				if(d>=f&&d<=t) {
					u++;
					r+=a[j]+"\n";
				}
				else if(d>t)
					break;
			}
			System.out.print(u+r);
		}
	}
}
