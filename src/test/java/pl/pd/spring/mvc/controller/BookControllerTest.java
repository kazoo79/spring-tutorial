package pl.pd.spring.mvc.controller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

public class BookControllerTest {

	BookController bookController;

	@Before
	public void init() {
		bookController = new BookController();
	}

	@Test
	public void shouldHandleShowNewForm() throws Exception {

		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(bookController).setSingleView(
				new InternalResourceView("/WEB-INF/views/jsp/book/book-form.jsp")).build();

		mockMvc.perform(get("/book/new"))
				.andExpect(view().name("book/book-form"))
				.andExpect(model().attributeExists("book-form"));

	}
}