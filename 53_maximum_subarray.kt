//Runtime: 830 ms, faster than 51.84% of Kotlin online submissions for Maximum Subarray.
//Memory Usage: 86.9 MB, less than 55.13% of Kotlin online submissions for Maximum Subarray.

class Solution {
    fun maxSubArray(nums: IntArray): Int {

        var max = nums[0]
        var currentSum = nums[0]

        for (i in 1..nums.lastIndex) {
            currentSum = maxOf(nums[i], currentSum + nums[i])
            max = maxOf(max, currentSum)
        }

        return max

    }
}