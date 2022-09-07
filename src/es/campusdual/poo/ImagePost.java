package es.campusdual.poo;

import java.time.LocalDate;
import java.util.List;

public class ImagePost extends Post {

	private String title;
	private int height;
	private int width;

	public ImagePost(LocalDate postDate, List<Comment> commentList, String title, int height, int width) {
		super(postDate, commentList);
		this.title = title;
		this.height = height;
		this.width = width;
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
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	
	
}
