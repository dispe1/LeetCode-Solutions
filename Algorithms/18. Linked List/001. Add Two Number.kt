// Problem: https://leetcode.com/problems/add-two-numbers/
// Difficulty : Medium

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var head: ListNode? = ListNode(0)
        var p1 = l1
        var p2 = l2
        var curr = head
        var carry = 0

        while(p1 != null || p2  != null || carry != 0) {
            var v1: Int = p1?.`val` ?: 0 as Int
            var v2: Int = p2?.`val` ?: 0 as Int
            var sum = carry + v1 + v2
            carry = sum / 10
            curr?.next = ListNode(sum % 10)
            curr = curr?.next
            p1 = p1?.next
            p2 = p2?.next
        }

        return head?.next
    }
}
