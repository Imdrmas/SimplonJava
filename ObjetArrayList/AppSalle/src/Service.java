
import java.util.HashMap;

import java.util.Map;

import java.util.Scanner;

//import Salle;

//import java.util.*;

public class Service extends Salle implements ISalle {

	private Scanner idSc;
	private Scanner nameSc;
	private Scanner capiciteSc;
	private Scanner dispoSc;
	private Salle salle = new Salle();

	@Override
	public void create() {

		idSc = new Scanner(System.in);
		System.out.println("Enter ID");
		salle.setId(idSc.nextInt());

		nameSc = new Scanner(System.in);
		System.out.println("Enter Name");
		salle.setLeblle(nameSc.nextLine());

		capiciteSc = new Scanner(System.in);
		System.out.println("Enter Number Capicite");
		salle.setCapicite(capiciteSc.nextInt());

		dispoSc = new Scanner(System.in);
		System.out.println("Enter Dispo");
		salle.setDispo(dispoSc.nextBoolean());

	}

	@Override
	public void findAll() {
		int id = salle.getId();
		String name = salle.getLeblle();
		int capicite = salle.getCapicite();
		boolean dispo = salle.isDispo();

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("ID: ", id);
		map.put("Name: ", name);
		map.put("Capicite: ", capicite);
		map.put("Dispo: ", dispo);

		System.out.println("\nThis is Info Salle\n");
		for (Map.Entry<String, Object> str : map.entrySet()) {
			System.out.println(str.getKey() + " " + str.getValue());
		}

	}

	@Override
	public void update(int id) {

	}

}
