package sol

import kotlin.math.abs

class Day01(private val input: List<String>) {

    fun solvePart1(): Int {
        val list1: MutableList<Int> = arrayListOf()
        val list2: MutableList<Int> = arrayListOf()
        for (i in input){
            val pair = i.split("   ")
            list1.add(pair[0].toInt())
            list2.add(pair[1].toInt())
        }
        list1.sort()
        list2.sort()

        var sum: Int = 0

        for (i in 0..<list1.size){
            sum += abs(list1[i] - list2[i])
        }
        return sum
    }

    fun solvePart2(): Int = 2
}