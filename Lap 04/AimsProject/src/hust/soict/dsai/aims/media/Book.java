package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		
	}
	
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		for(String author: authors) {
			if(authorName.equals(author)) {
				System.out.println("Author Name da ton tai!!");
				return;
			}
		}
		authors.add(authorName);
	}
	
	public void removeAuthor(String authorName) {
		for(String author: authors) {
			if(authorName.equals(author)) {
				authors.remove(author);
				System.out.println("Author" + author + " da duoc xoa khoi danh sach");
				return;
			}
		}
		System.out.println("Author không tồn tại trong danh sách!");
	}
	
}