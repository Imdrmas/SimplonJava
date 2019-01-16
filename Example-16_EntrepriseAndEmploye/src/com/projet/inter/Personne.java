package com.projet.inter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Personne implements IPersonne {

	private int id;
	private String nom;
	private String prenom;
	private Date dateNais;
	private double salaire;
	
	Profil profil = new Profil();
	
		public Personne(int id, String nom, String prenom, Date dateNais, double salaire, Profil profil ) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNais = dateNais;
		this.salaire = salaire;		
		this.profil = profil;
		this.id = id++;
			
	}

	public Personne(String nom, String prenom, Date dateNais, double salaire) {
			// TODO Auto-generated constructor stub
		this.nom = nom;
		this.prenom = prenom;
		this.dateNais = dateNais;
		this.salaire = salaire;
		}

	@Override
	public void affiche() {
		
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		String date = sd.format(dateNais);
	
		String values = "ID: "+id+ " Je suis le " + this.profil.getLibelle() + " mon est "+nom+ " " + prenom+" né le "+date+ " mon salaire est "+
				calculerSalaire()+" Euros";
		System.out.println(values);
		
				
	}
	@Override
	public double calculerSalaire() {	
		
		if(this.profil.getCode().equals("DG")) {
			return this.salaire = this.salaire+0.2*this.salaire;
		}
		if(this.profil.getCode().equals("EMP")) {
			return this.salaire = this.salaire+0.1*this.salaire;
		}
		
	  return this.salaire;
	  
	}
	
	
	
}
