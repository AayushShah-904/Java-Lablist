import java.io.*;

class lablist8_ii
 {
    public static void main(String[] args) throws IOException
	{
        FileReader fr = new FileReader("Z:\\23BCP001\\Java\\demo.txt");
        BufferedReader br = new BufferedReader(fr);
		
		int w=0;
		String s1;
		while((s1=br.readLine())!=null)
		{

			for(int i=0;i<s1.length;i++)
			{
				s1[i]=s1[i].toUpperCase();
			}
			
			for(int j=0;j<s1.length;j++)
			{
				System.out.println(s1[j] + " ");
			}
			
		}		
		
		br.close();
        fr.close();
			
		
		
		
    }
}