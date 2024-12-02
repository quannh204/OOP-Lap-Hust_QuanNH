package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.Collections;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    public void addMedia(Media media) {
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full. Can't add more items.");
        } else {
            itemsOrdered.add(media);
            System.out.println("The item \"" + media.getTitle() + "\" has been added!");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.isEmpty()) {
            System.out.println("Your cart is empty!");
        } else if (itemsOrdered.remove(media)) {
            System.out.println("The item \"" + media.getTitle() + "\" has been removed successfully!");
        } else {
            System.out.println("No matching item found!");
        }
    }

    public float totalCost() {
        float sum = 0.0f;
        for (Media media : itemsOrdered) {
            sum += media.getCost();
        }
        return sum;
    }

    public void print() {
        StringBuilder output = new StringBuilder("*********************CART**************************\nOrdered items:\n");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            Media media = itemsOrdered.get(i);
            output.append(i + 1).append(". ").append(media.toString()).append("\n");
        }
        output.append("Total: ").append(totalCost()).append(" $\n");
        output.append("***************************************************\n");
        System.out.println(output);
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Result: " + media.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No match found!");
        }
    }

    public void sortByTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        print();
    }

    public void sortByCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        print();
    }
}
