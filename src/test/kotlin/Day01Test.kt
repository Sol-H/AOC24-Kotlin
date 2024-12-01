package sol

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class Day01Test {

        @Test
        fun `example part 1`() {
            val input = Resources.resourceAsListOfString("day01-example.txt")
            val day01 = Day01(input)

            assertEquals(11, day01.solvePart1())
        }

        @Test
        fun `part 1`() {
            val input = Resources.resourceAsListOfString("day01.txt")
            val day01 = Day01(input)
            println(day01.solvePart1())

            assertEquals(day01.solvePart1(), day01.solvePart1())
        }

        @Test
        fun `part 2`() {
            val input = Resources.resourceAsListOfString("day01.txt")
            val day01 = Day01(input)
            assertEquals(2, day01.solvePart2())
        }
}