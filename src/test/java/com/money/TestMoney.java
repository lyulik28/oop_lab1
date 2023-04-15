package com.money;

import org.example.Money;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class TestMoney {
    Money m1;
    Money m2;
    Money expected;
    Money result;

    /*
    @BeforeClass виконується один раз перед тестуванням класу
    й методи з данною анотацією повинні бути статичними

     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /*
    @AfterClass виконується після усіх тестів класу
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
    /*
    Анотацією @Before вказується метод,
     що повинен виконуватись перед кожним тестом
     Даний метод створює об'єкти класу Money.
     Один з них - expected вподальшому буде порівнюватись
     із результатом - result
    */
    @Before
    public void setUp() throws Exception {
        m1 = new Money(12, "USD");
        m2 = new Money(14, "USD");
        expected = new Money(26, "USD");
        result = m1.add(m2);
    }

    /*
    @After - виконується після кожного тесту
     */
    @After
    public void tearDown() throws Exception {
    }

    /*
    @Test анотація вказує, що метод є тестом й дозволяє його запустити

    assertEquals("Error", expected, result) не проходить тест,
    тому що перевірка відбувається завдяки методу equals(),
    який визначен для класу Об'єкт й порівнює об'єкти завдяки "=="
    , тобто перевіряє посилання на ці об'єкти
    => в нашому випадку = false

    Тому для класу Money потрібно перевизначити метод equals()
     */
    @Test
    public void testAdd() {
        assertEquals("Error", expected, result);
    }
}
