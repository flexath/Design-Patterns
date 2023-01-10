package payment_methods

class PaymentByPayPal : PaymentStrategy {
    private var email:String = ""
    private var password:String = ""

    override fun collectPaymentDetails() {
        email = "..."
        password = "..."
    }

    override fun validatePaymentDetails(): Boolean {
        return true
    }

    override fun pay(amount: Int) {
        println("Paying $amount using Paypal")
    }
}