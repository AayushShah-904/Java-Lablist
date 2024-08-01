import java.util.*;

class lablist2_iv
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		int cv=0;
		int cc=0;
		System.out.println("Enter String to check ");
		str=sc.nextLine();
		System.out.println(str);
		
		if (str == 'a' ) {
                cv++;
            }
			else
			{
				cc++;
			}
			
		System.out.println("vowles " +cv);
		System.out.println("constant " +cc);
			
		
		
	}
}