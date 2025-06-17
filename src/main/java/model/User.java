package model;

public class User {
	
	private String nom;
	private String email;
	
	public User(String nom, String email) {
		this.nom = nom;
		this.email = email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getEmail() {
		return email;
	}
}
