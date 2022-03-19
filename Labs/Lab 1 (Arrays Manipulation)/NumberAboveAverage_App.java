 import java.util.Scanner;
 
public class NumberAboveAverage_App {
	
	public static void main(String[] args)
	{
		
		NumberAboveAverage x = new NumberAboveAverage();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of days you desire to enter: ");
		x.setAmountDays(keyboard.nextInt());
		
		System.out.println(x.getTempDaysSize());
		
		System.out.println("Please enter the temperature for the next " + x.getTempDaysSize() + " days:");
		
		
		for(int i = 0; i < x.getTempDaysSize(); i++)
		{
			x.insertTemp(keyboard.nextInt());
		}
		
		for(int i = 0; i < x.getTempDaysSize(); i++)
		{
			System.out.println(x.getTempDays()[i]);
		}
		
		int tempSum = 0;
		
		for(int i = 0; i < x.getTempDaysSize(); i++)
		{
			tempSum += x.getTempDays()[i];
		}
		
		int tempAverage = tempSum/x.getTempDaysSize();
		
		System.out.println("The Average of the Sum of the Temperatures is: " + tempAverage);
		
		int numDaysAboveAverage = 0;
		
		for(int i = 0; i < x.getTempDaysSize(); i++)
		{
			
			if(x.getTempDays()[i] > tempAverage)
			{
				numDaysAboveAverage++;
			}
			
		}
		
		System.out.println("There are " + numDaysAboveAverage + " days above average");
	}

}
