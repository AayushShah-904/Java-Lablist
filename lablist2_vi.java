/*
Java Program to Find Largest Number in an array
*/

class lablist2_vi
{
	public static void main(String args[])
	{
		int arr[]={76,35,63,38,14,05};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Large number in array is " +max);
	}
}