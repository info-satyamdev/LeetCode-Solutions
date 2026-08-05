class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> solution = new HashMap<>();
        for(int i= 0; i < nums.length;i++ ){
            int value = target - nums[i];
            if(solution.containsKey(value)){
                return new int [] { solution.get(value), i };
            }
            solution.put(nums[i],i);
        }
        return new int []{};
    }
}