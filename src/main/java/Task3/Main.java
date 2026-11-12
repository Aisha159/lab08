
package Task3;

public class Main {

    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        processor.charge("TXN-101", 5000.00);

        System.out.println("----------------");

        processor.charge("TXN-102", 2500.00);
    }
}
