package arrays_DOC;

public class ArrayAverageStat {

	public static void main(String[] args) 
	{
		double[] arr = {2, 2, 2, 2};
		double total = 0;
		
		for(int i=0; i<arr.length; i++)
		{
		total = total + arr[i];
		}
		
		double average = total/arr.length;
		
		System.out.println("The average of this array is: " +average);
		
		// TODO Auto-generated method stub

	}

}
