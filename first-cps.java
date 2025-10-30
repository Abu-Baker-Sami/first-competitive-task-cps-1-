class Solution {
    public int maxArea(int[] height) {

        int curA = 0;
        int maxA = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (height[i] >= height[j]) {
                    curA = height[j] * (j-i);
                }
                else if(height[i] < height[j]){
                    curA = height[i] * (j-i);
                }
                if (curA > maxA) {
                    maxA = curA;
                }
            }
        }
        return maxA;
    }
}
