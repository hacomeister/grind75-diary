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