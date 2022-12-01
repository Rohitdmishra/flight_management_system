package com.org.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.model.Users;
import com.org.service.UserService;

import java.math.BigInteger;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {UserController.class})
@ExtendWith(SpringExtension.class)
class UserControllerTest {
    @Autowired
    private UserController userController;

    @MockBean
    private UserService userService;

    /**
     * Method under test: {@link UserController#addUser(Users)}
     */
    @Test
    void testAddUser() throws Exception {
        when((ResponseEntity<Object>) userService.createUser((Users) any()))
                .thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));

        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");
        String content = (new ObjectMapper()).writeValueAsString(users);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/user/createUser")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(userController).build().perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("User Created Successfully!"));
    }

    /**
     * Method under test: {@link UserController#readAllUsers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testReadAllUsers() {
        (new UserController()).readAllUsers().iterator();
    }

    /**
     * Method under test: {@link UserController#updateUser(Users)}
     */
    @Test
    void testUpdateUser() throws Exception {
        Users users = new Users();
        users.setFirstName("Jane");
        users.setLastName("Doe");
        users.setUserAddress("42 Main St");
        users.setUserEmail("jane.doe@example.org");
        users.setUserId(BigInteger.valueOf(42L));
        users.setUserPassword("iloveyou");
        users.setUserPhone(BigInteger.valueOf(42L));
        users.setUserRole("User Role");
        when(userService.updateUser((Users) any())).thenReturn(users);

        Users users1 = new Users();
        users1.setFirstName("Jane");
        users1.setLastName("Doe");
        users1.setUserAddress("42 Main St");
        users1.setUserEmail("jane.doe@example.org");
        users1.setUserId(BigInteger.valueOf(42L));
        users1.setUserPassword("iloveyou");
        users1.setUserPhone(BigInteger.valueOf(42L));
        users1.setUserRole("User Role");
        String content = (new ObjectMapper()).writeValueAsString(users1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/user/updateUser")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(userController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Updated User Successfully!"));
    }

    /**
     * Method under test: {@link UserController#deleteBookingByID(BigInteger)}
     */
    @Test
    void testDeleteBookingByID() throws Exception {
        when(userService.deleteUser((BigInteger) any())).thenReturn("Delete User");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/user/deleteUser/{id}",
                BigInteger.valueOf(42L));
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(userController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Deleted User Successfully!"));
    }

    /**
     * Method under test: {@link UserController#searchUserByID(BigInteger)}
     */
    @Test
    void testSearchUserByID() throws Exception {
        when((ResponseEntity<Object>) userService.findUserById((BigInteger) any()))
                .thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user/searchUser/{id}",
                BigInteger.valueOf(42L));
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(userController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(100));
    }
}

