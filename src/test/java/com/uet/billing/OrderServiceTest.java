
package com.uet.billing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Test
    public void calculateTotal_appliesVipDiscount_withoutTouchingDatabase() {

        // Arrange
        VipDiscount vipDiscount = new VipDiscount();
        OrderService orderService = new OrderService(vipDiscount);

        double amount = 1000.0;

        // Act
        double result = orderService.calculateTotal(amount);

        // Assert
        assertEquals(800.0, result, 0.001);
    }
}
