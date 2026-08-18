class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int k = 0;
        int j = 0;
        int solutionArraySize = nums1.length + nums2.length;
        int [] solutionArray = new int [solutionArraySize];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                solutionArray[k] = nums1[i];
                i++;
            } else {
                solutionArray[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length) {
            solutionArray[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            solutionArray[k] = nums2[j];
            j++;
            k++;
        }
        int medianIndex = solutionArraySize /2;
        double median = 0;
        if(solutionArraySize%2 == 0){
            median = (solutionArray[medianIndex] + solutionArray[medianIndex - 1])/2.0;
        }
        else{
            median = solutionArray[medianIndex];
        } 
        return median;
    }
}