package sol

import kotlin.math.abs

class Day01(private val input: List<String>) {

    private fun createLists() : Pair<List<Int>, List<Int>> {
        val list1: MutableList<Int> = arrayListOf()
        val list2: MutableList<Int> = arrayListOf()
        for (i in input){
            val pair = i.split("   ")
            list1.add(pair[0].toInt())
            list2.add(pair[1].toInt())
        }
        list1.sort()
        list2.sort()

        return Pair(list1, list2)
    }

    fun solvePart1(): Int {

        val lists = createLists()
        val list1 = lists.first
        val list2 = lists.second

        var sum = 0

        for (i in list1.indices) {
            sum += abs(list1[i] - list2[i])
        }
        return sum
    }

    fun solvePart2(): Int {
        val lists = createLists()
        val list1 = lists.first
        val list2 = lists.second

        var totalSimilarityScore = 0

        for (i in list1.indices) {
            var dupCount = 0
            for (j in list2.indices){
                var list2Pointer = j
                if (list1[i] == list2[j]){
                    while (list1[i] == list2[list2Pointer]){
                        dupCount += 1
                        list2Pointer += 1
                    }
                    break
                }
            }
            totalSimilarityScore += list1[i] * dupCount
        }
        return totalSimilarityScore
    }
}