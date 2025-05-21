
import java.util.InputMismatchException;
import java.util.Scanner;

class hella {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of terms in the fibanocii");
        try {
            int num = scan.nextInt();
            if (num <= 1) {
                System.out.println("The Number of therms in the Fibanocii series must be more than 1");
                return;
            }
            double fi = 0;
            double li = 1;
            System.out.println(fi);
            System.out.println(li);
            for (int h = 2; h < num; h++) {
                double series = fi + li;
                fi = li;
                li = series;
                System.out.println(series);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input format please Enter the input in INTEGER format");
        }
    }
}
