import java.io.*;

class lablist8_i
 {
    public static void main(String[] args) throws IOException
	{
        FileReader fr = new FileReader("Z:\\23BCP001\\Java\\demo.txt");
        BufferedReader br = new BufferedReader(fr);

        //Character
		int i;
		int c=0;
        while ((i = br.read()) != -1) 
		{
			c++;
        }
		System.out.println("Number of charaaters are " +c);
		
		// Reset the BufferedReader to read from the beginning of the file
		br = new BufferedReader(new FileReader("Z:\\23BCP001\\Java\\demo.txt"));		
		
		//Sentence
		String i1;
		int s=0;
		while ((i1 = br.readLine()) != null) 
		{
			s++;
        }
		System.out.println("Number of sentences are " +s);

		// Reset the BufferedReader to read from the beginning of the file
		br = new BufferedReader(new FileReader("Z:\\23BCP001\\Java\\demo.txt"));
		
		//Words
		int w=0;
		String s1;
		while((s1=br.readLine())!=null)
		{
			String words[]=s1.split("\\s+");
			w += words.length;
		}
		
		System.out.println("Number of words are " +w);
		
		
		br.close();
        fr.close();
			
		
		
		
    }
}