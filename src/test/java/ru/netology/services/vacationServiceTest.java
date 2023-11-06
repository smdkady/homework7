package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class vacationServiceTest {
    @Test
    public void testFreelance1() {
        vacationService service = new vacationService();
        int actual = service.calculate(10000, 3000, 20000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testFreelance2() {
        vacationService service = new vacationService();
        int actual = service.calculate(100_000, 60000, 150_000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}