package button

class NormalButton : UIButton {
    private val text:String = "Normal Button"
    private val textColor:String = "black"

    override fun onClickButton() {
        println("Clicking once on  normal button with $textColor color")
    }

    override fun onLongClickButton() {
        println("Clicking long press on  normal button with $textColor color")
    }

}