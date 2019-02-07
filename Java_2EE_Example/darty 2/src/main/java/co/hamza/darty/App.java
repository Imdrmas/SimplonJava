package co.hamza.darty;

import java.util.Map;
import java.util.Scanner;

import co.hamza.darty.client.Client;
import co.hamza.darty.facture.Facture;
import co.hamza.darty.facture.FactureVide;
import co.hamza.darty.facture.FileWriter;
import co.hamza.darty.produit.Four;
import co.hamza.darty.produit.Frigo;
import co.hamza.darty.produit.Produit;
import co.hamza.darty.produit.Tele;
import co.hamza.livraison.ADomicile;
import co.hamza.livraison.Express;
import co.hamza.livraison.Livraison;
import co.hamza.livraison.Relay;
import co.hamza.livraison.SurPlace;

public class App {
	public static void main(String[] args) {
		Tele tele = new Tele("Samsung", "Téléviseur LED rond", 800, 40);
		Four four = new Four("LG", "Four micro-onde à double rotative", 70, 100);
		Frigo frigo = new Frigo("Siemens", "Frigo qui fait du froid", 200, 'A');

		Client client = new Client("Tony Truand", "3 rue de là-bas 99300");

		Livraison livraison = null;

		System.out.println("Veuillez choisir un mode de livraison : \n" + "1 - Livraison à domicile  \n"
				+ "2 - Livraison Express  \n" + "3 - Dépot en point relais  \n"
				+ "4 - Marchandise à retirer sur place  ");

		Scanner sc = new Scanner(System.in);
		int saisie = sc.nextInt();

		switch (saisie) {
		case 1:
			livraison = new ADomicile();

			break;
		case 2:
			livraison = new Express();

			break;
		case 3:
			livraison = new Relay();

			break;
		case 4:
			livraison = new SurPlace();

			break;
		}

		Facture facture = new Facture(client, livraison);

		facture.addProduit(tele, 2);
		facture.addProduit(frigo, 1);
		facture.addProduit(four, 2);

		Map<Produit, Integer> listeProduits = facture.getProduits();
		
		
		facture.resumePanier(listeProduits);

//		facture.afficherFacture(listeProduits);

//		System.out.println("Le total des commandes hors livraison est de " + facture.totalProduits(listeProduits) + " euros");
//		
//		FileWriter fichier = new FileWriter("/Users/simplon/Desktop/Facture_" + client.getNom() + ".txt");
//
//		try {
//			facture.generate(fichier);
//		} catch (FactureVide e) {
//			System.out.println("Votre panier est vide.");
//		}

	}
}
