package org.example.javamvnhw6.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MoneyServiceTest {

    @Test
    public void MoneyService() {
        MoneyService service = new MoneyService();

        int count = 0;
        int money = 0;
        int income = 100_000; //доходы
        int expenses = 60_000; //расходы
        int threshold = 150_000; //предел
        int expected = 2;

        //вызываем целевой метод
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);


    }

}
