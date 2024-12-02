package sol

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class Day02Test {

        @Test
        fun `example part 1`() {
            val input = Resources.resourceAsListOfString("day02-example.txt")
            val day02 = Day02(input)

            assertEquals(2, day02.solvePart1())
        }

        @Test
        fun `part 1`() {
            val input = Resources.resourceAsListOfString("day02.txt")
            val day02 = Day02(input)
            println("Part 1 Answer: " + day02.solvePart1())

            assertEquals(606, day02.solvePart1())
        }

        @Test
        fun `example part 2`() {
            val input = Resources.resourceAsListOfString("day02-example.txt")
            val day02 = Day02(input)
            assertEquals(4, day02.solvePart2())
        }

        @Test
        fun `part 2`() {
            val input = Resources.resourceAsListOfString("day02.txt")
            val day02 = Day02(input)
            println("Part 2 Answer: " + day02.solvePart2())
            assertEquals(644, day02.solvePart2())
        }
}