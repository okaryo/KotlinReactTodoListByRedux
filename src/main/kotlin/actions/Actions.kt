package actions

import models.TodoFilterKind
import models.TodoId
import redux.RAction

class AddTodo(val title: String): RAction {
    val id = TodoId(hashCode())
}

class UpdateTodo(val id: TodoId, val newTitle: String): RAction

class DeleteTodo(val id: TodoId): RAction

class ToggleTodo(val id: TodoId): RAction

class FilterTodo(val filter: TodoFilterKind): RAction
