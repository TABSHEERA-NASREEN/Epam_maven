package com.epam.task2.Giftpack;

public class Chocolates extends NewYearGift{
	
	 public int totalWeight(int chocolate[],int n)
	 {
		 int total=0;
			for(int i=0;i<n;i++)
			{
				total+=chocolate[i];
			}
			return total;
		
	 }
	 public int numOfCandy(int low,int high,int[] chocolate,int c)
		{
			int count=0;
			for(int i=0;i<c;i++)
			{
				if(chocolate[i]>=low && chocolate[i]<=high)
					count++;
			}
			return count;
		}


}
