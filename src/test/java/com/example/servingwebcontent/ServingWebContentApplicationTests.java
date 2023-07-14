package com.example.servingwebcontent;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ServingWebContentApplicationTests {

	@Autowired
	private MockMvc mvc;


	@Test
	void contextLoads() throws Exception {

		String name = "Ami";

		mvc.perform(MockMvcRequestBuilders.get("/greeting?name="+name))
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, Amine!")));
	}

}
