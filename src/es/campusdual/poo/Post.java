package es.campusdual.poo;

import java.time.LocalDate;
import java.util.List;


public class Post {
	
	protected LocalDate postDate;
	protected List<Comment> commentList;
	
	public Post(LocalDate postDate, List<Comment> commentList) {
		
		this.postDate = postDate;
		this.commentList = commentList;
	}

	// GETTERS SETTERS
	
	/**
	 * @return the postDate
	 */
	public LocalDate getPostDate() {
		return postDate;
	}

	/**
	 * @param postDate the postDate to set
	 */
	public void setPostDate(LocalDate postDate) {
		this.postDate = postDate;
	}

	/**
	 * @return the commentList
	 */
	public List<Comment> getCommentsList() {
		return commentList;
	}

	/**
	 * @param commentList the commentList to set
	 */
	public void setCommentsList(List<Comment> commentsList) {
		this.commentList = commentsList;
	}
	
	
	
}
