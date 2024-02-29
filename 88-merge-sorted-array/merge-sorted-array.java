class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //merge both arrays
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0 && k < nums2.length) {
                nums1[i] = nums2[k];
                k++;
            }
        }

        //sort them in non-decreasing order
        for (int j = 1; j < nums1.length; j++){
            int temp = nums1[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < nums1[possibleIndex - 1]){
                nums1[possibleIndex] = nums1[possibleIndex - 1];
                possibleIndex--;
            }

            nums1[possibleIndex] = temp;
        }
    }
}