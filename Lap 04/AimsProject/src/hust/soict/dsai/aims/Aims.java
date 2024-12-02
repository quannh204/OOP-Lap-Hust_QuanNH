package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.store.Store;

import java.util.Scanner;

public class Aims {

    static Cart cart1 = new Cart();
    static Store store = new Store();

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3: ");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4: ");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2: ");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4-5: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create some media items and add them to the store
        CompactDisc cd = new CompactDisc("To pimp a butterfly", "Rap", 19.99f, "KL", "kendrick lamar");
        DigitalVideoDisc dvd = new DigitalVideoDisc("John wick 4", "Action", 25.46f, "Chad Stahelski", 36);
        Track track1 = new Track("Demons", 28);
        Track track2 = new Track("Angels", 44);
        cd.addTrack(track1, track2);

        Book book1 = new Book("A song of ice and fire", "Novel", 42.34f);
        Book book2 = new Book("To kill a mockingbird", "Novel", 3.26f);
        book1.addAuthor("JRR Martin");
        book2.addAuthor("Harper Lee");

        store.addMedia(cd);
        store.addMedia(dvd);
        store.addMedia(book1);
        store.addMedia(book2);

        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            switch (choice) {
                case 1: // View store
                    storeMenu();
                    int storeChoice = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character
                    switch (storeChoice) {
                        case 1: // See media details
                            System.out.print("Enter the title of the media: ");
                            String title = scanner.nextLine();
                            store.displayMediaDetails(title);
                            mediaDetailsMenu();
                            int detailsChoice = scanner.nextInt();
                            scanner.nextLine(); // consume the newline character
                            switch (detailsChoice) {
                                case 1: // Add to cart
                                    store.addMediaToCart(title, cart1);
                                    break;
                                case 2: // Play media
                                    store.playMedia(title);
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Invalid choice!");
                            }
                            break;
                        case 2: // Add to cart
                            System.out.print("Enter the title of the media to add: ");
                            String addTitle = scanner.nextLine();
                            store.addMediaToCart(addTitle, cart1);
                            break;
                        case 3: // Play a media
                            System.out.print("Enter the title of the media to play: ");
                            String playTitle = scanner.nextLine();
                            store.playMedia(playTitle);
                            break;
                        case 4: // See current cart
                            cart1.print();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 2: // Update store
                    System.out.println("Options: ");
                    System.out.println("1. Add a media");
                    System.out.println("2. Remove a media");
                    System.out.print("Please choose a number: 1-2: ");
                    int updateChoice = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character
                    if (updateChoice == 1) {
                        // Add a media
                        System.out.print("Enter media title: ");
                        String mediaTitle = scanner.nextLine();
                        System.out.print("Enter media cost: ");
                        float mediaCost = scanner.nextFloat();
                        store.addMedia(new Book(mediaTitle, "Unknown", mediaCost)); // Example with Book type
                    } else if (updateChoice == 2) {
                        // Remove a media
                        System.out.print("Enter media title to remove: ");
                        String removeTitle = scanner.nextLine();
                        store.removeMedia(removeTitle);
                    } else {
                        System.out.println("Invalid option.");
                    }
                    break;
                case 3: // See current cart
                    cartMenu();
                    int cartChoice = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character
                    switch (cartChoice) {
                        case 1: // Filter medias in cart
                            System.out.println("Filter by: ");
                            System.out.println("1. By ID");
                            System.out.println("2. By Title");
                            int filterChoice = scanner.nextInt();
                            scanner.nextLine(); // consume the newline character
                            if (filterChoice == 1) {
                                System.out.print("Enter ID to filter by: ");
                                int id = scanner.nextInt();
                                cart1.filterById(id);
                            } else if (filterChoice == 2) {
                                System.out.print("Enter title to filter by: ");
                                String filterTitle = scanner.nextLine();
                                cart1.filterByTitle(filterTitle);
                            }
                            break;
                        case 2: // Sort medias in cart
                            System.out.println("Sort by: ");
                            System.out.println("1. By Title");
                            System.out.println("2. By Cost");
                            int sortChoice = scanner.nextInt();
                            scanner.nextLine(); // consume the newline character
                            if (sortChoice == 1) {
                                cart1.sortByTitle();
                            } else if (sortChoice == 2) {
                                cart1.sortByCost();
                            }
                            break;
                        case 3: // Remove media from cart
                            System.out.print("Enter title to remove from cart: ");
                            String mediaTitleToRemove = scanner.nextLine();
                            cart1.removeMedia(mediaTitleToRemove);
                            break;
                        case 4: // Play a media
                            System.out.print("Enter media title to play: ");
                            String playMedia = scanner.nextLine();
                            cart1.playMedia(playMedia);
                            break;
                        case 5: // Place order
                            System.out.println("Order placed! Your cart is now empty.");
                            cart1.clearCart();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 0: // Exit
                    System.out.println("Thank you for using AIMS!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
