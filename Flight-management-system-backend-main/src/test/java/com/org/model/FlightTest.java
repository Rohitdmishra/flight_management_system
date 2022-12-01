package com.org.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class FlightTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Flight#Flight()}
     *   <li>{@link Flight#setCarrierName(String)}
     *   <li>{@link Flight#setFlightModel(String)}
     *   <li>{@link Flight#setFlightNo(BigInteger)}
     *   <li>{@link Flight#setSeatCapacity(int)}
     *   <li>{@link Flight#toString()}
     *   <li>{@link Flight#getCarrierName()}
     *   <li>{@link Flight#getFlightModel()}
     *   <li>{@link Flight#getFlightNo()}
     *   <li>{@link Flight#getSeatCapacity()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Flight actualFlight = new Flight();
        actualFlight.setCarrierName("Carrier Name");
        actualFlight.setFlightModel("Flight Model");
        BigInteger valueOfResult = BigInteger.valueOf(42L);
        actualFlight.setFlightNo(valueOfResult);
        actualFlight.setSeatCapacity(1);
        String actualToStringResult = actualFlight.toString();
        assertEquals("Carrier Name", actualFlight.getCarrierName());
        assertEquals("Flight Model", actualFlight.getFlightModel());
        assertSame(valueOfResult, actualFlight.getFlightNo());
        assertEquals(1, actualFlight.getSeatCapacity());
        assertEquals("Flight [flightNo=42,carrierName=Carrier Name,flightModel=Flight Model,seatCapacity=1]",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Flight#Flight(BigInteger, String, String, int)}
     *   <li>{@link Flight#setCarrierName(String)}
     *   <li>{@link Flight#setFlightModel(String)}
     *   <li>{@link Flight#setFlightNo(BigInteger)}
     *   <li>{@link Flight#setSeatCapacity(int)}
     *   <li>{@link Flight#toString()}
     *   <li>{@link Flight#getCarrierName()}
     *   <li>{@link Flight#getFlightModel()}
     *   <li>{@link Flight#getFlightNo()}
     *   <li>{@link Flight#getSeatCapacity()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        BigInteger valueOfResult = BigInteger.valueOf(42L);
        Flight actualFlight = new Flight(valueOfResult, "Carrier Name", "Flight Model", 1);
        actualFlight.setCarrierName("Carrier Name");
        actualFlight.setFlightModel("Flight Model");
        BigInteger valueOfResult1 = BigInteger.valueOf(42L);
        actualFlight.setFlightNo(valueOfResult1);
        actualFlight.setSeatCapacity(1);
        String actualToStringResult = actualFlight.toString();
        assertEquals("Carrier Name", actualFlight.getCarrierName());
        assertEquals("Flight Model", actualFlight.getFlightModel());
        BigInteger flightNo = actualFlight.getFlightNo();
        assertSame(valueOfResult1, flightNo);
        assertEquals(valueOfResult, flightNo);
        assertEquals(1, actualFlight.getSeatCapacity());
        assertEquals("Flight [flightNo=42,carrierName=Carrier Name,flightModel=Flight Model,seatCapacity=1]",
                actualToStringResult);
    }

    /**
     * Method under test: {@link Flight#equals(Object)}
     */
    @Test
    void testEquals() {
        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);
        assertNotEquals(flight, null);
    }

    /**
     * Method under test: {@link Flight#equals(Object)}
     */
    @Test
    void testEquals2() {
        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);
        assertNotEquals(flight, "Different type to Flight");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Flight#equals(Object)}
     *   <li>{@link Flight#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);
        assertEquals(flight, flight);
        int expectedHashCodeResult = flight.hashCode();
        assertEquals(expectedHashCodeResult, flight.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Flight#equals(Object)}
     *   <li>{@link Flight#hashCode()}
     * </ul>
     */
    @Test
    void testEquals4() {
        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(BigInteger.valueOf(42L));
        flight1.setSeatCapacity(1);
        assertEquals(flight, flight1);
        int expectedHashCodeResult = flight.hashCode();
        assertEquals(expectedHashCodeResult, flight1.hashCode());
    }

    /**
     * Method under test: {@link Flight#equals(Object)}
     */
    @Test
    void testEquals5() {
        Flight flight = new Flight();
        flight.setCarrierName("Flight Model");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(BigInteger.valueOf(42L));
        flight1.setSeatCapacity(1);
        assertNotEquals(flight, flight1);
    }

    /**
     * Method under test: {@link Flight#equals(Object)}
     */
    @Test
    void testEquals6() {
        Flight flight = new Flight();
        flight.setCarrierName(null);
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(BigInteger.valueOf(42L));
        flight1.setSeatCapacity(1);
        assertNotEquals(flight, flight1);
    }

    /**
     * Method under test: {@link Flight#equals(Object)}
     */
    @Test
    void testEquals7() {
        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Carrier Name");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(BigInteger.valueOf(42L));
        flight1.setSeatCapacity(1);
        assertNotEquals(flight, flight1);
    }

    /**
     * Method under test: {@link Flight#equals(Object)}
     */
    @Test
    void testEquals8() {
        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel(null);
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(BigInteger.valueOf(42L));
        flight1.setSeatCapacity(1);
        assertNotEquals(flight, flight1);
    }

    /**
     * Method under test: {@link Flight#equals(Object)}
     */
    @Test
    void testEquals9() {
        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(1L));
        flight.setSeatCapacity(1);

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(BigInteger.valueOf(42L));
        flight1.setSeatCapacity(1);
        assertNotEquals(flight, flight1);
    }

    /**
     * Method under test: {@link Flight#equals(Object)}
     */
    @Test
    void testEquals10() {
        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(null);
        flight.setSeatCapacity(1);

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(BigInteger.valueOf(42L));
        flight1.setSeatCapacity(1);
        assertNotEquals(flight, flight1);
    }

    /**
     * Method under test: {@link Flight#equals(Object)}
     */
    @Test
    void testEquals11() {
        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(0);

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(BigInteger.valueOf(42L));
        flight1.setSeatCapacity(1);
        assertNotEquals(flight, flight1);
    }
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Flight#equals(Object)}
     *   <li>{@link Flight#hashCode()}
     * </ul>
     */
    @Test
    void testEquals14() {
        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(null);
        flight.setSeatCapacity(1);

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(null);
        flight1.setSeatCapacity(1);
        assertEquals(flight, flight1);
        int expectedHashCodeResult = flight.hashCode();
        assertEquals(expectedHashCodeResult, flight1.hashCode());
    }
}

