/*
2)
iv.A program to accept a line and check how many consonants and vowels are there in line.
*/

import java.util.*;

class lablist2_iv
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = sc.nextLine().toLowerCase();

        int cv = 0;
        int cc = 0;

        for (char c : line.toCharArray()) 
		{
            if (Character.isLetter(c)) 
			{
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
				{
                    cv++;
                } else 
				{
                    cc++;
                }
            }
        }

        System.out.println("Vowels: " + cv);
        System.out.println("Consonants: " + cc);
    }	
}
