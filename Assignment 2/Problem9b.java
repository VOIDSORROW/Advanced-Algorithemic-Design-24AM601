

public class Problem9b {
    public static void main(String[] args) {
        int arr[] = {12,3,34,1,21,4,5,32,4,4};
        int ans[] = SelectionSort(arr);
        for(int i = 0;i<ans.length;i++){
            System.out.print(ans[i]+",");
        }
    }

    public static int[] SelectionSort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
