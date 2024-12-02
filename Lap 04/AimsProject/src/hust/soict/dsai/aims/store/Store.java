package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    private boolean checkMedia(Media media) {
        return itemsInStore.contains(media);
    }

    public void addMedia(Media media) {
        if (!checkMedia(media)) {
            itemsInStore.add(media);
            System.out.println(media.getTitle() + " has been added to the store!");
        } else {
            System.out.println(media.getTitle() + " already exists in the store!");
        }
    }

    public void removeMedia(Media media) {
        if (checkMedia(media)) {
            itemsInStore.remove(media);
            System.out.println(media.getTitle() + " has been deleted from the store!");
        } else {
            System.out.println("There is no " + media.getTitle() + " in the store!");
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("****************STORE***************\nItems in the store:\n");
        if (itemsInStore.isEmpty()) {
            string.append("There are no items in the store!\n");
        } else {
            for (Media media : itemsInStore) {
                string.append(media.getTitle()).append(" - ").append(media.getCost()).append(" $\n");
            }
        }
        string.append("***************************************");
        return string.toString();
    }
}
