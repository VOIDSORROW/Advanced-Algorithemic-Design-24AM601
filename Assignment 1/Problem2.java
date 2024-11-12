// Problem 2

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        int arr[] = {43,54,23,12,534,1,35,6,2,5,5};
        ArrayList<Integer> low = new ArrayList<>();
        ArrayList<Integer> high = new ArrayList<>();

        for(int i = 1;i<arr.length;i++){
            if(arr[0]<arr[i]){
                high.add(arr[i]);
            }else{
                low.add(arr[i]);
            }
        }
        System.out.println("A[0] is: "+arr[0]);
        System.out.print("Elements less than A[0] are: ");
        for(int i = 0;i<low.size();i++){
            System.out.print(low.get(i)+",");
        }
        System.out.println("");
        System.out.print("Elements greater than A[0] are: ");
        for(int i = 0;i<high.size();i++){
            System.out.print(high.get(i)+",");
        }
    }
}
