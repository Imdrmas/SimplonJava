package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import doa.ISalle;
import model.Salle;

public class Service implements ISalle {

	Salle salle = new Salle();
	Scanner codeSc = new Scanner(System.in);
	Scanner liballeSc = new Scanner(System.in);
	Scanner idSc = new Scanner(System.in);

	@Override
	public void Create(Salle s) {
		List<Salle> list = new ArrayList<Salle>();
		list.add(s);

		for (Salle salle : list) {
			System.out.println(salle.getCode() + " " + salle.getLiballe() + " " + salle.getId());
		}

	}

	@Override
	public void update(int id) {

		List<Salle> list = new ArrayList<Salle>();
		list.add(salle);

		System.out.println("\nEnter New Code");
		String code = codeSc.next();

		list.get(0).setCode(code);
		System.out.println("New Code Updated " + salle.getCode());

		System.out.println("\nEnter New Name");
		String liballe = liballeSc.nextLine();
		list.get(0).setLiballe(liballe);
		System.out.println("New Name Updated " + salle.getLiballe());

	}

	@Override
	public void delete(int id) {

		ArrayList<Salle> list = new ArrayList<Salle>();
		Iterator<Salle> itr = list.iterator();

		while (itr.hasNext()) {
			Salle index = itr.next();
			if (index.id == id) {
				itr.remove();
			}
		}
		System.out.println("Salle Deleted From Size " + id);

	}

}
