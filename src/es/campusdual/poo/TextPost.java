package es.campusdual.poo;

import java.time.LocalDate;
import java.util.List;

public class TextPost extends Post {
	
	private String title;
	private String content;
	
	public TextPost(LocalDate postDate, List<Comment> commentList, String title, String content) {
		super(postDate, commentList);
		this.title = title;
		this.content = content;
	}

	// GETTERS SETTERS
	

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	


}
