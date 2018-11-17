package ru.itpark;



    public class CreditService {
        public double calculateCredit(double creditSum, double creditPeriod, double creditRate) {


//            double creditPeriodMin = -1 * creditPeriod; первый вариант формулы
            double monthSum = creditRate/100/12;

//            double pay = creditSum * (monthSum / (1 - Math.pow((1 + monthSum), creditPeriodMin))); первый вариант формулы

            double pay = creditSum * (monthSum + (monthSum /(Math.pow((1 + monthSum), creditPeriod) - 1)));
//            return creditPeriod * Math.round(pay); выплаты за весь период не сходятся
            return Math.round(pay);



        }

    }



