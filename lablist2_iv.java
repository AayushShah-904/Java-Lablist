/*
2)
iv.Write a program to accept a line and check how many consonants and vowels are there in line.
*/
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
		str=sc.nextLine().toLowerCase();
	
		
		
    for (char c : str.toCharArray()) {
        if (Character.isLetter(c)) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cv++;
            } else {
                cc++;
            }
        }
    }


		System.out.println("vowles " +cv);
		System.out.println("constant " +cc);
			
		
		
	}
}