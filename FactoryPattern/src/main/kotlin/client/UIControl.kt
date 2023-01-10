package client

import bar.UIBar
import button.UIButton

abstract class UIControl {
//    fun createUIComponents(component: String) : UIButton {
//        val uiButton:UIButton = createUIButton(component)
//        uiButton.onClickButton()
//        uiButton.onLongClickButton()
//        return uiButton
//    }

    abstract fun createUIButton(buttonType: String):UIButton
    abstract fun createUIBar(barType:String):UIBar
}