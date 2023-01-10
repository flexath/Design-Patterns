package button

class ChipButton : UIButton{
    private val text:String = "Chip Button"
    private val textColor:String = "black"

    override fun onClickButton() {
        println("Clicking once on  chip button with $textColor color")
    }

    override fun onLongClickButton() {
        println("Clicking long press on  chip button with $textColor color")
    }

}