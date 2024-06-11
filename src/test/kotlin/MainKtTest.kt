import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun differenceOfBills1() {
        val bill = intArrayOf(2, 4, 6)
        val k = bill[2]
        val b = 6.0
        val expected = 3
        val result = differenceOfBills(bill, k, b)
        assertEquals(expected.toDouble(),result)
    }

    @Test
    fun differenceOfBills2() {
        val bill = intArrayOf(5,8,6,7)
        val k = bill[1]
        val b = 13.0
        val expected = 4
        val result = differenceOfBills(bill, k, b)
        assertEquals(expected.toDouble(),result)
    }

    @Test
    fun differenceOfBills3() {
        val bill = intArrayOf(10,5,16,3)
        val k = bill[2]
        val b = 9.0
        val expected = 0
        val result = differenceOfBills(bill, k, b)
        assertEquals(expected.toDouble(),result)
    }

    @Test
    fun differenceOfBills4() {
        val bill = intArrayOf(3, 10, 2, 9, 18, 25, 45)
        val k = bill[4]
        val b = 69.0
        val expected = 22
        val result = differenceOfBills(bill, k, b)
        assertEquals(expected.toDouble(),result)
    }
}