//Runtime: 834 ms, faster than 59.89% of Kotlin online submissions for Best Time to Buy and Sell Stock.
//Memory Usage: 93.3 MB, less than 38.94% of Kotlin online submissions for Best Time to Buy and Sell Stock.

class Solution {
    fun maxProfit(prices: IntArray): Int {

        var lowestPrice = prices[0]
        var maxProfit = 0

        for (p in prices) {
            if (p - lowestPrice > maxProfit) maxProfit = p - lowestPrice
            if (p < lowestPrice) lowestPrice = p
        }

        return maxProfit
    }
}