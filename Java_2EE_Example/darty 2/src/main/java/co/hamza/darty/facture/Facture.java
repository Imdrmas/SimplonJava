package co.hamza.darty.facture;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import co.hamza.darty.client.Client;
import co.hamza.darty.produit.Produit;
import co.hamza.livraison.Livraison;

public class Facture {

	private Client client;
	private Livraison livraison;

	private Map<Produit, Integer> produits = new HashMap<Produit, Integer>();

	private double total = 0;
	 StringBuilder str = new StringBuilder();
	 StringBuilder s = new StringBuilder();

	public Facture() {
		// TODO Auto-generated constructor stub
	}

	public Facture(Client client, Livraison livraison) {

		this.client = client;
		this.livraison = livraison;
	}

	public void addProduit(Produit produit, Integer quantite) {

		this.produits.put(produit, quantite);

	}

	public double totalProduits(Map<Produit, Integer> produits) {

		for (Entry<Produit, Integer> element : this.produits.entrySet()) {
			total += element.getKey().getPrix() * element.getValue();
		}
		total += livraison.getPrix();

		return total;
	}
	
	
	public StringBuilder afficherFacture(Map<Produit, Integer> produits) {
		s.append("------------------- FACTURE --------------------").append("<br> <br>");
		s.append(client.getNom()).append("<br>");
		s.append(client.getAdresse()).append("<br><br>");
		s.append("------------------- PRODUITS -------------------").append("<br><br>");
		s.append(resumePanier(produits));
		s.append("<br>-------------- MODE DE LIVRAISON ---------------").append("<br><br>");
		s.append(livraison.getInfo()).append("<br>");
		s.append("<br>------------------------------------------------").append("<br><br>");
		s.append("TOTAL : ").append(totalProduits(produits)).append(" euros").append("<br>");
		
		return s;
	}
	
	
	public StringBuilder resumePanier(Map<Produit, Integer> produits) {
	//	System.out.println("Résumé de votre panier : \n" );
		
		for (Entry<Produit, Integer> element : this.produits.entrySet()) {
			 str.append(element.getKey().getNom()).append(" - ").append(element.getKey().getDescription()).append(" - ").append(element.getKey().getPrix()).append(" euros").append(" - ").append(element.getValue()).append(" unités").append("<br>");
			 
		} 
		
		System.out.println("");
		return str ;
	}
	
	
	public void generate(Writer writer) throws FactureVide {
		if (this.produits.isEmpty()) {
			throw new FactureVide();
		}
		writer.start();
		writer.writeLine("\n------------------- FACTURE --------------------\n");
		writer.writeLine("DARTY Belleville");
		writer.writeLine("25 Boulevard de Belleville, 75011 Paris");
		writer.writeLine("");
		writer.writeLine("Facture à l'intention de : ");
		writer.writeLine(client.getNom());
		writer.writeLine(client.getAdresse());
		writer.writeLine("");
		writer.writeLine("\n------------------- PRODUITS -------------------\n");
		
//		writer.writeLine(this.resumePanier(produits));
		for (Map.Entry<Produit, Integer> entry : this.produits.entrySet()) {
			Produit produit = entry.getKey();
			Integer quantite = entry.getValue();
			writer.writeLine(produit.getNom() + " - " + produit.getPrix() + " - " + quantite + " unité(s)");
			writer.writeLine(produit.getDescription());
			writer.writeLine("");
		}
		writer.writeLine("-----------------------------------");
		writer.writeLine("Total : " + this.total);
		writer.stop();
	}

	public Client getClient() {
		return client;
	}

	public Map<Produit, Integer> getProduits() {
		return produits;
	}

}
