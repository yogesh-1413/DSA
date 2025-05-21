import java.util.*;
class arr_to_element{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int[] arr = new int[k];
        for(int m= 0;m<k+1;m++){
            arr[m] = s.nextInt();
        }
        System.out.println("The Given array = "+arr);
    }
}