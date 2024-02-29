class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        // Count the number of zeros in the original array
        for (int num : arr) {
            if (num == 0) {
                zeros++;
            }
        }

        // Start from the beginning of the array
        for (int i = 0; i < arr.length; i++) {
            // If we encounter a zero, duplicate it
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }
    }
}