package ru.itpark;

import static org.junit.jupiter.api.Assertions.*;

class CreditServiceTest {

    @org.junit.jupiter.api.Test
    void calculateCredit() {

        {
            CreditService service = new CreditService();

            double paySum = service.calculateCredit(100_000,12, 10);
            assertEquals(8792, paySum);
        }

        {
            CreditService service = new CreditService();

            double paySum = service.calculateCredit(0,12, 10);
            assertEquals(0, paySum);
        }
        {
            CreditService service = new CreditService();

            double paySum = service.calculateCredit(100_000,20, 20);
            assertEquals(5921, paySum);
        }

        {
            CreditService service = new CreditService();

            double paySum = service.calculateCredit(100_000,6, 10);
            assertEquals(17156, paySum);
        }

        {
            CreditService service = new CreditService();

            double paySum = service.calculateCredit(100_000,3, 10);
            assertEquals(33890, paySum);
        }

//        {
//            CreditService service = new CreditService();
//
//            double paySum = service.calculateCredit(100_000,1, 10);
//            assertEquals(100822, paySum);
//        }






    }
}