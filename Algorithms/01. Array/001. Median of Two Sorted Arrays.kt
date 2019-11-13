// Problem: https://leetcode.com/problems/median-of-two-sorted-arrays/
// Difficulty : Hard

class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val arr: IntArray = (nums1 + nums2).sortedArray()
        val n: Int = arr.size
        val index: Int = n / 2

        if (n % 2 == 0) {
            return (arr[index-1] + arr[index]) / 2.0
        }
        else {
            return arr[index].toDouble()
        }
    }
}
