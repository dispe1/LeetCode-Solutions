// Problem: https://leetcode.com/problems/two-sum/
// Difficulty : Easy

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        val n = nums.size

        for (i in 0..n) {
            val complement = target - nums[i]
            if(map.containsKey(complement)) {
                return intArrayOf(map.get(complement)!!, i)
            }
            map.put(nums[i], i)
        }
        return nums
    }
}
