package es.campusdual.poo;

import java.time.LocalDate;
import java.util.List;

public class TextPost extends Post {
	

	private String content;
	
	public TextPost(LocalDate postDate, List<Comment> commentList, String content) {
		super(postDate, commentList);
		this.content = content;
	}

	// GETTERS SETTERS
	

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
