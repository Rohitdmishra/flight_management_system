package com.org.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class ScheduledFlightTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ScheduledFlight#ScheduledFlight()}
     *   <li>{@link ScheduledFlight#setAirport(Airport)}
     *   <li>{@link ScheduledFlight#setAvailableSeats(Integer)}
     *   <li>{@link ScheduledFlight#setFlight(Flight)}
     *   <li>{@link ScheduledFlight#setSchedule(Schedule)}
     *   <li>{@link ScheduledFlight#setScheduleFlightId(BigInteger)}
     *   <li>{@link ScheduledFlight#toString()}
     *   <li>{@link ScheduledFlight#getAirport()}
     *   <li>{@link ScheduledFlight#getAvailableSeats()}
     *   <li>{@link ScheduledFlight#getFlight()}
     *   <li>{@link ScheduledFlight#getSchedule()}
     *   <li>{@link ScheduledFlight#getScheduleFlightId()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ScheduledFlight actualScheduledFlight = new ScheduledFlight();
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");
        actualScheduledFlight.setAirport(airport);
        actualScheduledFlight.setAvailableSeats(1);
        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        BigInteger valueOfResult = BigInteger.valueOf(42L);
        flight.setFlightNo(valueOfResult);
        flight.setSeatCapacity(1);
        actualScheduledFlight.setFlight(flight);
        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        BigInteger valueOfResult1 = BigInteger.valueOf(42L);
        schedule.setScheduleId(valueOfResult1);
        actualScheduledFlight.setSchedule(schedule);
        BigInteger valueOfResult2 = BigInteger.valueOf(42L);
        actualScheduledFlight.setScheduleFlightId(valueOfResult2);
        String actualToStringResult = actualScheduledFlight.toString();
        assertSame(airport, actualScheduledFlight.getAirport());
        assertEquals(1, actualScheduledFlight.getAvailableSeats().intValue());
        assertSame(flight, actualScheduledFlight.getFlight());
        assertSame(schedule, actualScheduledFlight.getSchedule());
        BigInteger scheduleFlightId = actualScheduledFlight.getScheduleFlightId();
        assertSame(valueOfResult2, scheduleFlightId);
        assertEquals(valueOfResult, scheduleFlightId);
        assertEquals(valueOfResult1, scheduleFlightId);
        assertEquals(
                "ScheduledFlight(scheduleFlightId=42, flight=Flight [flightNo=42,carrierName=Carrier Name,flightModel=Flight"
                        + " Model,seatCapacity=1], availableSeats=1, schedule=Schedule [scheduleId=42, sourceAirport=,"
                        + " destinationAirport=, departureDateTime=2020-03-01, arrivalDateTime=2020-03-01], airport=Airport"
                        + "(airportCode=Airport Code, airportLocation=Airport Location, airportName=Airport Name, srcAirport=Src"
                        + " Airport, dstnAirport=Dstn Airport))",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ScheduledFlight#ScheduledFlight(BigInteger, Flight, Integer, Schedule, Airport)}
     *   <li>{@link ScheduledFlight#setAirport(Airport)}
     *   <li>{@link ScheduledFlight#setAvailableSeats(Integer)}
     *   <li>{@link ScheduledFlight#setFlight(Flight)}
     *   <li>{@link ScheduledFlight#setSchedule(Schedule)}
     *   <li>{@link ScheduledFlight#setScheduleFlightId(BigInteger)}
     *   <li>{@link ScheduledFlight#toString()}
     *   <li>{@link ScheduledFlight#getAirport()}
     *   <li>{@link ScheduledFlight#getAvailableSeats()}
     *   <li>{@link ScheduledFlight#getFlight()}
     *   <li>{@link ScheduledFlight#getSchedule()}
     *   <li>{@link ScheduledFlight#getScheduleFlightId()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        BigInteger valueOfResult = BigInteger.valueOf(42L);

        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        BigInteger valueOfResult1 = BigInteger.valueOf(42L);
        flight.setFlightNo(valueOfResult1);
        flight.setSeatCapacity(1);

        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        BigInteger valueOfResult2 = BigInteger.valueOf(42L);
        schedule.setScheduleId(valueOfResult2);

        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");
        ScheduledFlight actualScheduledFlight = new ScheduledFlight(valueOfResult, flight, 1, schedule, airport);
        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");
        actualScheduledFlight.setAirport(airport1);
        actualScheduledFlight.setAvailableSeats(1);
        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        BigInteger valueOfResult3 = BigInteger.valueOf(42L);
        flight1.setFlightNo(valueOfResult3);
        flight1.setSeatCapacity(1);
        actualScheduledFlight.setFlight(flight1);
        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime("2020-03-01");
        BigInteger valueOfResult4 = BigInteger.valueOf(42L);
        schedule1.setScheduleId(valueOfResult4);
        actualScheduledFlight.setSchedule(schedule1);
        BigInteger valueOfResult5 = BigInteger.valueOf(42L);
        actualScheduledFlight.setScheduleFlightId(valueOfResult5);
        String actualToStringResult = actualScheduledFlight.toString();
        Airport airport2 = actualScheduledFlight.getAirport();
        assertSame(airport1, airport2);
        assertEquals(airport, airport2);
        assertEquals(1, actualScheduledFlight.getAvailableSeats().intValue());
        Flight flight2 = actualScheduledFlight.getFlight();
        assertSame(flight1, flight2);
        assertEquals(flight, flight2);
        Schedule schedule2 = actualScheduledFlight.getSchedule();
        assertSame(schedule1, schedule2);
        assertEquals(schedule, schedule2);
        BigInteger scheduleFlightId = actualScheduledFlight.getScheduleFlightId();
        assertSame(valueOfResult5, scheduleFlightId);
        assertEquals(valueOfResult, scheduleFlightId);
        assertEquals(valueOfResult1, scheduleFlightId);
        assertEquals(valueOfResult2, scheduleFlightId);
        assertEquals(valueOfResult3, scheduleFlightId);
        assertEquals(valueOfResult4, scheduleFlightId);
        assertEquals(
                "ScheduledFlight(scheduleFlightId=42, flight=Flight [flightNo=42,carrierName=Carrier Name,flightModel=Flight"
                        + " Model,seatCapacity=1], availableSeats=1, schedule=Schedule [scheduleId=42, sourceAirport=,"
                        + " destinationAirport=, departureDateTime=2020-03-01, arrivalDateTime=2020-03-01], airport=Airport"
                        + "(airportCode=Airport Code, airportLocation=Airport Location, airportName=Airport Name, srcAirport=Src"
                        + " Airport, dstnAirport=Dstn Airport))",
                actualToStringResult);
    }

    /**
     * Method under test: {@link ScheduledFlight#equals(Object)}
     */
    @Test
    void testEquals() {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");

        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);

        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight = new ScheduledFlight();
        scheduledFlight.setAirport(airport);
        scheduledFlight.setAvailableSeats(1);
        scheduledFlight.setFlight(flight);
        scheduledFlight.setSchedule(schedule);
        scheduledFlight.setScheduleFlightId(BigInteger.valueOf(42L));
        assertNotEquals(scheduledFlight, null);
    }

    /**
     * Method under test: {@link ScheduledFlight#equals(Object)}
     */
    @Test
    void testEquals2() {
        Airport airport = new Airport();
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");

        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);

        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight = new ScheduledFlight();
        scheduledFlight.setAirport(airport);
        scheduledFlight.setAvailableSeats(1);
        scheduledFlight.setFlight(flight);
        scheduledFlight.setSchedule(schedule);
        scheduledFlight.setScheduleFlightId(BigInteger.valueOf(42L));
        assertNotEquals(scheduledFlight, "Different type to ScheduledFlight");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ScheduledFlight#equals(Object)}
     *   <li>{@link ScheduledFlight#hashCode()}
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

        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);

        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight = new ScheduledFlight();
        scheduledFlight.setAirport(airport);
        scheduledFlight.setAvailableSeats(1);
        scheduledFlight.setFlight(flight);
        scheduledFlight.setSchedule(schedule);
        scheduledFlight.setScheduleFlightId(BigInteger.valueOf(42L));
        assertEquals(scheduledFlight, scheduledFlight);
        int expectedHashCodeResult = scheduledFlight.hashCode();
        assertEquals(expectedHashCodeResult, scheduledFlight.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ScheduledFlight#equals(Object)}
     *   <li>{@link ScheduledFlight#hashCode()}
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

        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);

        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight = new ScheduledFlight();
        scheduledFlight.setAirport(airport);
        scheduledFlight.setAvailableSeats(1);
        scheduledFlight.setFlight(flight);
        scheduledFlight.setSchedule(schedule);
        scheduledFlight.setScheduleFlightId(BigInteger.valueOf(42L));

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(BigInteger.valueOf(42L));
        flight1.setSeatCapacity(1);

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime("2020-03-01");
        schedule1.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight1 = new ScheduledFlight();
        scheduledFlight1.setAirport(airport1);
        scheduledFlight1.setAvailableSeats(1);
        scheduledFlight1.setFlight(flight1);
        scheduledFlight1.setSchedule(schedule1);
        scheduledFlight1.setScheduleFlightId(BigInteger.valueOf(42L));
        assertEquals(scheduledFlight, scheduledFlight1);
        int expectedHashCodeResult = scheduledFlight.hashCode();
        assertEquals(expectedHashCodeResult, scheduledFlight1.hashCode());
    }

    /**
     * Method under test: {@link ScheduledFlight#equals(Object)}
     */
    @Test
    void testEquals5() {
        Airport airport = mock(Airport.class);
        doNothing().when(airport).setAirportCode((String) any());
        doNothing().when(airport).setAirportLocation((String) any());
        doNothing().when(airport).setAirportName((String) any());
        doNothing().when(airport).setDstnAirport((String) any());
        doNothing().when(airport).setSrcAirport((String) any());
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");

        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);

        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight = new ScheduledFlight();
        scheduledFlight.setAirport(airport);
        scheduledFlight.setAvailableSeats(1);
        scheduledFlight.setFlight(flight);
        scheduledFlight.setSchedule(schedule);
        scheduledFlight.setScheduleFlightId(BigInteger.valueOf(42L));

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(BigInteger.valueOf(42L));
        flight1.setSeatCapacity(1);

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime("2020-03-01");
        schedule1.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight1 = new ScheduledFlight();
        scheduledFlight1.setAirport(airport1);
        scheduledFlight1.setAvailableSeats(1);
        scheduledFlight1.setFlight(flight1);
        scheduledFlight1.setSchedule(schedule1);
        scheduledFlight1.setScheduleFlightId(BigInteger.valueOf(42L));
        assertNotEquals(scheduledFlight, scheduledFlight1);
    }

    /**
     * Method under test: {@link ScheduledFlight#equals(Object)}
     */
    @Test
    void testEquals6() {
        Airport airport = mock(Airport.class);
        doNothing().when(airport).setAirportCode((String) any());
        doNothing().when(airport).setAirportLocation((String) any());
        doNothing().when(airport).setAirportName((String) any());
        doNothing().when(airport).setDstnAirport((String) any());
        doNothing().when(airport).setSrcAirport((String) any());
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");

        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);

        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight = new ScheduledFlight();
        scheduledFlight.setAirport(airport);
        scheduledFlight.setAvailableSeats(3);
        scheduledFlight.setFlight(flight);
        scheduledFlight.setSchedule(schedule);
        scheduledFlight.setScheduleFlightId(BigInteger.valueOf(42L));

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(BigInteger.valueOf(42L));
        flight1.setSeatCapacity(1);

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime("2020-03-01");
        schedule1.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight1 = new ScheduledFlight();
        scheduledFlight1.setAirport(airport1);
        scheduledFlight1.setAvailableSeats(1);
        scheduledFlight1.setFlight(flight1);
        scheduledFlight1.setSchedule(schedule1);
        scheduledFlight1.setScheduleFlightId(BigInteger.valueOf(42L));
        assertNotEquals(scheduledFlight, scheduledFlight1);
    }

    /**
     * Method under test: {@link ScheduledFlight#equals(Object)}
     */
    @Test
    void testEquals7() {
        Airport airport = mock(Airport.class);
        doNothing().when(airport).setAirportCode((String) any());
        doNothing().when(airport).setAirportLocation((String) any());
        doNothing().when(airport).setAirportName((String) any());
        doNothing().when(airport).setDstnAirport((String) any());
        doNothing().when(airport).setSrcAirport((String) any());
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");

        Flight flight = new Flight();
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);

        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight = new ScheduledFlight();
        scheduledFlight.setAirport(airport);
        scheduledFlight.setAvailableSeats(null);
        scheduledFlight.setFlight(flight);
        scheduledFlight.setSchedule(schedule);
        scheduledFlight.setScheduleFlightId(BigInteger.valueOf(42L));

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(BigInteger.valueOf(42L));
        flight1.setSeatCapacity(1);

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime("2020-03-01");
        schedule1.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight1 = new ScheduledFlight();
        scheduledFlight1.setAirport(airport1);
        scheduledFlight1.setAvailableSeats(1);
        scheduledFlight1.setFlight(flight1);
        scheduledFlight1.setSchedule(schedule1);
        scheduledFlight1.setScheduleFlightId(BigInteger.valueOf(42L));
        assertNotEquals(scheduledFlight, scheduledFlight1);
    }

    /**
     * Method under test: {@link ScheduledFlight#equals(Object)}
     */
    @Test
    void testEquals8() {
        Airport airport = mock(Airport.class);
        doNothing().when(airport).setAirportCode((String) any());
        doNothing().when(airport).setAirportLocation((String) any());
        doNothing().when(airport).setAirportName((String) any());
        doNothing().when(airport).setDstnAirport((String) any());
        doNothing().when(airport).setSrcAirport((String) any());
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");
        Flight flight = mock(Flight.class);
        doNothing().when(flight).setCarrierName((String) any());
        doNothing().when(flight).setFlightModel((String) any());
        doNothing().when(flight).setFlightNo((BigInteger) any());
        doNothing().when(flight).setSeatCapacity(anyInt());
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);

        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight = new ScheduledFlight();
        scheduledFlight.setAirport(airport);
        scheduledFlight.setAvailableSeats(1);
        scheduledFlight.setFlight(flight);
        scheduledFlight.setSchedule(schedule);
        scheduledFlight.setScheduleFlightId(BigInteger.valueOf(42L));

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(BigInteger.valueOf(42L));
        flight1.setSeatCapacity(1);

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime("2020-03-01");
        schedule1.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight1 = new ScheduledFlight();
        scheduledFlight1.setAirport(airport1);
        scheduledFlight1.setAvailableSeats(1);
        scheduledFlight1.setFlight(flight1);
        scheduledFlight1.setSchedule(schedule1);
        scheduledFlight1.setScheduleFlightId(BigInteger.valueOf(42L));
        assertNotEquals(scheduledFlight, scheduledFlight1);
    }

    /**
     * Method under test: {@link ScheduledFlight#equals(Object)}
     */
    @Test
    void testEquals9() {
        Airport airport = mock(Airport.class);
        doNothing().when(airport).setAirportCode((String) any());
        doNothing().when(airport).setAirportLocation((String) any());
        doNothing().when(airport).setAirportName((String) any());
        doNothing().when(airport).setDstnAirport((String) any());
        doNothing().when(airport).setSrcAirport((String) any());
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");
        Flight flight = mock(Flight.class);
        doNothing().when(flight).setCarrierName((String) any());
        doNothing().when(flight).setFlightModel((String) any());
        doNothing().when(flight).setFlightNo((BigInteger) any());
        doNothing().when(flight).setSeatCapacity(anyInt());
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);

        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight = new ScheduledFlight();
        scheduledFlight.setAirport(airport);
        scheduledFlight.setAvailableSeats(1);
        scheduledFlight.setFlight(flight);
        scheduledFlight.setSchedule(schedule);
        scheduledFlight.setScheduleFlightId(BigInteger.valueOf(1L));

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(BigInteger.valueOf(42L));
        flight1.setSeatCapacity(1);

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime("2020-03-01");
        schedule1.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight1 = new ScheduledFlight();
        scheduledFlight1.setAirport(airport1);
        scheduledFlight1.setAvailableSeats(1);
        scheduledFlight1.setFlight(flight1);
        scheduledFlight1.setSchedule(schedule1);
        scheduledFlight1.setScheduleFlightId(BigInteger.valueOf(42L));
        assertNotEquals(scheduledFlight, scheduledFlight1);
    }

    /**
     * Method under test: {@link ScheduledFlight#equals(Object)}
     */
    @Test
    void testEquals10() {
        Airport airport = mock(Airport.class);
        doNothing().when(airport).setAirportCode((String) any());
        doNothing().when(airport).setAirportLocation((String) any());
        doNothing().when(airport).setAirportName((String) any());
        doNothing().when(airport).setDstnAirport((String) any());
        doNothing().when(airport).setSrcAirport((String) any());
        airport.setAirportCode("Airport Code");
        airport.setAirportLocation("Airport Location");
        airport.setAirportName("Airport Name");
        airport.setDstnAirport("Dstn Airport");
        airport.setSrcAirport("Src Airport");
        Flight flight = mock(Flight.class);
        doNothing().when(flight).setCarrierName((String) any());
        doNothing().when(flight).setFlightModel((String) any());
        doNothing().when(flight).setFlightNo((BigInteger) any());
        doNothing().when(flight).setSeatCapacity(anyInt());
        flight.setCarrierName("Carrier Name");
        flight.setFlightModel("Flight Model");
        flight.setFlightNo(BigInteger.valueOf(42L));
        flight.setSeatCapacity(1);

        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight = new ScheduledFlight();
        scheduledFlight.setAirport(airport);
        scheduledFlight.setAvailableSeats(1);
        scheduledFlight.setFlight(flight);
        scheduledFlight.setSchedule(schedule);
        scheduledFlight.setScheduleFlightId(null);

        Airport airport1 = new Airport();
        airport1.setAirportCode("Airport Code");
        airport1.setAirportLocation("Airport Location");
        airport1.setAirportName("Airport Name");
        airport1.setDstnAirport("Dstn Airport");
        airport1.setSrcAirport("Src Airport");

        Flight flight1 = new Flight();
        flight1.setCarrierName("Carrier Name");
        flight1.setFlightModel("Flight Model");
        flight1.setFlightNo(BigInteger.valueOf(42L));
        flight1.setSeatCapacity(1);

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime("2020-03-01");
        schedule1.setScheduleId(BigInteger.valueOf(42L));

        ScheduledFlight scheduledFlight1 = new ScheduledFlight();
        scheduledFlight1.setAirport(airport1);
        scheduledFlight1.setAvailableSeats(1);
        scheduledFlight1.setFlight(flight1);
        scheduledFlight1.setSchedule(schedule1);
        scheduledFlight1.setScheduleFlightId(BigInteger.valueOf(42L));
        assertNotEquals(scheduledFlight, scheduledFlight1);
    }
}

