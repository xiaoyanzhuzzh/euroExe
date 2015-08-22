package com.euro;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EuroTest {
    @Test
    public void shouldKnowTwoCurrencyValuesAreEqual() {
        Euro euro1 = new Euro(10);
        Euro euro2 = new Euro(10);
        assertEquals(euro1, euro2);
    }

    @Test
    public void shouldKnowTwoCurrencyValuesAreNotEqual() {
        Euro euro1 = new Euro(10);
        Euro euro2 = new Euro(5);
        assertNotEquals(euro1, euro2);
    }

    @Test
    public void shouldKnowCurrencyValuesAreNotEqualsToNUll() {
        Euro euro1 = new Euro(10);
        assertNotEquals(euro1, null);
    }

    @Test
    public void shouldKnowCurrencyValuesAreNotEqualsToDifferentObject() {
        Euro euro1 = new Euro(10);
        assertNotEquals(euro1, new Object());
    }

    @Test
    public void shouldKnowCurrencyValuesAreEqualsToTwoDifferentEuroOfEqualSum() {
        Euro euro1 = new Euro(10);
        assertEquals(euro1, new Euro(7).add(new Euro(3)));
    }

    @Test
    public void shouldKnowCurrencyValuesAreNotEqualsToTwoDifferentEuroOfEqualSum() {
        Euro euro1 = new Euro(10);
        assertNotEquals(euro1, new Euro(5).add(new Euro(2)));
    }

    @Test
    public void shouldKnowEuroValuesAreEqualsToDollarValues() {
        Euro euro1 = new Euro(10);
        assertEquals(euro1, new Dollar(13.5));
    }

    @Test
    public void shouldKnowEuroValuesAreNotEqualsToDollarValues() {
        Euro euro1 = new Euro(10);
        assertNotEquals(euro1, new Dollar(11.5));
    }

}
