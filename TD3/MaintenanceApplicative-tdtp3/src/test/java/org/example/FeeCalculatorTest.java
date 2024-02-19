package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.jupiter.api.Assertions.*;


class FeeCalculatorTest {

    @Test
    public void test_calculateFee_when_adult_and_halfDay() {
        //GIVEN
        double fee = 0;
        Visitor visitor = new Visitor(20);
        TicketType ticketType = TicketType.HALF_DAY;
        FeeCalculator feeCalculator = new FeeCalculator();

        //WHEN
        fee = feeCalculator.calculateFee(visitor, ticketType);

        //THEN
        //fais un assertequals pour vérifier que le prix est correct, sinon il renvoie une erreur
        assertEquals(60 , fee, "The fee is not correct");
    }

    @Test
    public void test_calculateFee_when_adult_and_fullDay() {
        //GIVEN
        Visitor visitor = new Visitor(20);
        TicketType ticketType = TicketType.FULL_DAY;
        FeeCalculator feeCalculator = new FeeCalculator();

        //WHEN
        double fee = feeCalculator.calculateFee(visitor, ticketType);

        //THEN
        assertEquals(120 , fee, "The fee is not correct");
    }

    @Test
    public void test_calculateFee_when_child_and_halfDay() {
        //GIVEN
        Visitor visitor = new Visitor(10);
        TicketType ticketType = TicketType.HALF_DAY;
        FeeCalculator feeCalculator = new FeeCalculator();

        //WHEN
        double fee = feeCalculator.calculateFee(visitor, ticketType);

        //THEN
        assertEquals(20 , fee, "The fee is not correct");
    }

    @Test
    public void test_calculateFee_when_child_and_fullDay() {
        //GIVEN
        Visitor visitor = new Visitor(10);
        TicketType ticketType = TicketType.FULL_DAY;
        FeeCalculator feeCalculator = new FeeCalculator();

        //WHEN
        double fee = feeCalculator.calculateFee(visitor, ticketType);

        //THEN
        assertEquals(50 , fee, "The fee is not correct");
    }

    @Test
    public void test_ChildFeeStrategy_erreur_type_Ticket(){
        Visitor visitor = new Visitor(10);

        Throwable thrown = catchThrowable(() -> {
            double actualFee =FeeCalculator.calculateFee(visitor,TicketType.WEEK);
        });
        assertThat(thrown).isInstanceOf(RuntimeException.class).hasMessage("Ticket type is not supported");
    }

}