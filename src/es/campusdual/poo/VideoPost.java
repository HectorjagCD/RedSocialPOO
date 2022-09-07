package es.campusdual.poo;

import java.time.LocalDate;
import java.util.List;

public class VideoPost extends Post {

	private String title;
	private String quality;
	private Integer secsLenght;

	public VideoPost(LocalDate postDate, List<Comment> commentList, String title, String quality, Integer secsLenght) {
		super(postDate, commentList);
		this.title = title;
		this.quality = quality;
		this.secsLenght = secsLenght;
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
	 * @return the quality
	 */
	public String getQuality() {
		return quality;
	}

	/**
	 * @param quality the quality to set
	 */
	public void setQuality(String quality) {
		this.quality = quality;
	}

	/**
	 * @return the secsLenght
	 */
	public Integer getSecsLenght() {
		return secsLenght;
	}

	/**
	 * @param secsLenght the secsLenght to set
	 */
	public void setSecsLenght(Integer secsLenght) {
		this.secsLenght = secsLenght;
	}
	
	

	

}
