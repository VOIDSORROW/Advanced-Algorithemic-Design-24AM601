// Problem 8

public class Problem8{
    public static void main(String[] args) {
        int[][] A = { {1, 1, 1, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 1, 1, 1} };
        int ans = countMaxOnes(A);
        System.out.println(ans);
        ans = countMaxOnesOptimized(A);
        System.out.println(ans);
    }


    // O(N^2 approach)
    public static int countMaxOnes(int[][] arr){
        int row = 0;
        int temp = -1;

        for(int i = 0;i<arr.length;i++){
            int count1 = 0;
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j] == 1){
                    count1++;
                }else{
                    break;
                }
            }
            if(count1>temp){
                temp = count1;
                row = i;
            }
        }

        return row;
    }


    // O(N) approach
    public static int countMaxOnesOptimized(int[][] arr){
        int row = 0;
        int j = arr.length - 1;
    
        for(int i = 0;i<arr.length;i++){
            while (j >= 0 && arr[i][j] == 1) {
                j--;
            }
            row = i;
        }
        return row;
    }
}