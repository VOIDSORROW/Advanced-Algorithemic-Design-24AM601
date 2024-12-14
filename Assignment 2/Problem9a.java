// BubbleSort

public class Problem9a{
    public static void main(String[] args) {
        int arr[] = {12,3,34,1,21,4,5,32,4,4};
        int ans[] = BubbleSort(arr);
        for(int i = 0;i<ans.length;i++){
            System.out.print(ans[i]+",");
        }
    }

    public static int[] BubbleSort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<(arr.length)-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int x = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = x;
                }
            }
        }
        return arr;
    }
}