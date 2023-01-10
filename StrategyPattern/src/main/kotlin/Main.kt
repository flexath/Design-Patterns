import payment_methods.PaymentByCreditCard
import payment_methods.PaymentByPayPal

fun main(args: Array<String>) {
    val payment = PaymentService()
    payment.processOrder(PaymentByCreditCard())
    payment.processOrder(PaymentByPayPal())
}