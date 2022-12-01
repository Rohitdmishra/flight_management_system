package com.org.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class PassengerTest {
    /**
     * Method under test: {@link Passenger#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new Passenger()).canEqual("Other"));
    }

    /**
     * Method under test: {@link Passenger#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        Passenger passenger = new Passenger();

        Passenger passenger1 = new Passenger();
        passenger1.setLuggage(3);
        passenger1.setPassengerAge(3);
        passenger1.setPassengerName("Passenger Name");
        passenger1.setPassengerUIN(BigInteger.valueOf(42L));
        passenger1.setPnrNumber(BigInteger.valueOf(42L));
        assertTrue(passenger.canEqual(passenger1));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Passenger#Passenger()}
     *   <li>{@link Passenger#setLuggage(int)}
     *   <li>{@link Passenger#setPassengerAge(int)}
     *   <li>{@link Passenger#setPassengerName(String)}
     *   <li>{@link Passenger#setPassengerUIN(BigInteger)}
     *   <li>{@link Passenger#setPnrNumber(BigInteger)}
     *   <li>{@link Passenger#toString()}
     *   <li>{@link Passenger#getLuggage()}
     *   <li>{@link Passenger#getPassengerAge()}
     *   <li>{@link Passenger#getPassengerName()}
     *   <li>{@link Passenger#getPassengerUIN()}
     *   <li>{@link Passenger#getPnrNumber()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Passenger actualPassenger = new Passenger();
        actualPassenger.setLuggage(1);
        actualPassenger.setPassengerAge(1);
        actualPassenger.setPassengerName("Passenger Name");
        BigInteger valueOfResult = BigInteger.valueOf(42L);
        actualPassenger.setPassengerUIN(valueOfResult);
        BigInteger valueOfResult1 = BigInteger.valueOf(42L);
        actualPassenger.setPnrNumber(valueOfResult1);
        String actualToStringResult = actualPassenger.toString();
        assertEquals(1, actualPassenger.getLuggage());
        assertEquals(1, actualPassenger.getPassengerAge());
        assertEquals("Passenger Name", actualPassenger.getPassengerName());
        BigInteger passengerUIN = actualPassenger.getPassengerUIN();
        assertSame(valueOfResult, passengerUIN);
        BigInteger pnrNumber = actualPassenger.getPnrNumber();
        assertEquals(pnrNumber, passengerUIN);
        assertSame(valueOfResult1, pnrNumber);
        assertEquals(valueOfResult, pnrNumber);
        assertEquals("Passenger(pnrNumber=42, passengerName=Passenger Name, passengerAge=1, passengerUIN=42, luggage=1)",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Passenger#Passenger(BigInteger, String, int, BigInteger, int)}
     *   <li>{@link Passenger#setLuggage(int)}
     *   <li>{@link Passenger#setPassengerAge(int)}
     *   <li>{@link Passenger#setPassengerName(String)}
     *   <li>{@link Passenger#setPassengerUIN(BigInteger)}
     *   <li>{@link Passenger#setPnrNumber(BigInteger)}
     *   <li>{@link Passenger#toString()}
     *   <li>{@link Passenger#getLuggage()}
     *   <li>{@link Passenger#getPassengerAge()}
     *   <li>{@link Passenger#getPassengerName()}
     *   <li>{@link Passenger#getPassengerUIN()}
     *   <li>{@link Passenger#getPnrNumber()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        BigInteger valueOfResult = BigInteger.valueOf(42L);
        BigInteger valueOfResult1 = BigInteger.valueOf(42L);
        Passenger actualPassenger = new Passenger(valueOfResult, "Passenger Name", 1, valueOfResult1, 1);
        actualPassenger.setLuggage(1);
        actualPassenger.setPassengerAge(1);
        actualPassenger.setPassengerName("Passenger Name");
        BigInteger valueOfResult2 = BigInteger.valueOf(42L);
        actualPassenger.setPassengerUIN(valueOfResult2);
        BigInteger valueOfResult3 = BigInteger.valueOf(42L);
        actualPassenger.setPnrNumber(valueOfResult3);
        String actualToStringResult = actualPassenger.toString();
        assertEquals(1, actualPassenger.getLuggage());
        assertEquals(1, actualPassenger.getPassengerAge());
        assertEquals("Passenger Name", actualPassenger.getPassengerName());
        BigInteger passengerUIN = actualPassenger.getPassengerUIN();
        assertSame(valueOfResult2, passengerUIN);
        assertEquals(valueOfResult, passengerUIN);
        assertEquals(valueOfResult1, passengerUIN);
        BigInteger pnrNumber = actualPassenger.getPnrNumber();
        assertEquals(pnrNumber, passengerUIN);
        assertSame(valueOfResult3, pnrNumber);
        assertEquals(valueOfResult, pnrNumber);
        assertEquals(valueOfResult1, pnrNumber);
        assertEquals(valueOfResult2, pnrNumber);
        assertEquals("Passenger(pnrNumber=42, passengerName=Passenger Name, passengerAge=1, passengerUIN=42, luggage=1)",
                actualToStringResult);
    }

    /**
     * Method under test: {@link Passenger#equals(Object)}
     */
    @Test
    void testEquals() {
        Passenger passenger = new Passenger();
        passenger.setLuggage(1);
        passenger.setPassengerAge(1);
        passenger.setPassengerName("Passenger Name");
        passenger.setPassengerUIN(BigInteger.valueOf(42L));
        passenger.setPnrNumber(BigInteger.valueOf(42L));
        assertNotEquals(passenger, null);
    }

    /**
     * Method under test: {@link Passenger#equals(Object)}
     */
    @Test
    void testEquals2() {
        Passenger passenger = new Passenger();
        passenger.setLuggage(1);
        passenger.setPassengerAge(1);
        passenger.setPassengerName("Passenger Name");
        passenger.setPassengerUIN(BigInteger.valueOf(42L));
        passenger.setPnrNumber(BigInteger.valueOf(42L));
        assertNotEquals(passenger, "Different type to Passenger");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Passenger#equals(Object)}
     *   <li>{@link Passenger#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Passenger passenger = new Passenger();
        passenger.setLuggage(1);
        passenger.setPassengerAge(1);
        passenger.setPassengerName("Passenger Name");
        passenger.setPassengerUIN(BigInteger.valueOf(42L));
        passenger.setPnrNumber(BigInteger.valueOf(42L));
        assertEquals(passenger, passenger);
        int expectedHashCodeResult = passenger.hashCode();
        assertEquals(expectedHashCodeResult, passenger.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Passenger#equals(Object)}
     *   <li>{@link Passenger#hashCode()}
     * </ul>
     */
    @Test
    void testEquals4() {
        Passenger passenger = new Passenger();
        passenger.setLuggage(1);
        passenger.setPassengerAge(1);
        passenger.setPassengerName("Passenger Name");
        passenger.setPassengerUIN(BigInteger.valueOf(42L));
        passenger.setPnrNumber(BigInteger.valueOf(42L));

        Passenger passenger1 = new Passenger();
        passenger1.setLuggage(1);
        passenger1.setPassengerAge(1);
        passenger1.setPassengerName("Passenger Name");
        passenger1.setPassengerUIN(BigInteger.valueOf(42L));
        passenger1.setPnrNumber(BigInteger.valueOf(42L));
        assertEquals(passenger, passenger1);
        int expectedHashCodeResult = passenger.hashCode();
        assertEquals(expectedHashCodeResult, passenger1.hashCode());
    }

    /**
     * Method under test: {@link Passenger#equals(Object)}
     */
    @Test
    void testEquals5() {
        Passenger passenger = new Passenger();
        passenger.setLuggage(3);
        passenger.setPassengerAge(1);
        passenger.setPassengerName("Passenger Name");
        passenger.setPassengerUIN(BigInteger.valueOf(42L));
        passenger.setPnrNumber(BigInteger.valueOf(42L));

        Passenger passenger1 = new Passenger();
        passenger1.setLuggage(1);
        passenger1.setPassengerAge(1);
        passenger1.setPassengerName("Passenger Name");
        passenger1.setPassengerUIN(BigInteger.valueOf(42L));
        passenger1.setPnrNumber(BigInteger.valueOf(42L));
        assertNotEquals(passenger, passenger1);
    }

    /**
     * Method under test: {@link Passenger#equals(Object)}
     */
    @Test
    void testEquals6() {
        Passenger passenger = new Passenger();
        passenger.setLuggage(1);
        passenger.setPassengerAge(3);
        passenger.setPassengerName("Passenger Name");
        passenger.setPassengerUIN(BigInteger.valueOf(42L));
        passenger.setPnrNumber(BigInteger.valueOf(42L));

        Passenger passenger1 = new Passenger();
        passenger1.setLuggage(1);
        passenger1.setPassengerAge(1);
        passenger1.setPassengerName("Passenger Name");
        passenger1.setPassengerUIN(BigInteger.valueOf(42L));
        passenger1.setPnrNumber(BigInteger.valueOf(42L));
        assertNotEquals(passenger, passenger1);
    }

    /**
     * Method under test: {@link Passenger#equals(Object)}
     */
    @Test
    void testEquals7() {
        Passenger passenger = new Passenger();
        passenger.setLuggage(1);
        passenger.setPassengerAge(1);
        passenger.setPassengerName(null);
        passenger.setPassengerUIN(BigInteger.valueOf(42L));
        passenger.setPnrNumber(BigInteger.valueOf(42L));

        Passenger passenger1 = new Passenger();
        passenger1.setLuggage(1);
        passenger1.setPassengerAge(1);
        passenger1.setPassengerName("Passenger Name");
        passenger1.setPassengerUIN(BigInteger.valueOf(42L));
        passenger1.setPnrNumber(BigInteger.valueOf(42L));
        assertNotEquals(passenger, passenger1);
    }

    /**
     * Method under test: {@link Passenger#equals(Object)}
     */
    @Test
    void testEquals8() {
        Passenger passenger = new Passenger();
        passenger.setLuggage(1);
        passenger.setPassengerAge(1);
        passenger.setPassengerName("com.org.model.Passenger");
        passenger.setPassengerUIN(BigInteger.valueOf(42L));
        passenger.setPnrNumber(BigInteger.valueOf(42L));

        Passenger passenger1 = new Passenger();
        passenger1.setLuggage(1);
        passenger1.setPassengerAge(1);
        passenger1.setPassengerName("Passenger Name");
        passenger1.setPassengerUIN(BigInteger.valueOf(42L));
        passenger1.setPnrNumber(BigInteger.valueOf(42L));
        assertNotEquals(passenger, passenger1);
    }

    /**
     * Method under test: {@link Passenger#equals(Object)}
     */
    @Test
    void testEquals9() {
        Passenger passenger = new Passenger();
        passenger.setLuggage(1);
        passenger.setPassengerAge(1);
        passenger.setPassengerName("Passenger Name");
        passenger.setPassengerUIN(BigInteger.valueOf(1L));
        passenger.setPnrNumber(BigInteger.valueOf(42L));

        Passenger passenger1 = new Passenger();
        passenger1.setLuggage(1);
        passenger1.setPassengerAge(1);
        passenger1.setPassengerName("Passenger Name");
        passenger1.setPassengerUIN(BigInteger.valueOf(42L));
        passenger1.setPnrNumber(BigInteger.valueOf(42L));
        assertNotEquals(passenger, passenger1);
    }

    /**
     * Method under test: {@link Passenger#equals(Object)}
     */
    @Test
    void testEquals10() {
        Passenger passenger = new Passenger();
        passenger.setLuggage(1);
        passenger.setPassengerAge(1);
        passenger.setPassengerName("Passenger Name");
        passenger.setPassengerUIN(null);
        passenger.setPnrNumber(BigInteger.valueOf(42L));

        Passenger passenger1 = new Passenger();
        passenger1.setLuggage(1);
        passenger1.setPassengerAge(1);
        passenger1.setPassengerName("Passenger Name");
        passenger1.setPassengerUIN(BigInteger.valueOf(42L));
        passenger1.setPnrNumber(BigInteger.valueOf(42L));
        assertNotEquals(passenger, passenger1);
    }

    /**
     * Method under test: {@link Passenger#equals(Object)}
     */
    @Test
    void testEquals11() {
        Passenger passenger = new Passenger();
        passenger.setLuggage(1);
        passenger.setPassengerAge(1);
        passenger.setPassengerName("Passenger Name");
        passenger.setPassengerUIN(BigInteger.valueOf(42L));
        passenger.setPnrNumber(BigInteger.valueOf(1L));

        Passenger passenger1 = new Passenger();
        passenger1.setLuggage(1);
        passenger1.setPassengerAge(1);
        passenger1.setPassengerName("Passenger Name");
        passenger1.setPassengerUIN(BigInteger.valueOf(42L));
        passenger1.setPnrNumber(BigInteger.valueOf(42L));
        assertNotEquals(passenger, passenger1);
    }

    /**
     * Method under test: {@link Passenger#equals(Object)}
     */
    @Test
    void testEquals12() {
        Passenger passenger = new Passenger();
        passenger.setLuggage(1);
        passenger.setPassengerAge(1);
        passenger.setPassengerName("Passenger Name");
        passenger.setPassengerUIN(BigInteger.valueOf(42L));
        passenger.setPnrNumber(null);

        Passenger passenger1 = new Passenger();
        passenger1.setLuggage(1);
        passenger1.setPassengerAge(1);
        passenger1.setPassengerName("Passenger Name");
        passenger1.setPassengerUIN(BigInteger.valueOf(42L));
        passenger1.setPnrNumber(BigInteger.valueOf(42L));
        assertNotEquals(passenger, passenger1);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Passenger#equals(Object)}
     *   <li>{@link Passenger#hashCode()}
     * </ul>
     */
    @Test
    void testEquals13() {
        Passenger passenger = new Passenger();
        passenger.setLuggage(1);
        passenger.setPassengerAge(1);
        passenger.setPassengerName(null);
        passenger.setPassengerUIN(BigInteger.valueOf(42L));
        passenger.setPnrNumber(BigInteger.valueOf(42L));

        Passenger passenger1 = new Passenger();
        passenger1.setLuggage(1);
        passenger1.setPassengerAge(1);
        passenger1.setPassengerName(null);
        passenger1.setPassengerUIN(BigInteger.valueOf(42L));
        passenger1.setPnrNumber(BigInteger.valueOf(42L));
        assertEquals(passenger, passenger1);
        int expectedHashCodeResult = passenger.hashCode();
        assertEquals(expectedHashCodeResult, passenger1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Passenger#equals(Object)}
     *   <li>{@link Passenger#hashCode()}
     * </ul>
     */
    @Test
    void testEquals14() {
        Passenger passenger = new Passenger();
        passenger.setLuggage(1);
        passenger.setPassengerAge(1);
        passenger.setPassengerName("Passenger Name");
        passenger.setPassengerUIN(null);
        passenger.setPnrNumber(BigInteger.valueOf(42L));

        Passenger passenger1 = new Passenger();
        passenger1.setLuggage(1);
        passenger1.setPassengerAge(1);
        passenger1.setPassengerName("Passenger Name");
        passenger1.setPassengerUIN(null);
        passenger1.setPnrNumber(BigInteger.valueOf(42L));
        assertEquals(passenger, passenger1);
        int expectedHashCodeResult = passenger.hashCode();
        assertEquals(expectedHashCodeResult, passenger1.hashCode());
    }
}

