public class Problem1 {

    public static void main(String[] args) {
        int[] bitonicArray = {-4, -1, 0, 3, 8, 11, 7, 4};
        int peak = findPeakElement(bitonicArray, 0, bitonicArray.length - 1);
        System.out.println("Peak element: " + peak);
    }

    public static int findPeakElement(int[] A, int low, int high) {
        if (low == high) {
            return A[low];
        }

        int mid = low + (high - low) / 2;

        // Check if mid is the peak element
        if ((mid == 0 || A[mid] >= A[mid - 1]) && (mid == A.length - 1 || A[mid] >= A[mid + 1])) {
            return A[mid];
        }
        // If the left neighbor is greater, the peak is in the left half
        else if (mid > 0 && A[mid] < A[mid - 1]) {
            return findPeakElement(A, low, mid - 1);
        }
        // If the right neighbor is greater, the peak is in the right half
        else {
            return findPeakElement(A, mid + 1, high);
        }
    }

}
