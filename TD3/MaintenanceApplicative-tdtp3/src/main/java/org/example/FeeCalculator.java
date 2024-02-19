package org.example;

import java.util.List;

public class FeeCalculator {


    private static List<FeeStrategy>strategies = List.of(
            new ChildFeeStrategy();
            new AdultFeeStrategy();
    )

    public static double calculateFee(Visitor visitor, TicketType ticketType) {
        double fee = 0;

        // calculate price for adults
        if (visitor.getAge() > 14) {
            fee = new AdultFeeStrategy().calculateAdultFee(ticketType);
        }

        // calculate price for children
        if (visitor.getAge() <= 14) {
            fee = new ChildFeeStrategy().calculateChildFee(ticketType);
        }
        return fee;
    }

}
