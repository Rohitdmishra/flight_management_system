package com.org.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class UsersTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Users#Users()}
     *   <li>{@link Users#setFirstName(String)}
     *   <li>{@link Users#setLastName(String)}
     *   <li>{@link Users#setUserAddress(String)}
     *   <li>{@link Users#setUserEmail(String)}
     *   <li>{@link Users#setUserId(BigInteger)}
     *   <li>{@link Users#setUserPassword(String)}
     *   <li>{@link Users#setUserPhone(BigInteger)}
     *   <li>{@link Users#setUserRole(String)}
     *   <li>{@link Users#toString()}
     *   <li>{@link Users#getFirstName()}
     *   <li>{@link Users#getLastName()}
     *   <li>{@link Users#getUserAddress()}
     *   <li>{@link Users#getUserEmail()}
     *   <li>{@link Users#getUserId()}
     *   <li>{@link Users#getUserPhone()}
     *   <li>{@link Users#getUserPassword()}
     *   <li>{@link Users#getUserRole()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Users actualUsers = new Users();
        actualUsers.setFirstName("Jane");
        actualUsers.setLastName("Doe");
        actualUsers.setUserAddress("42 Main St");
        actualUsers.setUserEmail("jane.doe@example.org");
        BigInteger valueOfResult = BigInteger.valueOf(42L);
        actualUsers.setUserId(valueOfResult);
        actualUsers.setUserPassword("iloveyou");
        BigInteger valueOfResult1 = BigInteger.valueOf(42L);
        actualUsers.setUserPhone(valueOfResult1);
        actualUsers.setUserRole("User Role");
        String actualToStringResult = actualUsers.toString();
        assertEquals("Jane", actualUsers.getFirstName());
        assertEquals("Doe", actualUsers.getLastName());
        assertEquals("42 Main St", actualUsers.getUserAddress());
        assertEquals("jane.doe@example.org", actualUsers.getUserEmail());
        BigInteger userId = actualUsers.getUserId();
        assertSame(valueOfResult, userId);
        BigInteger userPhone = actualUsers.getUserPhone();
        assertEquals(userPhone, userId);
        assertEquals("iloveyou", actualUsers.getUserPassword());
        assertSame(valueOfResult1, userPhone);
        assertEquals(valueOfResult, userPhone);
        assertEquals("User Role", actualUsers.getUserRole());
        assertEquals("Users(userId=42, firstName=Jane, lastName=Doe, userEmail=jane.doe@example.org, userPassword=iloveyou,"
                + " userAddress=42 Main St, userPhone=42, userRole=User Role)", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Users#Users(BigInteger, String, String, String, String, String, BigInteger, String)}
     *   <li>{@link Users#setFirstName(String)}
     *   <li>{@link Users#setLastName(String)}
     *   <li>{@link Users#setUserAddress(String)}
     *   <li>{@link Users#setUserEmail(String)}
     *   <li>{@link Users#setUserId(BigInteger)}
     *   <li>{@link Users#setUserPassword(String)}
     *   <li>{@link Users#setUserPhone(BigInteger)}
     *   <li>{@link Users#setUserRole(String)}
     *   <li>{@link Users#toString()}
     *   <li>{@link Users#getFirstName()}
     *   <li>{@link Users#getLastName()}
     *   <li>{@link Users#getUserAddress()}
     *   <li>{@link Users#getUserEmail()}
     *   <li>{@link Users#getUserId()}
     *   <li>{@link Users#getUserPhone()}
     *   <li>{@link Users#getUserPassword()}
     *   <li>{@link Users#getUserRole()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        BigInteger valueOfResult = BigInteger.valueOf(42L);
        BigInteger valueOfResult1 = BigInteger.valueOf(42L);
        Users actualUsers = new Users(valueOfResult, "Jane", "Doe", "jane.doe@example.org", "iloveyou", "42 Main St",
                valueOfResult1, "User Role");
        actualUsers.setFirstName("Jane");
        actualUsers.setLastName("Doe");
        actualUsers.setUserAddress("42 Main St");
        actualUsers.setUserEmail("jane.doe@example.org");
        BigInteger valueOfResult2 = BigInteger.valueOf(42L);
        actualUsers.setUserId(valueOfResult2);
        actualUsers.setUserPassword("iloveyou");
        BigInteger valueOfResult3 = BigInteger.valueOf(42L);
        actualUsers.setUserPhone(valueOfResult3);
        actualUsers.setUserRole("User Role");
        String actualToStringResult = actualUsers.toString();
        assertEquals("Jane", actualUsers.getFirstName());
        assertEquals("Doe", actualUsers.getLastName());
        assertEquals("42 Main St", actualUsers.getUserAddress());
        assertEquals("jane.doe@example.org", actualUsers.getUserEmail());
        BigInteger userId = actualUsers.getUserId();
        assertSame(valueOfResult2, userId);
        assertEquals(valueOfResult, userId);
        assertEquals(valueOfResult1, userId);
        BigInteger userPhone = actualUsers.getUserPhone();
        assertEquals(userPhone, userId);
        assertEquals("iloveyou", actualUsers.getUserPassword());
        assertSame(valueOfResult3, userPhone);
        assertEquals(valueOfResult, userPhone);
        assertEquals(valueOfResult1, userPhone);
        assertEquals(valueOfResult2, userPhone);
        assertEquals("User Role", actualUsers.getUserRole());
        assertEquals(
                "Users(userId=42, firstName=Jane, lastName=Doe, userEmail=jane.doe@example.org, userPassword=iloveyou,"
                        + " userAddress=42 Main St, userPhone=42, userRole=User Role)",
                actualToStringResult);
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");
        assertNotEquals(users, null);
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals2() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");
        assertNotEquals(users, "Different type to Users");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Users#equals(Object)}
     *   <li>{@link Users#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");
        assertEquals(users, users);
        int expectedHashCodeResult = users.hashCode();
        assertEquals(expectedHashCodeResult, users.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Users#equals(Object)}
     *   <li>{@link Users#hashCode()}
     * </ul>
     */
    @Test
    void testEquals4() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertEquals(users, users1);
        int expectedHashCodeResult = users.hashCode();
        assertEquals(expectedHashCodeResult, users1.hashCode());
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals5() {
        Users users = new Users();
        users.setFirstName("Doe");
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertNotEquals(users, users1);
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals6() {
        Users users = new Users();
        users.setFirstName(null);
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertNotEquals(users, users1);
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals7() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Jane");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertNotEquals(users, users1);
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals8() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName(null);
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertNotEquals(users, users1);
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals9() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress("Jane");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertNotEquals(users, users1);
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals10() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress(null);
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertNotEquals(users, users1);
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals11() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("Jane");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertNotEquals(users, users1);
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals12() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail(null);
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertNotEquals(users, users1);
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals13() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(1L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertNotEquals(users, users1);
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals14() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(null);
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertNotEquals(users, users1);
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals15() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("Jane");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertNotEquals(users, users1);
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals16() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword(null);
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertNotEquals(users, users1);
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals17() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(1L));
        users.setUserRole("User Role");

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertNotEquals(users, users1);
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals18() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(null);
        users.setUserRole("User Role");

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertNotEquals(users, users1);
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals19() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("Jane");

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertNotEquals(users, users1);
    }

    /**
     * Method under test: {@link Users#equals(Object)}
     */
    @Test
    void testEquals20() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole(null);

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertNotEquals(users, users1);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Users#equals(Object)}
     *   <li>{@link Users#hashCode()}
     * </ul>
     */
    @Test
    void testEquals21() {
        Users users = new Users();
        users.setFirstName(null);
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");

        Users users1 = new Users();
        users1.setFirstName(null);
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertEquals(users, users1);
        int expectedHashCodeResult = users.hashCode();
        assertEquals(expectedHashCodeResult, users1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Users#equals(Object)}
     *   <li>{@link Users#hashCode()}
     * </ul>
     */
    @Test
    void testEquals22() {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName(null);
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName(null);
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        assertEquals(users, users1);
        int expectedHashCodeResult = users.hashCode();
        assertEquals(expectedHashCodeResult, users1.hashCode());
    }
}

