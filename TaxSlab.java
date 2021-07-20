package handson;

import java.util.Scanner;

public class TaxSlab {
	public void display()
	{
		int amount;
		String gender;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter gender");
		gender=sc.nextLine();
		System.out.println("enter amount");
		amount=sc.nextInt();
		 System.out.println(gender);
		if(gender.equals("women"))
		{
			if(amount>0 && amount<=190000)
				System.out.println("No tax");
			else if(amount>190000 && amount<=500000)
				System.out.println("10%");
			else if(amount>500000 && amount<=800000)
				System.out.println("20%");
			else
				System.out.println("30%");
		}
		else
		{
			if(amount>0 && amount<=180000)
				System.out.println("No tax");
			else if(amount>180000 && amount<=500000)
				System.out.println("10%");
			else if(amount>500000 && amount<=800000)
				System.out.println("20%");
			else
				System.out.println("30%");
		}
		
	}
	public static void main(String args[])
	{
		TaxSlab t=new TaxSlab();
		t.display();
	}

}
