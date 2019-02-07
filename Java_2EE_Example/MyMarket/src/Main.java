
public class Main {

	public static void main(String[] args) {
		Product tv = new Television("Tv LG", "New Product From Lg", 300, 18, "2019");
		Product Computer = new Computer("Mac", "New MakPro ", 1230, 24, "2018");		
		Product telephone = new Telephone("Samsung", "New Telephone", 200, "2020");
		
	   Customer customer = new Customer("Name: issam drmas", "Address: 1 Rue Marchale 75000 Paris ");
	   Customer customer2 = new Customer("Name: Asmail AlFadil", "Address: 1 Rue Kartuom Sudan ");
       Bill bill = new Bill(customer, new ExpressDelivery(3));
       Bill bill2 = new Bill(customer2, new RelayDelivery(1));
    
       bill.addProduct(tv, 1);
       bill.addProduct(Computer, 1);
       bill.addProduct(telephone, 2);
      // bill.getTotal();
       
       bill2.addProduct(telephone, 3);
       bill2.addProduct(tv, 1);
       bill2.addProduct(Computer, 1);

	   bill.generate();
	   bill2.generate();
       
	}

}
