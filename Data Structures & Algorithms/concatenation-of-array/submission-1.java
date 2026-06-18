class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n * 2];
        int k = 0;
        for (int i = 0; i < n; i++) {
            ans[i] = nums[k++];
        }
        k = 0;
        for (int i = n; i < n * 2; i++) {
            ans[i] = nums[k++];
        }
        return ans;
    }
}