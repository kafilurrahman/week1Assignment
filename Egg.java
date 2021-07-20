package handson;

import java.util.Scanner;

public class Egg {
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		int gross=0;
		int dozen=0;
		int remaining=0;
		System.out.println("enter egg");
		int egg;
		egg=sc.nextInt();
		gross=egg/144;
		dozen=(egg-(144*gross))/12;
		remaining=egg-(gross*144)-(dozen*12);
		
		System.out.println("number of gross is"+" "+gross);
		System.out.println("number of dozen is"+" "+dozen);
	    System.out.println("remaining egg is "+" "+remaining);
	}
	public static void main(String args[])
	{
		Egg e=new Egg();
		e.display();
	}

}
