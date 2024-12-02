package MyPackage;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBER_ORDERED) {
			itemOrdered[qtyOrdered] = disc;
			++qtyOrdered;
			System.out.println("The Disc has been added !!!");
		} else {
			System.out.println("The Cart is already full !!!");
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if (qtyOrdered + 1 < MAX_NUMBER_ORDERED) {
			itemOrdered[qtyOrdered] = dvd1;
			++qtyOrdered;
			itemOrdered[qtyOrdered] = dvd2;
			++qtyOrdered;
			System.out.println("The Disc has been added !!!");
		} else {
			System.out.println("The Cart is already full !!!");
		}
	}
	public void addDigitalVideoDisc (DigitalVideoDisc ...dvdList) {
		for (DigitalVideoDisc disc: dvdList) {
			if (qtyOrdered < MAX_NUMBER_ORDERED) {
				itemOrdered[qtyOrdered] = disc;
				++qtyOrdered;
				System.out.println("The Disc has been added !!!");
			} else {
				System.out.println("The Cart is already full !!!");
			}
		}
	}
	public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		boolean found = false;
		
		for (int i = 0 ; i < qtyOrdered ; ++i) {
			if (itemOrdered[i].equals(disc)) {
				found = true;
				for (int j = i ; j < qtyOrdered ; ++j) {
					itemOrdered[j] = itemOrdered[j + 1];
				}
				itemOrdered[qtyOrdered] = null; 
				--qtyOrdered;
				System.out.println("The Disc has been removed successfully !!!");
				break;
			}
		}
		
		if (!found) {
			System.out.println("Disk not found !!!");
		}
	}
	
	public double totalCost() {
		double totalCost = 0;
		
		for (int i = 0 ; i < qtyOrdered ; ++i) {
			totalCost += itemOrdered[i].getCost();
		}
		
		return totalCost;
	}
	
	public void printCart() {
		System.out.println("******************************CART******************************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < qtyOrdered; ++i) {
            DigitalVideoDisc dvd = itemOrdered[i];
            if (dvd != null) {
                System.out.println(dvd.getId() + ". " + dvd.getTitle() + " - " + dvd.getCategory() + " - " + dvd.getDirector() + " - " + dvd.getLength() + ": " + dvd.getCost() + " $ ");
            }
        }
		System.out.println("Total cost: " + totalCost());
		System.out.println("****************************************************************");
	}
	
	public void searchDVDById(int id) {
		boolean check = false;
		for (int i = 0; i < qtyOrdered; ++i) {
            DigitalVideoDisc dvd = itemOrdered[i];
            if (dvd != null && id == dvd.getId()) {
                System.out.println(dvd.getId() + ". " + dvd.getTitle() + " - " + dvd.getCategory() + " - " + dvd.getDirector() + " - " + dvd.getLength() + ": " + dvd.getCost() + " $ ");
                check = true;
            } 
        }
		if (!check) {
			System.out.println("DVD id " + id + " not found.");
		}
	}
	public void searchDVDByTitle(String title) {
		boolean check = false;
		for (int i = 0; i < qtyOrdered; ++i) {
            DigitalVideoDisc dvd = itemOrdered[i];
            if (dvd != null && title.equals(dvd.getTitle())) {
                System.out.println(dvd.getId() + ". " + dvd.getTitle() + " - " + dvd.getCategory() + " - " + dvd.getDirector() + " - " + dvd.getLength() + ": " + dvd.getCost() + " $ ");
                check = true;
            } 
        }
		if (!check) {
			System.out.println("DVD title " + title + " not found.");
		}
	}
}
