package models

import kotlin.test.Test
import kotlin.test.assertEquals

class TodoTest {
    @Test
    fun toggle_active_todo() {
        val expected = Todo(TodoId(1), "title", true)
        val actual = Todo(TodoId(1), "title", false).toggle()
        assertEquals(expected, actual)
    }

    @Test
    fun toggle_completed_todo() {
        val expected = Todo(TodoId(1), "title", false)
        val actual = Todo(TodoId(1), "title", true).toggle()
        assertEquals(expected, actual)
    }
}
