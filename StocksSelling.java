/*
 * 
 * Writing programming interview questions hasn't made me rich. Maybe trading Apple stocks will.
 * 
 */
package com.veera.face.book;

import java.util.List;

/**
 * @author Veera
 *
 */
public class StocksSelling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 int stocks_price_yesterday[]= { 5, 5, 20, 3, 5, 20, 5, 8, 7 };
		 
		 int[] profit=getProfits(stocks_price_yesterday);
		 
		
			 
			 System.out.println("Lowest: " +profit[0]);
			 
			 System.out.println("Highest: " +profit[1]);
			 System.out.println("Max Profit: " +profit[2]);
		 

	}

	private static int[] getProfits(int[] stocks_price_yesterday) {
		
		int result[]= {-1,-1,-1};
		int lowest=0;
		int highest=0;
		int maxProfit=0;
		
		if(stocks_price_yesterday.length<=1)
		{
			result[0]=result[1]=result[2]=stocks_price_yesterday[0];
			
		}
		else
		{
			for(int i=0; i<stocks_price_yesterday.length;i++)
			{
				if(highest<stocks_price_yesterday[i])
				{
					highest=stocks_price_yesterday[i];
				}
				if(i==0)
				{
					lowest=	stocks_price_yesterday[0];
				}
				else if(lowest>stocks_price_yesterday[i])
				{
					lowest=stocks_price_yesterday[i];
				}
				
			}
			maxProfit=highest-lowest;
			result[0]=lowest;
			result[1]=highest;
			result[2]=maxProfit;		
			
		}
		
		return result;		
	}

}
