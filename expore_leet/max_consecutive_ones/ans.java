class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int sum = 0;    
            for(int num : nums) {
                if (num == 1){
                    sum++;
                }else {
                    if (sum > max)
                        max = sum;
                    sum = 0;
                }
            }
        if (sum > max)
                max = sum;
        return max;
    }
}