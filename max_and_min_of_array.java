import java.util.*;
public class max_and_min_of_array {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the string:")
    ;int l = sc.nextInt();
    if(l<=0){
        System.out.println("The length of the Array can't be '0' or 'negitive'");
        return;
    }
    System.out.println("Enter the elements of the String:");
    int[] arr = new int[l];
    for(int k = 0; k<l;k++){
        arr[k] = sc.nextInt();
    }
    System.out.println("the given String is:"+Arrays.toString(arr));
    int min = arr[0];
    int max = arr[0];
    for(int d = 0;d < l ; d++){
        if(min > arr[d]){
            min = arr[d];
        }
        if(max < arr[d]){
            max = arr[d];
        }
    }
    System.out.println("The max of the array  "+Arrays.toString(arr)+" is : "+max);
    System.out.println("The min of the array  "+Arrays.toString(arr)+" is : "+min);

    }
}
