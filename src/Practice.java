/*Input :
arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3}
x = 3
k = 3
Output : Yes
There are 4 non-overlapping segments of size k in the array, {3, 5, 2}, {4, 9, 3}, {1, 7, 3}
and {11, 12, 3}. 3 is present all segments.*/

import java.util.Scanner;
import java.util.Arrays;
public class Practice {
    public static void main(String[] args) {
        Scanner objin = new Scanner(System.in);
        int[] arr = {3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3};

        int x = objin.nextInt();
        int k = objin.nextInt();
        int count = 1;
        int[] myarray = new int[(arr.length)/k];
        for (int i = 0; i < (arr.length) / k; i++) {
            int a = k * count;
            int[] arraysliced = Arrays.copyOfRange(arr, k * i, a);
            System.out.println(Arrays.toString(arraysliced));
            myarray = (arraysliced);
            count++;
        }
        if (myarray.length != arr.length){
            System.out.println("NO");
            System.out.println(Arrays.toString(myarray));
        }

    }
}
