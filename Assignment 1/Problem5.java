// Problem 5

public class Problem5 {
    public static void main(String[] args) {
        int[] arr = {5,8,3,6,1,4,2,7};
        int[] ans = Sort1(arr,arr.length);
        for(int i = 0;i<ans.length;i++){
            System.out.print(arr[i]+",");
        }
    }

    public static int[] Sort1(int[] arr, int n){
        if (n <= 1) {
            return arr;
        }
        int pos = maxPos(arr,n);
        int x = arr[pos];
        arr[pos] = arr[n-1];
        arr[n-1] = x;
        return Sort1(arr, n-1);
    }

    public static int maxPos(int[] arr, int n){
        int ans = 0;
        for(int i = 1;i<n;i++){
            if (arr[i]>arr[i-1]) {
                ans = i;
            }
        }
        return ans;
    }
}
