import payment_methods.PaymentStrategy

class PaymentService {
    private var cost:Int = 0
    private var includeDelivery:Boolean = false

    fun processOrder(paymentStrategy:PaymentStrategy) {
        paymentStrategy.collectPaymentDetails()
        if(paymentStrategy.validatePaymentDetails()) {
            paymentStrategy.pay(1500)
        }else{
            paymentStrategy.pay(0)
        }
    }
}