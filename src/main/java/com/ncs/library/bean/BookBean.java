package com.ncs.library.bean;
/*
 * This Pojo is used to store all values for Book Attributes
 */
public class BookBean {
	private String ISBN;
	private String title;
	private String author;
	private String publisher;
	private String editor;
	private String datePublished;
	private int totalPage;
	public BookBean(String iSBN, String title, String author, String publisher, String editor, String datePublished,
			int totalPage) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.editor = editor;
		this.datePublished = datePublished;
		this.totalPage = totalPage;
	}
	public BookBean() {
		
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public String getDatePublished() {
		return datePublished;
	}
	public void setDatePublished(String datePublished) {
		this.datePublished = datePublished;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	@Override
	public String toString() {
		return "BookBean [ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", editor=" + editor + ", datePublished=" + datePublished + ", totalPage=" + totalPage + "]";
	}
	
}
