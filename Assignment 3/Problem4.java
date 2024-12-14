public class Problem4 {
    public static void main(String[] args) {
        int[] arr =  {4, 3, 4, 4, 2, 1, 4,4};
        int count = 0;
        int n = arr.length;
        int ans = majorityElement(arr,n,count);
        System.out.println(ans);
    }

    public static int majorityElement(int[] arr,int n, int count){

        for(int i = 1;i<arr.length;i++){
            if (arr[i-1] > arr[i]) {
                int x = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = x;
            }
        }
        for(int i = 0;i<n;i++){
            if(arr[n/2] == arr[i]){
                count++;
            }
        }
        if(count > n/2){
            return arr[n/2];
        }
        return count = -1;
    }
}
