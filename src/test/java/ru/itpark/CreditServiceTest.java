package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditServiceTest {

    @Test
    void calculateCredit() {

        {
            CreditService service = new CreditService();

            double paySum = service.calculateCredit(100_000,12, 10);
            assertEquals(8_792, paySum);
        }

        {
            CreditService service = new CreditService();

            double paySum = service.calculateCredit(0,12, 10);
            assertEquals(0, paySum);
        }
        {
            CreditService service = new CreditService();

            double paySum = service.calculateCredit(100_000,20, 20);
            assertEquals(5_921, paySum);
        }

        {
            CreditService service = new CreditService();

            double paySum = service.calculateCredit(100_000,6, 10);
            assertEquals(17_156, paySum);
        }

        {
            CreditService service = new CreditService();

            double paySum = service.calculateCredit(100_000,3, 10);
            assertEquals(33_890, paySum);
        }


    }
}