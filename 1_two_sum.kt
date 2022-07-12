class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val valueIndexMap = mutableMapOf<Int, Int>() //this will hold remaining

        for (i in nums.indices) {
            if (valueIndexMap[nums[i]] != null) return intArrayOf(valueIndexMap[nums[i]]!!, i)
            valueIndexMap[target-nums[i]] = i
        }

        return intArrayOf(-1,-1)
    }
}