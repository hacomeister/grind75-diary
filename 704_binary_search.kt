//Runtime: 497 ms, faster than 56.07% of Kotlin online submissions for Binary Search.
//Memory Usage: 65.1 MB, less than 42.12% of Kotlin online submissions for Binary Search.

class Solution {
    fun search(nums: IntArray, target: Int): Int = binarySearch(nums, 0, nums.size, target)

    fun binarySearch(nums: IntArray, headIndex: Int, tailIndex: Int, target: Int) : Int{
        if (headIndex >= tailIndex) return -1

        val midIndex = (headIndex + tailIndex)/2

        if (nums[midIndex] < target) {
            return binarySearch(nums, midIndex+1, tailIndex, target)
        }
        else if (nums[midIndex] > target){
            return binarySearch(nums, headIndex, midIndex, target)
        }
        else {
            return midIndex
        }
    }
}