package es.campusdual.poo;

import java.time.LocalDate;

public class Comment {

	private String commentText;
	private LocalDate commentDate;
	private String userCommentOwner;

	public Comment(String commentText, LocalDate commentDate, String userCommentOwner) {
		super();
		this.commentText = commentText;
		this.commentDate = commentDate;
		this.userCommentOwner = userCommentOwner;
	}

	// GETTERS SETTERS

	/**
	 * @return the commentText
	 */
	public String getCommentText() {
		return commentText;
	}

	/**
	 * @param commentText the commentText to set
	 */
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	/**
	 * @return the commentDate
	 */
	public LocalDate getCommentDate() {
		return commentDate;
	}

	/**
	 * @param commentDate the commentDate to set
	 */
	public void setCommentDate(LocalDate commentDate) {
		this.commentDate = commentDate;
	}

	/**
	 * @return the userCommentOwner
	 */
	public String getUserCommentOwner() {
		return userCommentOwner;
	}

	/**
	 * @param userCommentOwner the userCommentOwner to set
	 */
	public void setUserCommentOwner(String userCommentOwner) {
		this.userCommentOwner = userCommentOwner;
	}

}
