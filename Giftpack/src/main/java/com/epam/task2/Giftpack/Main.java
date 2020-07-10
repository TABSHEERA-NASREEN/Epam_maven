package com.epam.task2.Giftpack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of Chocolates==");
		int no_of_chocolate=sc.nextInt();
		System.out.println("Number of Sweets==");
		int no_of_sweets=sc.nextInt();
		int[] chocolate=new int[no_of_chocolate];
		int[] sweets=new int[no_of_sweets];
		for(int i=0;i<no_of_chocolate;i++)
		{
			System.out.println("Enter the weight of "+(i+1)+" chococlate");
			chocolate[i]=sc.nextInt();
		}
		Chocolates choc_1=new Chocolates();
		int chocweight=choc_1.totalWeight(chocolate, no_of_chocolate);
		for(int i=0;i<no_of_sweets;i++)
		{
			System.out.println("Enter the weight of "+(i+1)+" sweet");
			sweets[i]=sc.nextInt();
		}
		Sweet s1=new Sweet();
		int sweetweight=choc_1.totalWeight(sweets, no_of_sweets);
		System.out.print("Enter the lowest weight range of candy:");
		int low=sc.nextInt();
		System.out.print("Enter the highest range of the candy:");
		int high=sc.nextInt();
		int num_of_chococandy=choc_1.numOfCandy(low,high,chocolate,no_of_chocolate);
		int num_of_sweetcandy=s1.numOfCandy(low,high,sweets,no_of_sweets);
		int total_candy=num_of_chococandy+num_of_sweetcandy;
		if(total_candy>=1)
			System.out.print("***Congratulations you recieved "+total_candy+" candy***");
		else
			System.out.print("You recieved "+total_candy+" candy");
		
		
	

	}

}
