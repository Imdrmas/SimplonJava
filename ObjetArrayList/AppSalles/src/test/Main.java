package test;

import java.util.Scanner;

import model.Salle;
import service.Service;

public class Main {

	static Scanner codeSc = new Scanner(System.in);
	static Scanner liballeSc = new Scanner(System.in);
	static Scanner idSc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("\nInformations Salles\n");

		Service service = new Service();
		service.Create(new Salle(1, "A", "Salle "));
		service.Create(new Salle(2, "B", "Salle "));
		service.Create(new Salle(3, "C", "Salle "));
		service.Create(new Salle(4, "D", "Salle "));

		System.out.println("\nEnter An ID To Update Salle");
		int idUpdate = idSc.nextInt();
		service.update(idUpdate);

		System.out.println("\nDelete Salle Enter The ID");
		int idDelete = idSc.nextInt();
		service.delete(idDelete);

	}

}
