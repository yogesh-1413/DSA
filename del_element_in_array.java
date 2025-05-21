import java.nio.file.SecureDirectoryStream;
import java.util.*;
public class del_element_in_array{
    public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("The size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The inserted array = "+ Arrays.toString(arr));
        System.out.println("Enter the elemnt to be deleted:");
        int position = sc.nextInt();
        if (position <0||position>size-1 ){
            System.out.println("Enter the Valid Position:");
            return;
        }
        int[] new_arr = new int[size - 1];
        for(int h = 0,a = 0;h<size;h++){
        if(position != h){
            new_arr[a] = arr[h];
            a++;
        }else{

        }
        }
        System.out.println("The updated Array = "+ Arrays.toString(new_arr));
    }
}
