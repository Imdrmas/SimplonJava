package com.projet.inter;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Personne implements Ipersonne {
	private int id;
	private String nom;
	private Date dateNais;
	private Double salaire;
	private Profil profil = new Profil();
	

	public Personne(int id, String nom, Date date, double salaire, Profil profil) {
		this.id = id;
		this.nom = nom;
		this.dateNais = date;
		this.salaire = salaire;
		this.profil = profil;
	}


	@Override
	public void afficher() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date = sdf.format(dateNais);
		
		String strValue = "ID: "+id+" Je suis le "+this.profil.getLibelle()+" mon nom est "+nom+" né le "+date+" "+calculerSalaire()+" Euros";
		System.out.println(strValue);
		
	}


	@Override
	public double calculerSalaire() {
		if(this.profil.getCode().equals("DG")) {
			return this.salaire = this.salaire+0.2*this.salaire;
		} else if (this.profil.getCode().equals("EMP")){
			return this.salaire = this.salaire+0.1*this.salaire;
		}
		return this.salaire;
	}

}
