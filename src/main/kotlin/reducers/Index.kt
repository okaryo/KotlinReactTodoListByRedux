package reducers

import models.TodoFilterKind
import models.Todos
import redux.RAction

data class State(
    val todos: Todos = Todos(),
    val filter: TodoFilterKind = TodoFilterKind.SHOW_ALL
)

fun rootReducer(
    state: State,
    action: RAction
) = State(
    todos(state.todos, action),
    filter(state.filter, action)
)

