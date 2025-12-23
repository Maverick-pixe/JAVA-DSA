abstract class PaymentMethods {
abstract void Upi();
abstract void Card();
}
class UPI extends PaymentMethods{
    void Upi(){
        System.out.println(" Payemnt Via Upi ");
    }

    @Override
    void Card() {
        System.out.println(" Payment Via Card ");
    }
}