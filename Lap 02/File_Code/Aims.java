public class Aims {
	public static void main(String[] args) {
		// Create a new Cart
		Cart newOrder = new Cart();
		
		DigitalVideoDisc disc1 = new DigitalVideoDisc("The King of Lion", "LiveAction", "LongPahm", 69, 19.99);
		DigitalVideoDisc disc2 = new DigitalVideoDisc("Avenger: End game", "LiveAction", "Anthony Russo", 119, 11.99);
		DigitalVideoDisc disc3 = new DigitalVideoDisc("Hercules", "Cartoon", "Anthony Russo", 79, 10.99);
		DigitalVideoDisc disc4 = new DigitalVideoDisc("The King of Lion", "LiveAction", "LongPahm", 99, 9.99);
		
		newOrder.addDigitalVideoDisc(disc1);
		newOrder.addDigitalVideoDisc(disc2);
		newOrder.addDigitalVideoDisc(disc3);
		newOrder.addDigitalVideoDisc(disc4);
		
		System.out.print("Total cost is: ");
		System.out.println(newOrder.totalCost());
		
		newOrder.removeDigitalVideoDisc(disc1);
		System.out.print("Total cost is: ");
		System.out.println(newOrder.totalCost());
	}
}
