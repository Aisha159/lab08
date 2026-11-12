
package Task2;

import java.math.BigDecimal;
import java.util.Objects;

public record BankTransfer(
        String fromAccount,
        String toAccount,
        BigDecimal amount) {

    public BankTransfer {

        Objects.requireNonNull(fromAccount, "From account cannot be null");

        Objects.requireNonNull(toAccount, "To account cannot be null");

        Objects.requireNonNull(amount, "Amount cannot be null");

        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException(
                    "Amount must be strictly positive");
        }
    }
}
