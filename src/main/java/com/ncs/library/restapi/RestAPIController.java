package com.ncs.library.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ncs.library.bean.BookBean;
import com.ncs.library.bean.ResponseBean;
import com.ncs.library.service.LibraryService;

/*
 * This is Main Controller, which is used to pursue each request coming to this controller  
 */
@RestController
public class RestAPIController {
	
	/*
	 * Library Service will be loaded only once through out whole project
	 */
	@Autowired
	public LibraryService libraryService;
	
	/*
	 * This method will return All Book as JSON
	 */
	@RequestMapping(method=RequestMethod.GET, value="/getAllBooks")
	public List<BookBean> getBooks() {
		return libraryService.getAllBooks();
	}
	
	/*
	 * This method will return All Book details by author name as JSON
	 */
	@RequestMapping(method=RequestMethod.GET, value="/getAllBooksByAuthorName")
	public List<BookBean> getBooksByAuthorName(@RequestParam(value="author", defaultValue="Kathy Sierra") String authorName){
		return libraryService.getAllBooksByAuthor(authorName);
	}
	
	/*
	 * This method will return All Book details by title contains partial text as JSON
	 */
	@RequestMapping(method=RequestMethod.GET, value="/getAllBooksByTitle")
	public List<BookBean> getBooksByTitle(@RequestParam(value="title", defaultValue="java") String title){
		return libraryService.getAllBooksByTitleMatch(title);
	}
	
	/*
	 * This method will take requestBody as json and after adding it to list it will return response body as json
	 */
	@RequestMapping(method=RequestMethod.PUT, value="/addBook")
	public ResponseBean addBook(@RequestBody BookBean bookBean) {
		return libraryService.addBook(bookBean);
	}
}
