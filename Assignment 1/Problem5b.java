// Problem 5

public class Problem5b {
    public static void main(String[] args) {
        int[] arr = {5,8,3,6,1,4,2,7};
        int n = arr.length;
        int half = 0;
        if(n%2 == 0) half = n/2 ? half = (n/2)+1;
        int[] A = new int[half];
        for(int i = n/2;i<half;i++){
            A[i] = arr[i];
        }
        int[] B = new int[half];
        for(int i = n/2;i<half;i++){
            A[i] = arr[i];
        }

        int[] ans = Sort2(arr,arr.length);
        for(int i = 0;i<ans.length;i++){
            System.out.print(arr[i]+",");
        }
    }

    public static int[] Sort2(int[] arr, int n){
        if (n <= 0) {
            return arr;
        }

        A = Sort2(arr, n/2);
        B = Sort2(B, n/2);
        return Sort2(arr, n-1);
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
