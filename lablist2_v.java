
import java.util.Scanner;

 class lablist2_v {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        printPyramid(input);
    }

    public static void printPyramid(String str) {
        int length = str.length();
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(str.charAt(j));
                if (j < i - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
