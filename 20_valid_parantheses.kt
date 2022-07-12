//Runtime: 219 ms, faster than 64.82% of Kotlin online submissions for Valid Parentheses.
//Memory Usage: 34.2 MB, less than 74.70% of Kotlin online submissions for Valid Parentheses.

fun isValid(s: String): Boolean {
    if(s.length % 2 != 0) return false

    val parenthesesStack = ArrayDeque<Char>()

    for(c in s){
        when(c) {
            '(' -> parenthesesStack.addLast(')')
            '{' -> parenthesesStack.addLast('}')
            '[' -> parenthesesStack.addLast(']')
            else -> {
                if (parenthesesStack.isEmpty()) return false
                if (parenthesesStack.removeLast() != c) return false
            }
        }
    }

    return parenthesesStack.isEmpty()
}