//Program to generate n prime number

class lablist2_i
{
    public static void main(String[] args) {
        int num = 20;
        int count = 0;
		
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
		
        if (count == 0) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

}