package com.example.demo.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;



@Entity
public class Etablissement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	@ManyToOne(fetch = FetchType.EAGER)
	private Ville ville;
	@Transient
	@OneToMany(mappedBy="etablissement")
	private List<Employe> employes;
	@Transient
	@OneToMany(mappedBy="etablissement")
	private List<Etudiant> etudiants;
	@Transient
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	public List<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Etablissement other = (Etablissement) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Etablissement(int id, String nom, Ville ville, List<Employe> employes, List<Etudiant> etudiants) {
		super();
		this.id = id;
		this.nom = nom;
		this.ville = ville;
		this.employes = employes;
		this.etudiants = etudiants;
	}
	public Etablissement() {
		super();
	}
	
	
	
	
}
