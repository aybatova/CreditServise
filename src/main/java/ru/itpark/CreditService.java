package ru.itpark;



    public class CreditService {
        public double calculateCredit(double creditSum, double creditPeriod, double creditRate) {



            double monthSum = creditRate/100/12;



            double pay = creditSum * (monthSum + (monthSum /(Math.pow((1 + monthSum), creditPeriod) - 1)));

            return Math.round(pay);



        }

    }



