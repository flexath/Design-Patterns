package factories

import bar.ProgressBar
import bar.SeekBar
import bar.UIBar
import button.UIButton
import button.ChipButton
import button.NormalButton
import button.RadioButton
import client.UIControl

class UIButtonFactory : UIControl() {
    override fun createUIButton(buttonType: String): UIButton {
        val uiButton = when(buttonType) {
            "normal" -> NormalButton()
            "radio" -> RadioButton()
            else -> ChipButton()
        }
        return uiButton
    }

    override fun createUIBar(barType: String): UIBar {
        val uiBar = when(barType) {
            "progress" -> ProgressBar()
            else -> SeekBar()
        }
        return uiBar
    }
}