package button

class RadioButton : UIButton {
    private val text:String = "Radio Button"
    private val textColor:String = "black"

    override fun onClickButton() {
        println("Clicking once on  radio button with $textColor color")
    }

    override fun onLongClickButton() {
        println("Clicking long press on  radio button with $textColor color")
    }

}