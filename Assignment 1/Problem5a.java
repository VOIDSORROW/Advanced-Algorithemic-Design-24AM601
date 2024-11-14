// Problem 5

public class Problem5a {
    public static void main(String[] args) {
        int[] arr = {5,8,3,6,1,4,2,7};
        int[] ans = Sort1(arr,arr.length);
        for(int i = 0;i<ans.length;i++){
            System.out.print(arr[i]+",");
        }
    }

    public static int[] Sort1(int[] arr, int n){
        if (n <= 0) {
            return arr;
        }
        int pos = maxPos(arr,n);
        int x = arr[pos];
        arr[pos] = arr[n-1];
        arr[n-1] = x;
        return Sort1(arr, n-1);
    }

    public static int maxPos(int[] arr, int n){
        int p = arr[0];
        int ans = 0;
        for(int i = 1;i<n;i++){
            if (p<arr[i]) {
                ans = i;
                p = arr[i];
            }
        }
        return ans;
    }
}
