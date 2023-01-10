package payment_methods

interface PaymentStrategy {
    fun collectPaymentDetails()
    fun validatePaymentDetails():Boolean
    fun pay(amount: Int)
}