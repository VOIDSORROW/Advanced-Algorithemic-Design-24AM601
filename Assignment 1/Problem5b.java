// Problem 5

public class Problem5b {
    public static void main(String[] args) {

        int[] arr = {5,8,3,6,1,4,2,7};

        int n = arr.length;
        int start = 0;
        int end = n-1;
        // int mid = (start + (end-start))/2;

        int[] ans = Sort2(arr,start,end);

        // System.out.println();

        for(int i = 0;i<ans.length;i++){
            System.out.print(arr[i]+",");
        }

    }

    public static int[] Sort2(int[] arr, int start, int end){
        if(start >= end){
            return arr;
        }
        int mid = (start + (end-start))/2;
        int[] left = Sort2(arr, start, mid);
        int[] right = Sort2(arr, mid+1, end);
        for(int i = 0;i<left.length;i++){
            System.out.print(left[i]+",");
        }

        return merge(left,right);
    }

    public static int[] merge(int[] left,int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[left.length+right.length];
        while (i < left.length && j < right.length) {
            if(left[i] > right[j]){
                ans[k++] = right[j++];
            }else{
                ans[k++] = left[i++];
            }
        }
        return ans;
    }
}
