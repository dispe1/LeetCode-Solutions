// Problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Difficulty : Medium

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var n: Int = s.length
        var ans: Int = 0
        var map: HashMap<Char, Int> = hashMapOf()
        var i:Int = 0

        for(j in 0 until n ) {
            val c: Char = s[j]
            i = Math.max(map.get(c) ?: 0, i)
            ans = Math.max(ans, j - i + 1)
            map.put(c, j + 1)
        }
        return ans
    }
}
