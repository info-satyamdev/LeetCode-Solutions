class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int solutionArraySize = nums1.length + nums2.length;
        int [] solutionArray = new int[solutionArraySize];
        for(int i = 0; i<nums1.length; i++){
            solutionArray[i] = nums1[i];
        }
        for(int i = 0; i<nums2.length; i++){
            solutionArray[nums1.length + i] = nums2[i];
        }
        Arrays.sort(solutionArray);
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