package day11;

import java.util.Scanner;

public class StockAccManagement 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Stocks : ");
        int numOfStocks = in.nextInt();
        String[][] arr = new String [numOfStocks][3];
        for(int i = 0; i < numOfStocks; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                arr[i][j]=in.nextLine();
            }
        }
     }
}
