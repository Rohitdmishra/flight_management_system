package com.org.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class BookingTest {
    /**
     * Method under test: {@link Booking#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new Booking()).canEqual("Other"));
    }

    /**
     * Method under test: {@link Booking#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        Booking booking = new Booking();

        Booking booking1 = new Booking();
        booking1.setBookingDate("2020-03-01");
        booking1.setBookingId(BigInteger.valueOf(42L));
        booking1.setNoOfPassengers(3);
        assertTrue(booking.canEqual(booking1));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Booking#Booking()}
     *   <li>{@link Booking#setBookingDate(String)}
     *   <li>{@link Booking#setBookingId(BigInteger)}
     *   <li>{@link Booking#setNoOfPassengers(int)}
     *   <li>{@link Booking#toString()}
     *   <li>{@link Booking#getBookingDate()}
     *   <li>{@link Booking#getBookingId()}
     *   <li>{@link Booking#getNoOfPassengers()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Booking actualBooking = new Booking();
        actualBooking.setBookingDate("2020-03-01");
        BigInteger valueOfResult = BigInteger.valueOf(42L);
        actualBooking.setBookingId(valueOfResult);
        actualBooking.setNoOfPassengers(1);
        String actualToStringResult = actualBooking.toString();
        assertEquals("2020-03-01", actualBooking.getBookingDate());
        assertSame(valueOfResult, actualBooking.getBookingId());
        assertEquals(1, actualBooking.getNoOfPassengers());
        assertEquals("Booking(bookingId=42, bookingDate=2020-03-01, noOfPassengers=1)", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Booking#Booking(BigInteger, String, int)}
     *   <li>{@link Booking#setBookingDate(String)}
     *   <li>{@link Booking#setBookingId(BigInteger)}
     *   <li>{@link Booking#setNoOfPassengers(int)}
     *   <li>{@link Booking#toString()}
     *   <li>{@link Booking#getBookingDate()}
     *   <li>{@link Booking#getBookingId()}
     *   <li>{@link Booking#getNoOfPassengers()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        BigInteger valueOfResult = BigInteger.valueOf(42L);
        Booking actualBooking = new Booking(valueOfResult, "2020-03-01", 1);
        actualBooking.setBookingDate("2020-03-01");
        BigInteger valueOfResult1 = BigInteger.valueOf(42L);
        actualBooking.setBookingId(valueOfResult1);
        actualBooking.setNoOfPassengers(1);
        String actualToStringResult = actualBooking.toString();
        assertEquals("2020-03-01", actualBooking.getBookingDate());
        BigInteger bookingId = actualBooking.getBookingId();
        assertSame(valueOfResult1, bookingId);
        assertEquals(valueOfResult, bookingId);
        assertEquals(1, actualBooking.getNoOfPassengers());
        assertEquals("Booking(bookingId=42, bookingDate=2020-03-01, noOfPassengers=1)", actualToStringResult);
    }

    /**
     * Method under test: {@link Booking#equals(Object)}
     */
    @Test
    void testEquals() {
        Booking booking = new Booking();
        booking.setBookingDate("2020-03-01");
        booking.setBookingId(BigInteger.valueOf(42L));
        booking.setNoOfPassengers(1);
        assertNotEquals(booking, null);
    }

    /**
     * Method under test: {@link Booking#equals(Object)}
     */
    @Test
    void testEquals2() {
        Booking booking = new Booking();
        booking.setBookingDate("2020-03-01");
        booking.setBookingId(BigInteger.valueOf(42L));
        booking.setNoOfPassengers(1);
        assertNotEquals(booking, "Different type to Booking");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Booking#equals(Object)}
     *   <li>{@link Booking#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Booking booking = new Booking();
        booking.setBookingDate("2020-03-01");
        booking.setBookingId(BigInteger.valueOf(42L));
        booking.setNoOfPassengers(1);
        assertEquals(booking, booking);
        int expectedHashCodeResult = booking.hashCode();
        assertEquals(expectedHashCodeResult, booking.hashCode());
    }

}

