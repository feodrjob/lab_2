package org.example.money;

public class FinanceReportProcessor {
    public static FinanceReport getSceondnamesForFirstChar(FinanceReport report, char someChars){
        Payment[] payments = new Payment[report.getQuantityPayments()];
         int j = 0;

         for (int i =0; i < report.getQuantityPayments();i++){
             if (report.getPayment(i).getFio().charAt(0) == someChars){
                 payments[j] = report.getPayment(i);
             }
         }
         return new FinanceReport(payments,"Балтийский Дмитрий Главдиректорович","26.11.24");
    }

}
