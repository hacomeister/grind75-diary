//Runtime: 315 ms, faster than 66.66% of Kotlin online submissions for Valid Palindrome.
//Memory Usage: 40.9 MB, less than 49.03% of Kotlin online submissions for Valid Palindrome.

class Solution {
    fun isPalindrome(s: String): Boolean {

        var headIndex = 0
        var tailIndex = s.lastIndex

        while (headIndex <= tailIndex) {
            if (s[headIndex].isValidChar()) {
                headIndex += 1
                continue
            }

            if (s[tailIndex].isValidChar()) {
                tailIndex -= 1
                continue
            }

            if (s[headIndex++].toLowerCase() != s[tailIndex--].toLowerCase()) {
                return false
            }
        }

        return true

    }

    fun Char.isValidChar()  = !isLetter() && !isDigit()

}