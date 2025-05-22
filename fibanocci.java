import java.util.Scanner;
public class fibanocci{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Number of fibanocci terms Needed");
         long i = sc.nextInt();
         System.out.println("The First "+i+" Terms of the Fibanocci Series are = ");
         long k = 0;
         long j = 1;
         System.out.println(k);
         System.out.println(j);
         for(long h = 2;h<=i;h++){
            long p =k+j;
            System.out.println(p);
            k = j;
            j = p;
         }
    }
   
}