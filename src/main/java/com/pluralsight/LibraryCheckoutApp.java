package com.pluralsight;

import java.util.Scanner;

public class LibraryCheckoutApp {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        String[] libraryBooks = {"Harry Potter", "Bible", "World on Wars 2nd Edition", "Pre-Caclus", "Guide on non-fiction", "3D Sculpting for Dummies", "How to be Good at Life", "Promise Book", "The Madhouse", "Guide for Finding Jobs 2026 Edition", "Happy Tree Friends", "Master Studies of Leonardo da Vinci", "Dante's Inferno", "How to Learn Any Skill in Under 30 Minutes", "Artist's Survival Guide", "Taryn's Secret Stash", "Let Him Cook", "Horrors Across the Midwest", "Karoline and the Terrifying Cat", "The Misfits"};

        //Book harryPotter = new Book(5464,"1536123513212","Harry Potter", false, "userName");

        Book[] books = new Book[20];

        books[0] = new Book(0460,"1536123513212","Harry Potter", false, "userName");
        books[1] = new Book(1464,"1536123513212","Bible", false, "userName");
        books[2] = new Book(2464,"1536123513212","World on Wars 2nd Edition", true, "James");
        books[3] = new Book(3464,"1536123513212","Pre-Caclus", false, "userName");
        books[4] = new Book(4464,"1536123513212","Guide on non-fiction", true, "Daniel");
        books[5] = new Book(5464,"1536123513212","3D Sculpting for Dummies", false, "userName");
        books[6] = new Book(6464,"1536123513212","How to be Good at Life", false, "userName");
        books[7] = new Book(7464,"1536123513212","Promise Book", true, "Cheese");
        books[8] = new Book(8464,"1536123513212","The Madhouse", false, "userName");
        books[9] = new Book(9464,"1536123513212","Guide for Finding Jobs 2026 Edition", false, "userName");
        books[10] = new Book(1064,"1536123513212","Happy Tree Friends", false, "userName");
        books[11] = new Book(1164,"1536123513212","Master Studies of Leonardo da Vinci", true, "Fred");
        books[12] = new Book(1264,"1536123513212","Dante's Inferno", true, "Debrah");
        books[13] = new Book(1364,"1536123513212","How to Learn Any Skill in Under 30 Minutes", false, "userName");
        books[14] = new Book(1464,"1536123513212","Artist's Survival Guide", true, "Jazz");
        books[15] = new Book(1564,"1536123513212","Taryn's Secret Stash", false, "userName");
        books[16] = new Book(1664,"1536123513212","Let Him Cook", false, "userName");
        books[17] = new Book(1764,"1536123513212","Horrors Across the Midwest", true, "Henry");
        books[18] = new Book(1864,"1536123513212","Karoline and the Terrifying Cat", false, "userName");
        books[19] = new Book(1964,"1536123513212","The Misfits", true, "Sarah");

        //books[1].setIsCheckedOutTo("Dance");

        boolean breakLoop = true;

        System.out.println("Welcome to the digital Library!");
        //Thread.sleep(3000);



        while (breakLoop) {

            System.out.println("\nPlease select the what you want to do next!");
            //Thread.sleep(3000);

            System.out.println("(1) Show Available Books");
            System.out.println("(2) Show Checked Out Books");
            System.out.println("(3) Exit out of this Library :(");

            int choice1 = sc.nextInt();
            String choiceCase1 = "";

            switch (choice1) {

                case 1 -> {
                    for (int i = 0; i < books.length; i++ ){
                        //Loop for Checked in books

                        if (books[i].getIsCheckedOut() == false) {
                            System.out.printf("\n%s,  ----  Id: %d, ISBN: %s ",books[i].getTitle(), books[i].getId(), books[i].getIsbn());
                        }


                    }

                    System.out.println("\nType in a book you want to check out");
                    System.out.println("Type (2) go back to the main Library entrance");
                    //Loop for user choice!
                    while (!choiceCase1.equals("2")) {
                        choiceCase1 = sc.nextLine().trim();

                        for (int x = 0; x < books.length; x++ ) {
                            if (choiceCase1.equals(books[x].getTitle())) {
                                System.out.println("You got " + books[x].getTitle());
                                System.out.print("What is your name? ");
                                books[x].setIsCheckedOutTo(sc.nextLine());
                                books[x].setIsCheckOut(true);
                            }

                        }

                    }

                }
                case 2 -> {
                    for (int i = 0; i < books.length; i++ ){

                        if (books[i].getIsCheckedOut() == true) {
                            System.out.printf("\n%s, ----  Id: %d, ISBN: %s, %s Checked out this book",books[i].getTitle(), books[i].getId(), books[i].getIsbn(), books[i].getCheckedOutTo());
                        }

                    }
                    System.out.println("\n(C) Select a book you want to check in!");
                    System.out.println("(X) Go back to the main Library entrance");

                    while (!choiceCase1.equals("X")) {
                        choiceCase1 = sc.nextLine().trim();

                        if (choiceCase1.equals("C")) {
                            System.out.println("Please Select a book to check in");
                            String choiceCase2 = sc.nextLine();

                            for (int x = 0; x < books.length; x++) {
                                if (choiceCase2.equals(books[x].getTitle())) {
                                    System.out.println("You are attempting to check in " + books[x].getTitle());
                                    System.out.print("What is the book id? ");
                                    int userCheckId = sc.nextInt();
                                    sc.nextLine();
                                    if (userCheckId == books[x].getId()) {
                                        books[x].setIsCheckOut(false);
                                        System.out.println("Successfully Checked in!");
                                    } else {
                                        System.out.println("Invalid id");
                                    }
                                }

                            }

                        }


                    }

                }

                case 3 -> {
                    breakLoop = false;
                }

            }
            if (choice1 == 3) {
                break;
            }
        }



    }


}
