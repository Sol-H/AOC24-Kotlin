package sol

import kotlin.math.abs

class Day02(private val input: List<String>) {

    private fun isReportSafe( report: List<Int>): Boolean {
        val ascReport = report.sorted()
        val descReport = ascReport.reversed()

        var reportIsSafe = true

        if (report == ascReport || report == descReport){
            var levelIndex = 0
            for (j in report.indices) {
                if (j == 0) {
                    continue
                }
                //     Checks current level against previous level
                val prevLevel = report[levelIndex]
                val currentLevel = report[j]
                if (abs(currentLevel - prevLevel) > 3 || abs(currentLevel - prevLevel) < 1){
                    reportIsSafe = false
                    levelIndex += 1
                }
                else {
                    levelIndex += 1
                }
            }
        }
        else {
            reportIsSafe = false
        }
        return reportIsSafe
    }

    fun solvePart1(): Int {
        var safeCount = 0

        for (i in input){
            val report: List<Int> = i.split(' ').map { it.toInt() }

            if (isReportSafe(report)){
                safeCount += 1
            }
        }

        return safeCount
    }

    private fun problemDampener(report: List<Int>): List<Int> {
        if (isReportSafe(report)) {
            return report
        }

        for (j in report.indices) {
            val tempReport = report.toMutableList()
            tempReport.removeAt(j)
            if (isReportSafe(tempReport)) {
                return tempReport
            }
        }
        return report
    }

    fun solvePart2(): Int {
        var safeCount = 0

        for (i in input){
            val report: List<Int> = i.split(' ').map { it.toInt() }

            if (isReportSafe(report)){
                println("Report: $report is safe")
                safeCount += 1
            }
            else {
                val dampenedReport = problemDampener(report)
                if (isReportSafe(dampenedReport)){
                    println("Dampened report: $dampenedReport is safe")
                    safeCount += 1
                }

            }
        }

        return safeCount
    }
}