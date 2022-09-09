package es.campusdual.poo;

import java.util.List;

public class User {

	public String name;
	public List<User> followersList;
	public List<Post> postList;

	public User(String name) {
		this.name = name;
	}

	public User(String name, List<User> followersList, List<Post> postList) {

		this.name = name;
		this.followersList = followersList;
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
	 * @return the followersList
	 */
	public List<User> getFollowersList() {
		return followersList;
	}

	/**
	 * @param followersList the followersList to set
	 */
	public void setFollowersList(List<User> followersList) {
		this.followersList = followersList;
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
	public void addUser(List<User> usersList, User userToAdd) {
		Boolean noExiste= true;
		for (User usr : usersList) {
			if (usr == userToAdd) {
				System.out.println("El usuario " + userToAdd.getName()
						+ " ya existe en la red social, por favor elija otro nombre");
				noExiste=false;
			}
		}
		  if (noExiste){
			  String newUser = userToAdd.getName();
			  User a = new User(userToAdd.getName());
				usersList.add(userToAdd);
				System.out.println("Usuario " + userToAdd.getName() + " añadido correctamente");
			}

		// crear objeto con nombre de usuario en el main
		// pasar la lista de usuarios al add user condicuional

		// Añadimos un usuario a la red social
	}

	public void deleteUser() {
		// Borramos un usuario de la red social
	}

}
