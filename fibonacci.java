import java.util.*;
public class fibonacci{
public static void main(String[]args){
    System.out.println("Enter the Number of Fibonacci terms Needed : ");
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    if(h>=2){
        int y =0;
        int l = 1;
        System.out.println("The first "+h+" Fibonacci Terms are : ");
        System.out.println(y);
        System.out.println(l);
        for(int m = 3;m<=h;m++){
            int k = y+l;
            System.out.println(k);
            y = l;
            l = k;
        }
    }
    else{
        System.out.println("The Number Fibonacci terms can't be negative or Less than 2 ");
    }
}
}