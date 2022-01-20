package reducers

import actions.FilterTodo
import models.TodoFilterKind
import redux.RAction

fun filter(state: TodoFilterKind = TodoFilterKind.SHOW_ALL, action: RAction): TodoFilterKind {
    return when (action) {
        is FilterTodo -> action.filter
        else -> state
    }
}
