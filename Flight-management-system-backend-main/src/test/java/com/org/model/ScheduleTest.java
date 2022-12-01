package com.org.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class ScheduleTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Schedule#Schedule()}
     *   <li>{@link Schedule#setArrDateTime(String)}
     *   <li>{@link Schedule#setDeptDateTime(String)}
     *   <li>{@link Schedule#setScheduleId(BigInteger)}
     *   <li>{@link Schedule#toString()}
     *   <li>{@link Schedule#getArrDateTime()}
     *   <li>{@link Schedule#getDeptDateTime()}
     *   <li>{@link Schedule#getScheduleId()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Schedule actualSchedule = new Schedule();
        actualSchedule.setArrDateTime("2020-03-01");
        actualSchedule.setDeptDateTime("2020-03-01");
        BigInteger valueOfResult = BigInteger.valueOf(42L);
        actualSchedule.setScheduleId(valueOfResult);
        String actualToStringResult = actualSchedule.toString();
        assertEquals("2020-03-01", actualSchedule.getArrDateTime());
        assertEquals("2020-03-01", actualSchedule.getDeptDateTime());
        assertSame(valueOfResult, actualSchedule.getScheduleId());
        assertEquals("Schedule [scheduleId=42, sourceAirport=, destinationAirport=, departureDateTime=2020-03-01,"
                + " arrivalDateTime=2020-03-01]", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Schedule#Schedule(BigInteger, String, String)}
     *   <li>{@link Schedule#setArrDateTime(String)}
     *   <li>{@link Schedule#setDeptDateTime(String)}
     *   <li>{@link Schedule#setScheduleId(BigInteger)}
     *   <li>{@link Schedule#toString()}
     *   <li>{@link Schedule#getArrDateTime()}
     *   <li>{@link Schedule#getDeptDateTime()}
     *   <li>{@link Schedule#getScheduleId()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        BigInteger valueOfResult = BigInteger.valueOf(42L);
        Schedule actualSchedule = new Schedule(valueOfResult, "2020-03-01", "2020-03-01");
        actualSchedule.setArrDateTime("2020-03-01");
        actualSchedule.setDeptDateTime("2020-03-01");
        BigInteger valueOfResult1 = BigInteger.valueOf(42L);
        actualSchedule.setScheduleId(valueOfResult1);
        String actualToStringResult = actualSchedule.toString();
        assertEquals("2020-03-01", actualSchedule.getArrDateTime());
        assertEquals("2020-03-01", actualSchedule.getDeptDateTime());
        BigInteger scheduleId = actualSchedule.getScheduleId();
        assertSame(valueOfResult1, scheduleId);
        assertEquals(valueOfResult, scheduleId);
        assertEquals("Schedule [scheduleId=42, sourceAirport=, destinationAirport=, departureDateTime=2020-03-01,"
                + " arrivalDateTime=2020-03-01]", actualToStringResult);
    }

    /**
     * Method under test: {@link Schedule#equals(Object)}
     */
    @Test
    void testEquals() {
        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));
        assertNotEquals(schedule, null);
    }

    /**
     * Method under test: {@link Schedule#equals(Object)}
     */
    @Test
    void testEquals2() {
        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));
        assertNotEquals(schedule, "Different type to Schedule");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Schedule#equals(Object)}
     *   <li>{@link Schedule#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));
        assertEquals(schedule, schedule);
        int expectedHashCodeResult = schedule.hashCode();
        assertEquals(expectedHashCodeResult, schedule.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Schedule#equals(Object)}
     *   <li>{@link Schedule#hashCode()}
     * </ul>
     */
    @Test
    void testEquals4() {
        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime("2020-03-01");
        schedule1.setScheduleId(BigInteger.valueOf(42L));
        assertEquals(schedule, schedule1);
        int expectedHashCodeResult = schedule.hashCode();
        assertEquals(expectedHashCodeResult, schedule1.hashCode());
    }

    /**
     * Method under test: {@link Schedule#equals(Object)}
     */
    @Test
    void testEquals5() {
        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020/03/01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime("2020-03-01");
        schedule1.setScheduleId(BigInteger.valueOf(42L));
        assertNotEquals(schedule, schedule1);
    }

    /**
     * Method under test: {@link Schedule#equals(Object)}
     */
    @Test
    void testEquals6() {
        Schedule schedule = new Schedule();
        schedule.setArrDateTime(null);
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime("2020-03-01");
        schedule1.setScheduleId(BigInteger.valueOf(42L));
        assertNotEquals(schedule, schedule1);
    }

    /**
     * Method under test: {@link Schedule#equals(Object)}
     */
    @Test
    void testEquals7() {
        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020/03/01");
        schedule.setScheduleId(BigInteger.valueOf(42L));

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime("2020-03-01");
        schedule1.setScheduleId(BigInteger.valueOf(42L));
        assertNotEquals(schedule, schedule1);
    }

    /**
     * Method under test: {@link Schedule#equals(Object)}
     */
    @Test
    void testEquals8() {
        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime(null);
        schedule.setScheduleId(BigInteger.valueOf(42L));

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime("2020-03-01");
        schedule1.setScheduleId(BigInteger.valueOf(42L));
        assertNotEquals(schedule, schedule1);
    }

    /**
     * Method under test: {@link Schedule#equals(Object)}
     */
    @Test
    void testEquals9() {
        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(1L));

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime("2020-03-01");
        schedule1.setScheduleId(BigInteger.valueOf(42L));
        assertNotEquals(schedule, schedule1);
    }

    /**
     * Method under test: {@link Schedule#equals(Object)}
     */
    @Test
    void testEquals10() {
        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(null);

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime("2020-03-01");
        schedule1.setScheduleId(BigInteger.valueOf(42L));
        assertNotEquals(schedule, schedule1);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Schedule#equals(Object)}
     *   <li>{@link Schedule#hashCode()}
     * </ul>
     */
    @Test
    void testEquals11() {
        Schedule schedule = new Schedule();
        schedule.setArrDateTime(null);
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(BigInteger.valueOf(42L));

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime(null);
        schedule1.setDeptDateTime("2020-03-01");
        schedule1.setScheduleId(BigInteger.valueOf(42L));
        assertEquals(schedule, schedule1);
        int expectedHashCodeResult = schedule.hashCode();
        assertEquals(expectedHashCodeResult, schedule1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Schedule#equals(Object)}
     *   <li>{@link Schedule#hashCode()}
     * </ul>
     */
    @Test
    void testEquals12() {
        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime(null);
        schedule.setScheduleId(BigInteger.valueOf(42L));

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime(null);
        schedule1.setScheduleId(BigInteger.valueOf(42L));
        assertEquals(schedule, schedule1);
        int expectedHashCodeResult = schedule.hashCode();
        assertEquals(expectedHashCodeResult, schedule1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Schedule#equals(Object)}
     *   <li>{@link Schedule#hashCode()}
     * </ul>
     */
    @Test
    void testEquals13() {
        Schedule schedule = new Schedule();
        schedule.setArrDateTime("2020-03-01");
        schedule.setDeptDateTime("2020-03-01");
        schedule.setScheduleId(null);

        Schedule schedule1 = new Schedule();
        schedule1.setArrDateTime("2020-03-01");
        schedule1.setDeptDateTime("2020-03-01");
        schedule1.setScheduleId(null);
        assertEquals(schedule, schedule1);
        int expectedHashCodeResult = schedule.hashCode();
        assertEquals(expectedHashCodeResult, schedule1.hashCode());
    }
}

