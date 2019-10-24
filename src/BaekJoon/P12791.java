package BaekJoon;

import java.util.*;

public class P12791 {

	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j;
		String[]a=("1967 DavidBowie.1969 SpaceOddity,1970 TheManWhoSoldTheWorld,1971 HunkyDory,1972 TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars,1973 AladdinSane,1973 PinUps,1974 DiamondDogs,1975 YoungAmericans,1976 StationToStation,1977 Low,1977 Heroes,1979 Lodger,1980 ScaryMonstersAndSuperCreeps,1983 LetsDance,1984 Tonight,1987 NeverLetMeDown,1993 BlackTieWhiteNoise,1995 1.Outside,1997 Earthling,1999 Hours,2002 Heathen,2003 Reality,2013 TheNextDay,2016 BlackStar").split(",");
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
				else if(d>t)break;
			}
			System.out.print(u+r);
		}
	}
}