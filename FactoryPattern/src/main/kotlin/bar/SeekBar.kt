package bar

class SeekBar : UIBar {
    private val currentProgressValue = 20
    override fun onProgressChanged() {
        println("Current progress value of SeekBar is $currentProgressValue")
    }

    override fun onProgressUnChanged() {
        println("Current progress value of SeekBar is $currentProgressValue")
    }
}