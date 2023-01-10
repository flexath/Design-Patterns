import button.UIButton
import factories.UIButtonFactory

fun main() {
    val buttonFactory = UIButtonFactory()
    val button: UIButton = buttonFactory.createUIButton("normal")
    button.onClickButton()
}