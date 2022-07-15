//Runtime: 316 ms, faster than 64.29% of Kotlin online submissions for Valid Anagram.
//Memory Usage: 41.9 MB, less than 58.87% of Kotlin online submissions for Valid Anagram.

class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if (s.length != t.length) return false

        val letterCountMap = mutableMapOf<Char, Int>()

        for (c in s) {
            if (letterCountMap[c]!=null) letterCountMap[c] = letterCountMap[c]!! + 1
            else letterCountMap[c] = 1
        }

        for (c in t) {
            if (letterCountMap[c]!=null && letterCountMap[c]!=0) letterCountMap[c] = letterCountMap[c]!! - 1
            else return false
        }

        return true
    }
}