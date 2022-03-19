
public class NumberAboveAverage {

	int daysAboveAverage;
	int average;
	int[] tempDays;
	int tempDaysIndex = 0;
	
	public NumberAboveAverage(){
		
	}
	
	public NumberAboveAverage(int days, int average, int[] tempDays)
	{
		daysAboveAverage = days;
		average = this.average;
		tempDays = this.tempDays; 
	}
	
	public int getTempDaysSize()
	{
		return tempDays.length;
	}
	
	
	public int[] getTempDays()
	{
		
		return tempDays;
	}
	public void setAmountDays(int days) 
	{
		tempDays = new int[days];	
	}
	
	public void insertTemp(int temp)
	{
		
		
		if((tempDays[tempDaysIndex] == 0) && (tempDaysIndex < tempDays.length))
		{
			tempDays[tempDaysIndex] = temp;
			tempDaysIndex++;
		}
		
		
	}
	
	
	
	
	
}
