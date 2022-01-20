package models

data class Todos(private val values: List<Todo> = listOf()) {
    companion object {
        fun empty() = Todos(emptyList())
    }

    fun add(todo: Todo): Todos {
        val newValues = listOf(*(values.toTypedArray()), todo)
        return Todos(newValues)
    }

    fun update(id: TodoId, newTitle: String): Todos {
        val newValues = values.map { if (it.id == id) it.copy(title = newTitle) else it }
        return Todos(newValues)
    }

    fun delete(id: TodoId): Todos {
        val newValues = values.filterNot { it.id == id }
        return Todos(newValues)
    }

    fun toggle(id: TodoId): Todos {
        val newValues = values.map { if (it.id == id) it.toggle() else it }
        return Todos(newValues)
    }
}
