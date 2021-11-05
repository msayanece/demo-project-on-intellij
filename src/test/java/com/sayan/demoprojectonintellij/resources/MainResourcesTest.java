package com.sayan.demoprojectonintellij.resources;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(MainResources.class)
class MainResourcesTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetHomeResponse() throws Exception {
        String response = mockMvc.perform(MockMvcRequestBuilders.get("/")).andReturn().getResponse().getContentAsString();
        assertEquals("Hello World from IntelliJ!!", response);
    }
}