package com.ncs.library.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ncs.library.bean.BookBean;
import com.ncs.library.bean.ResponseBean;


@Service
public class LibraryService {
	private List<BookBean> bookList = new ArrayList<BookBean>();
	public LibraryService() {
		initializeBooks();
	}
	
	/*
	 * Initializing initial Library Books with few records
	 */
	private  void initializeBooks() {
		bookList.add(new BookBean("9781119139553", "AWS Certified Solutions Architect ", "Joe Baron", "John Wiley & Sons", "", "Sep 28, 2016", 504));
		bookList.add(new BookBean("0596007736", "Java In A Nutshell", "David Flanagan", "O'Reilly Media", "", "March 25, 2005", 1256));
		bookList.add(new BookBean("0596009208", "Head First Java", "Kathy Sierra", "O'Reilly Media", "", "February 19, 2005", 688 ));
		bookList.add(new BookBean("9780596007126", "Head First Design Patterns", "Kathy Sierra", "O'Reilly Media", "", "October 1, 2004", 694));
	}
	
	/*
	 * This method will Add/Update single Contact
	 */
	
	public ResponseBean addBook(BookBean bookBean) {
		ResponseBean responseBean = null;
		if(bookBean!=null && bookBean.getISBN() != null && bookBean.getISBN().length()>0) {
			bookList.add(bookBean);
			responseBean = new ResponseBean(true, "Book '"+bookBean.getTitle()+"' added successfully!");
		} else {
			responseBean = new ResponseBean(false, "Failed!!, Book '"+bookBean.getTitle()+"' not added in list");
		}
		return responseBean;
	}
	
	/*
	 * This Method will return List of Library Books
	 */
	public List<BookBean> getAllBooks() {
		return bookList;
	}
	
	public List<BookBean> getAllBooksByAuthor(String name){
		return bookList.stream().filter(t -> t.getAuthor().equalsIgnoreCase(name)).collect(Collectors.toList());
	}
	
	public List<BookBean> getAllBooksByTitleMatch(String title){
		return bookList.stream().filter(t -> t.getTitle().toUpperCase().contains(title.toUpperCase())).collect(Collectors.toList());
	}
	
}