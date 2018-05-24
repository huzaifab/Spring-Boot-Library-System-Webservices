package com.ncs.library;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ncs.library.bean.BookBean;
import com.ncs.library.restapi.RestAPIController;
import com.ncs.library.service.LibraryService;


@RunWith(SpringRunner.class)
@WebMvcTest(controllers = RestAPIController.class,secure = false)
public class LibraryAPITest {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	LibraryService libraryService;
	BookBean mockedBookBean;
	List<BookBean> mokedBookBeanList;

	@Autowired
	ObjectMapper objectMapper;
	
	@Before
	public void setup() {
		mockedBookBean = new BookBean();
	}
	
	@Test
	public void testGetAllBooks() throws Exception {
		Mockito.when(libraryService.getAllBooks()).thenReturn(mokedBookBeanList);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getAllBooks")
		.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		Assert.assertNotNull(result.getResponse());
	}
}