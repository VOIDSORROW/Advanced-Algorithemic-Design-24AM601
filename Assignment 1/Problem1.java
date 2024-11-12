// LeetCode 26.Remove Duplicates from Sorted Array 

public class Problem1{
    public static void main(String[] args) {
        int arr[] = {2, 7, 7, 11, 24, 24, 24, 29, 36, 36};
        removeDuplicates(arr);
    }

    public static void removeDuplicates(int[] arr){
        int count = 1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                continue;
            }else{
                arr[count++] = arr[i];
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(i>count){
                System.out.print("_"+",");
            }else{
                System.out.print(arr[i]+",");
            }
        }
    }
}