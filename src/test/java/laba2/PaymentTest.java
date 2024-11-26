package laba2;

import org.example.money.Payment;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentTest {
    @Test
    public void SetOrGetInformation(){
        Payment payment = new Payment("Зубенко Михаил Петрович",19,3,2024,7952);
        Assertions.assertEquals("Зубенко Михаил Петрович", payment.getFio());
        payment.setSumPay(895095587);
        Assertions.assertEquals(895095587,payment.getSumPay());
        Assertions.assertEquals(3,payment.getMonth());
        Assertions.assertEquals(2024,payment.getYear());
    }
    @Test
    public void equals(){
        Payment p1 = new Payment("Балтийский Дмитрий Программистович",1,2,2004,132);
        Payment p2 = new Payment("Балтийский Дмитрий Программистович",1,2,2004,132);
        Assertions.assertEquals(p1,p2);
    }
    @Test
    public void notEquals(){
        Payment p1 = new Payment("Балтийский Дмитрий Программистович",1,2,2004,132);
        Payment p2 = new Payment("Балтийский Дмитрий Тиньковович",1,2,2004,132);
        Assertions.assertNotEquals(p1,p2);
    }

    @Test
    public void toStringTest(){
        Payment payment2= new Payment("Балтийский Дмитрий Программистович",1,2,2004,7952);
        Assertions.assertEquals("Палтильщик: Балтийский Дмитрий Программистович, дата: 1.2.2004 сумма: 79 руб. 52 коп.",payment2.toString());
    }



}
