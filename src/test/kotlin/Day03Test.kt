package sol

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class Day03Test {

        @Test
        fun `example part 1`() {
            val input = Resources.resourceAsString("day03-example.txt")
            val day03 = Day03(input)

            assertEquals(161, day03.solvePart1())
        }

        @Test
        fun `part 1`() {
            val input = Resources.resourceAsString("day03.txt")
            val day03 = Day03(input)
            println("Part 1 Answer: " + day03.solvePart1())

            assertEquals(174960292, day03.solvePart1())
        }

        @Test
        fun `example part 2`() {
            val input = Resources.resourceAsString("day03-example-2.txt")
            val day03 = Day03(input)
            assertEquals(48, day03.solvePart2())
        }

        @Test
        fun `part 2`() {
            val input = Resources.resourceAsString("day03.txt")
            val day03 = Day03(input)
            println("Part 2 Answer: " + day03.solvePart2())
            assertEquals(56275602, day03.solvePart2())
        }
}