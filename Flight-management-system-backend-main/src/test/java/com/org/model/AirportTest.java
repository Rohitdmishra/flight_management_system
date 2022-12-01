package com.org.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AirportTest {
    /**
     * Method under test: {@link Airport#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new Airport()).canEqual("Other"));
    }

    /**
     * Method under test: {@link Airport#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        Airport airport = new Airport();

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");
        assertTrue(airport.canEqual(airport1));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Airport#Airport()}
     *   <li>{@link Airport#setAirportCode(String)}
     *   <li>{@link Airport#setAirportLocation(String)}
     *   <li>{@link Airport#setAirportName(String)}
     *   <li>{@link Airport#setDstnAirport(String)}
     *   <li>{@link Airport#setSrcAirport(String)}
     *   <li>{@link Airport#toString()}
     *   <li>{@link Airport#getAirportCode()}
     *   <li>{@link Airport#getAirportLocation()}
     *   <li>{@link Airport#getAirportName()}
     *   <li>{@link Airport#getDstnAirport()}
     *   <li>{@link Airport#getSrcAirport()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Airport actualAirport = new Airport();
        actualAirport.setAirportCode("Airport Code");
        actualAirport.setAirportLocation("Airport Location");
        actualAirport.setAirportName("Airport Name");
        actualAirport.setDstnAirport("Dstn Airport");
        actualAirport.setSrcAirport("Src Airport");
        String actualToStringResult = actualAirport.toString();
        assertEquals("Airport Code", actualAirport.getAirportCode());
        assertEquals("Airport Location", actualAirport.getAirportLocation());
        assertEquals("Airport Name", actualAirport.getAirportName());
        assertEquals("Dstn Airport", actualAirport.getDstnAirport());
        assertEquals("Src Airport", actualAirport.getSrcAirport());
        assertEquals("Airport(airportCode=Airport Code, airportLocation=Airport Location, airportName=Airport Name,"
                + " srcAirport=Src Airport, dstnAirport=Dstn Airport)", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Airport#Airport(String, String, String, String, String)}
     *   <li>{@link Airport#setAirportCode(String)}
     *   <li>{@link Airport#setAirportLocation(String)}
     *   <li>{@link Airport#setAirportName(String)}
     *   <li>{@link Airport#setDstnAirport(String)}
     *   <li>{@link Airport#setSrcAirport(String)}
     *   <li>{@link Airport#toString()}
     *   <li>{@link Airport#getAirportCode()}
     *   <li>{@link Airport#getAirportLocation()}
     *   <li>{@link Airport#getAirportName()}
     *   <li>{@link Airport#getDstnAirport()}
     *   <li>{@link Airport#getSrcAirport()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Airport actualAirport = new Airport("Airport Code", "Airport Location", "Airport Name", "Src Airport",
                "Dstn Airport");
        actualAirport.setAirportCode("Airport Code");
        actualAirport.setAirportLocation("Airport Location");
        actualAirport.setAirportName("Airport Name");
        actualAirport.setDstnAirport("Dstn Airport");
        actualAirport.setSrcAirport("Src Airport");
        String actualToStringResult = actualAirport.toString();
        assertEquals("Airport Code", actualAirport.getAirportCode());
        assertEquals("Airport Location", actualAirport.getAirportLocation());
        assertEquals("Airport Name", actualAirport.getAirportName());
        assertEquals("Dstn Airport", actualAirport.getDstnAirport());
        assertEquals("Src Airport", actualAirport.getSrcAirport());
        assertEquals("Airport(airportCode=Airport Code, airportLocation=Airport Location, airportName=Airport Name,"
                + " srcAirport=Src Airport, dstnAirport=Dstn Airport)", actualToStringResult);
    }

    /**
     * Method under test: {@link Airport#equals(Object)}
     */
    @Test
    void testEquals() {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");
        assertNotEquals(airport, null);
    }

    /**
     * Method under test: {@link Airport#equals(Object)}
     */
    @Test
    void testEquals2() {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");
        assertNotEquals(airport, "Different type to Airport");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Airport#equals(Object)}
     *   <li>{@link Airport#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");
        assertEquals(airport, airport);
        int expectedHashCodeResult = airport.hashCode();
        assertEquals(expectedHashCodeResult, airport.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Airport#equals(Object)}
     *   <li>{@link Airport#hashCode()}
     * </ul>
     */
    @Test
    void testEquals4() {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");
        assertEquals(airport, airport1);
        int expectedHashCodeResult = airport.hashCode();
        assertEquals(expectedHashCodeResult, airport1.hashCode());
    }

    /**
     * Method under test: {@link Airport#equals(Object)}
     */
    @Test
    void testEquals5() {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Location");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");
        assertNotEquals(airport, airport1);
    }

    /**
     * Method under test: {@link Airport#equals(Object)}
     */
    @Test
    void testEquals6() {
        Airport airport = new Airport();
        airport.setAirportCode(null);
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");
        assertNotEquals(airport, airport1);
    }

    /**
     * Method under test: {@link Airport#equals(Object)}
     */
    @Test
    void testEquals7() {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Code");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");
        assertNotEquals(airport, airport1);
    }

    /**
     * Method under test: {@link Airport#equals(Object)}
     */
    @Test
    void testEquals8() {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation(null);
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");
        assertNotEquals(airport, airport1);
    }

    /**
     * Method under test: {@link Airport#equals(Object)}
     */
    @Test
    void testEquals9() {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Code");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");
        assertNotEquals(airport, airport1);
    }

    /**
     * Method under test: {@link Airport#equals(Object)}
     */
    @Test
    void testEquals10() {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName(null);
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");
        assertNotEquals(airport, airport1);
    }

    /**
     * Method under test: {@link Airport#equals(Object)}
     */
    @Test
    void testEquals11() {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Airport Code");
        airport.setSrcAirport("Src Airport");

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");
        assertNotEquals(airport, airport1);
    }

    /**
     * Method under test: {@link Airport#equals(Object)}
     */
    @Test
    void testEquals12() {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport(null);
        airport.setSrcAirport("Src Airport");

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");
        assertNotEquals(airport, airport1);
    }

    /**
     * Method under test: {@link Airport#equals(Object)}
     */
    @Test
    void testEquals13() {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Airport Code");

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");
        assertNotEquals(airport, airport1);
    }

    /**
     * Method under test: {@link Airport#equals(Object)}
     */
    @Test
    void testEquals14() {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport(null);

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");
        assertNotEquals(airport, airport1);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Airport#equals(Object)}
     *   <li>{@link Airport#hashCode()}
     * </ul>
     */
    @Test
    void testEquals15() {
        Airport airport = new Airport();
        airport.setAirportCode(null);
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");

        Airport airport1 = new Airport();
        airport1.setAirportCode(null);
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");
        assertEquals(airport, airport1);
        int expectedHashCodeResult = airport.hashCode();
        assertEquals(expectedHashCodeResult, airport1.hashCode());
    }

}

