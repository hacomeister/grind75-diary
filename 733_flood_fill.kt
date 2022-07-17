//Runtime: 388 ms, faster than 68.37% of Kotlin online submissions for Flood Fill.
//Memory Usage: 49 MB, less than 39.27% of Kotlin online submissions for Flood Fill.

class Solution {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {

        val changedColor = image[sr][sc]
        if(changedColor==color) return image

        val filledimage = image.copyOf()
        val cellCoordinateStack = Stack<Pair<Int,Int>>()
        cellCoordinateStack.add(Pair(sr,sc))

        while (cellCoordinateStack.isNotEmpty()) {
            val coloringCell = cellCoordinateStack.pop()

            val cellX = coloringCell.first
            val cellY = coloringCell.second

            filledimage[cellX][cellY] = color

            if (cellX-1 >= 0 && image[cellX-1][coloringCell.second] == changedColor) {
                cellCoordinateStack.add(Pair(cellX-1, cellY))
            }

            if (cellX+1 < image.size && image[cellX+1][coloringCell.second] == changedColor) {
                cellCoordinateStack.add(Pair(cellX+1, cellY))
            }

            if (cellY-1 >= 0 && image[cellX][cellY-1] == changedColor) {
                cellCoordinateStack.add(Pair(cellX, cellY-1))
            }

            if (cellY+1 < image[0].size && image[cellX][cellY+1] == changedColor) {
                cellCoordinateStack.add(Pair(cellX, cellY+1))
            }
        }

        return filledimage

    }
}