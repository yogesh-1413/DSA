import java.util.*;
public class insert_into_array{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of an array: ");
		int size = sc.nextInt();
		System.out.println();
		System.out.println("Enter the Values of the array:");
		int[] arr = new int[size];
		for(int i = 0;i < size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("The Given array = " +Arrays.toString(arr) );
		System.out.print("Enter the new Element : ");
		int new_element = sc.nextInt();
		System.out.println();
		System.out.print("Enter the position of the Elemet : ");
		int position  = sc.nextInt();
		if(position < 0 || position > size + 1){
			System.out.println("Invalid Position");
			return;
		}
		System.out.println();
		int[] new_array = new int[size + 1];
		for(int h = 0,r = 0;h < size + 1;h++){
			if(h == position){
				new_array[h] = new_element;
			}
			else{
				new_array[h] = arr[r];
				r++;
			}
		}
    System.out.println("The Updated Array = " + Arrays.toString(new_array));
	}
}