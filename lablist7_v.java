class lablist7_v 
{
  public static void main(String[] args) 
  {
    try 
	{
      // Code that may throw an exception
      int x = 5 / 0;
    } catch (ArithmeticException e) 
	{
      // Catch and handle the exception
      System.out.println("Caught ArithmeticException: " + e.getMessage());
    } finally 
	{
      // This block will always be executed, regardless of whether an exception was thrown
      System.out.println("Finally block executed");
    }
  }
}