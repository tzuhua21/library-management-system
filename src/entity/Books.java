package entity;

import java.io.Serializable;

public class Books implements Serializable {
	private int id;
	 private String title;
	 private String author;
	 private int publisherId;
	 private String publishDate;
	 private String isbn;
	 private int  wordsCount;
	 private double unitPrice;
	 private String contenDescription;
	 private String authorDescription;
	 private String editorComment;
	 private String categoryId;
	 private String toc;
	 private int clicks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getPublisherid() {
		return publisherId;
	}
	public void setPublisherid(int publisherid) {
		this.publisherId = publisherid;
	}
	public String getPublishdate() {
		return publishDate;
	}
	public void setPublishdate(String publishdate) {
		this.publishDate = publishdate;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getWordsCount() {
		return wordsCount;
	}
	public void setWordsCount(int wordsCount) {
		this.wordsCount = wordsCount;
	}
	public double getUnitprice() {
		return unitPrice;
	}
	public void setUnitprice(double unitprice) {
		this.unitPrice = unitprice;
	}
	public String getContendescription() {
		return contenDescription;
	}
	public void setContendescription(String contendescription) {
		this.contenDescription = contendescription;
	}
	public String getAuthordescription() {
		return authorDescription;
	}
	public void setAuthordescription(String authordescription) {
		this.authorDescription = authordescription;
	}
	public String getEditorcomment() {
		return editorComment;
	}
	public void setEditorcomment(String editorcomment) {
		this.editorComment = editorcomment;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public int getClicks() {
		return clicks;
	}
	public void setClicks(int clicks) {
		this.clicks = clicks;
	}
	public String getToc() {
		return toc;
	}
	public void setToc(String toc) {
		this.toc = toc;
	}
	 public Books(){
		 super ();
	 }
		
}