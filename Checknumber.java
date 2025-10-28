import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = input.nextInt();

        // Checking the number type
        if (n == 0) {
            System.out.println("It is Zero.");
        } 
        else {
       //checking the positive number
            if (n > 0) {
                System.out.println("It is a Positive number.");
            } else {
      //checking the negative number
                System.out.println("It is a Negative number.");
            }
        }

        input.close();
    }
}
