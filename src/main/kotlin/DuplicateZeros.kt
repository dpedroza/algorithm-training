class DuplicateZeros {

    fun duplicateZeros(arr: IntArray) {
        var i = 0
        while (i < arr.size) {
            val num = arr[i]
            if (num == 0) {
                move(arr, i, num)
                i++
            }
            i++
        }
    }

    private fun move(arr: IntArray, i: Int, value: Int) {
        var temp = arr[i]
        arr[i] = value
        for (j in i until arr.size) {
            val aux = arr[j]
            arr[j] = temp
            temp = aux
        }
    }
}
