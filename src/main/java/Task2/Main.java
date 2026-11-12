
package Task2;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creating Bank Transfer...");

        BankTransfer transfer = new BankTransfer(
                "Account101",
                "Account202",
                new BigDecimal("-500")
        );

        System.out.println("Transfer created successfully!");
        System.out.println(transfer);
    }
}
