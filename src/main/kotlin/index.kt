import react.dom.render
import kotlinx.browser.document
import react.redux.provider
import reducers.State
import reducers.rootReducer
import redux.createStore
import redux.rEnhancer

val store = createStore(::rootReducer, State(), rEnhancer())

fun main() {
    val rootDiv = document.getElementById("root")!!
    render(rootDiv) {
        provider(store) {
            app()
        }
    }
}
