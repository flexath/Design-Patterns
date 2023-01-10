package bar

class ProgressBar : UIBar {
    private val currentProgressValue = 10
    override fun onProgressChanged() {
        println("Current changed value of ProgressBar is $currentProgressValue")
    }

    override fun onProgressUnChanged() {
        println("Original unchanged value of ProgressBar is $currentProgressValue")
    }
}