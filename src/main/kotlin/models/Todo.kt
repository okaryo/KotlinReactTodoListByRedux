package models

data class Todo (val id: TodoId, val title: String, val completed: Boolean) {
    fun toggle() = Todo(id, title, !completed)
}
