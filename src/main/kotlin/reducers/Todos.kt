package reducers

import actions.AddTodo
import actions.DeleteTodo
import actions.ToggleTodo
import actions.UpdateTodo
import models.Todo
import models.Todos
import redux.RAction

fun todos(state: Todos = Todos(), action: RAction): Todos {
    return when (action) {
        is AddTodo -> state.add(Todo(action.id, action.title, false))
        is UpdateTodo -> state.update(action.id, action.newTitle)
        is DeleteTodo -> state.delete(action.id)
        is ToggleTodo -> state.toggle(action.id)
        else -> state
    }
}
