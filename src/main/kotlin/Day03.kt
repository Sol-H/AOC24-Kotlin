package sol

class Day03(private val input: String) {
    private val numberRegex = "-?[0-9]+(\\.[0-9]+)?"
    private val paramRegex = ("$numberRegex,$numberRegex").toRegex()

    private fun checkMul(mul: String): Int{
        if (mul.contains(')') && mul.contains(',')) {
            val params = mul.split(')')[0]
            if (params.matches(paramRegex)) {
                val nums = params.split(',')
                val a = nums[0].toInt()
                val b = nums[1].toInt()
                return a * b
            }
        }
        return 0
    }

    fun solvePart1(): Int {
        val muls =  input.split("mul(")
        var total = 0
        for (mul in muls){
            total += checkMul(mul)
        }
        return total
    }

    fun solvePart2(): Int {
        val dos = input.split("do()").map {it.split("don't()")[0]}
        val muls = dos.joinToString("").split("mul(")
        var total = 0
        for (mul in muls){
            total += checkMul(mul)
        }
        return total
    }
}