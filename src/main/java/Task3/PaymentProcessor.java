
package Task3;

public class PaymentProcessor {

    public void charge(String txId, double amount) {

        try {

            System.out.println(
                "[TraceID: " + txId + "] Processing payment..."
            );

            System.out.println("Payment Amount: " + amount);

        } finally {

            System.out.println("Context Cleared");
        }
    }
}
