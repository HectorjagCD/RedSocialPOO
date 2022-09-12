package es.campusdual.poo;

import java.util.List;

public class User {

	public String name;
	public List<User> followedList;
	public List<Post> postList;

	public User(String name) {
		this.name = name;
	}

	public User(String name, List<User> followedList, List<Post> postList) {

		this.name = name;
		this.followedList = followedList;
		this.postList = postList;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

	// GETTERS SETTERS
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the followedList
	 */
	public List<User> getFollowedList() {
		return followedList;
	}

	/**
	 * @param followedList the followedList to set
	 */
	public void setFollowedList(List<User> followersList) {
		this.followedList = followersList;
	}

	/**
	 * @return the postList
	 */
	public List<Post> getPostList() {
		return postList;
	}

	/**
	 * @param postList the postList to set
	 */
	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}

	// METODOS
	// Crear objeto con nombre de usuario en el main | Pasar la lista de usuarios al add user condicuional | Añadimos un usuario a la red social
	public void addUser(List<User> usersList) {
		if (!usersList.contains(this)) {
			usersList.add(this);
			System.out.println("Usuario "+ this.getName() + " añadido.");
		} else {
			System.out.println(
					"El usuario " + this.getName() + " ya existe en la red social, por favor elija otro nombre");
		}
	}
	
	// Borramos un usuario de la red social
	public void deleteUser(List<User> usersList) {
		if (usersList.contains(this)) {
			usersList.remove(this);
			System.out.println("Usuario "+ this.getName() + " removido.");
	}	else {
		System.out.println(
				"El usuario " + this.getName() + " no existe en la red social");
	}

	}
	// Creat post createPost
	
	public void createPost() {
		
		
	}
	

	
}
