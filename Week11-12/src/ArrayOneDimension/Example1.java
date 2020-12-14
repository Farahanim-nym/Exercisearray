package ArrayOneDimension;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		//declare and create array
		System.out.println("Welcome to our zombie killer program!!");
		String backpack[]= {"Shot gun","Assault Riffle","Sniper"};
		String zombies[]= {"Close-Range","Mid-Range","Long-Range "};
		
		int numbersZombiesHATE[]= {4,90,70,123,12,4,561,7};
		
		System.out.println("Choose your weapon num 0-2");
		int weapon=obj.nextInt();
		System.out.println("Choose your zombie range 0-2");
		int range=obj.nextInt();
		System.out.println("How many zombies hate 0-7");
		int hate=obj.nextInt();
		
		System.out.println("weapon :"+backpack[weapon]);
		System.out.println("zombie range :"+zombies[range]);
		System.out.println("Numbers of zombies hate: "+numbersZombiesHATE[hate]);

	}

}
