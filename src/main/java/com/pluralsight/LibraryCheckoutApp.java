package com.pluralsight;

import java.util.Scanner;

public class LibraryCheckoutApp {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        String[] libraryBooks = {"Harry Potter", "Bible", "World on Wars 2nd Edition", "Pre-Caclus", "Guide on non-fiction", "3D Sculpting for Dummies", "How to be Good at Life", "Promise Book", "The Madhouse", "Guide for Finding Jobs 2026 Edition", "Happy Tree Friends", "Master Studies of Leonardo da Vinci", "Dante's Inferno", "How to Learn Any Skill in Under 30 Minutes", "Artist's Survival Guide", "Taryn's Secret Stash", "Let Him Cook", "Horrors Across the Midwest", "Karoline and the Terrifying Cat", "The Misfits"};


        Book[] books = new Book[20];

        books[0] = new Book(0460,"153-6-12-351321-2","Harry Potter", false, "userName");
        books[1] = new Book(1464,"153-6-12-351321-2","Bible", false, "userName");
        books[2] = new Book(2464,"153-6-12-351321-2","World on Wars 2nd Edition", true, "James");
        books[3] = new Book(3464,"153-6-12-351321-2","Pre-Caclus", false, "userName");
        books[4] = new Book(4464,"153-6-12-351321-2","Guide on non-fiction", true, "Daniel");
        books[5] = new Book(5464,"153-6-12-351321-2","3D Sculpting for Dummies", false, "userName");
        books[6] = new Book(6464,"153-6-12-351321-2","How to be Good at Life", false, "userName");
        books[7] = new Book(7464,"153-6-12-351321-2","Promise Book", true, "Cheese");
        books[8] = new Book(8464,"153-6-12-351321-2","The Madhouse", false, "userName");
        books[9] = new Book(9464,"153-6-12-351321-2","Guide for Finding Jobs 2026 Edition", false, "userName");
        books[10] = new Book(1064,"153-6-12-351321-2","Happy Tree Friends", false, "userName");
        books[11] = new Book(1164,"153-6-12-351321-2","Master Studies of Leonardo da Vinci", true, "Fred");
        books[12] = new Book(1264,"153-6-12-351321-2","Dante's Inferno", true, "Debrah");
        books[13] = new Book(1364,"153-6-12-351321-2","How to Learn Any Skill in Under 30 Minutes", false, "userName");
        books[14] = new Book(1464,"153-6-12-351321-2","Artist's Survival Guide", true, "Jazz");
        books[15] = new Book(1564,"153-6-12-351321-2","Taryn's Secret Stash", false, "userName");
        books[16] = new Book(1664,"153-6-12-351321-2","Let Him Cook", false, "userName");
        books[17] = new Book(1764,"153-6-12-351321-2","Horrors Across the Midwest", true, "Henry");
        books[18] = new Book(1864,"153-6-12-351321-2","Karoline and the Terrifying Cat", false, "userName");
        books[19] = new Book(1964,"153-6-12-351321-2","The Misfits", true, "Sarah");

        //books[1].setIsCheckedOutTo("Dance");

        boolean breakLoop = true;

        System.out.println("Welcome to the digital Library!");
        Thread.sleep(3000);



        while (breakLoop) {

            System.out.println("\n===========------------------===========");
            System.out.println("Please select the what you want to do next!");
            System.out.println("===========------------------===========");
            Thread.sleep(2000);

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

                    //Loop for user choice!
                    while (!choiceCase1.equals("2")) {
                        choiceCase1 = sc.nextLine().trim();

                        for (int x = 0; x < books.length; x++ ) {
                            if (choiceCase1.equals(books[x].getId())) {
                                System.out.println("You Checked out " + books[x].getTitle());
                                System.out.print("What is your name? ");
                                books[x].setIsCheckedOutTo(sc.nextLine());
                                books[x].setIsCheckOut(true);

                            }

                            if (x == (books.length - 1)) {
                                System.out.println("\n===========------------------===========");
                                System.out.println("Type in a book id you want to check out!");
                                System.out.println("Type (2) go back to the main Library entrance");

                            }

                        }

                    }

                }
                case 2 -> {
                    for (int i = 0; i < books.length; i++ ){

                        if (books[i].getIsCheckedOut() == true) {
                            System.out.printf("\n%s, ----  Id: %d, ISBN: %s, %s Checked out this book",books[i].getTitle(), books[i].getId(), books[i].getIsbn(), books[i].getCheckedOutTo());
                        }
                        if (i == (books.length - 1)) {
                            System.out.println("\n===========------------------===========");
                            System.out.println("(C) Select a book you want to check in!");
                            System.out.println("(X) Go back to the main Library entrance");

                        }

                    }
                    //System.out.println("\n(C) Select a book you want to check in!");
                    //System.out.println("(X) Go back to the main Library entrance");

                    while (!choiceCase1.equals("X")) {
                        choiceCase1 = sc.nextLine().trim();

                        if (choiceCase1.equals("C")) {
                            System.out.println("Please type a book title to check in");
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
                                if (x == (books.length - 1)) {
                                    System.out.println("\n===========------------------===========");
                                    System.out.println("(C) Select a book you want to check in!");
                                    System.out.println("(X) Go back to the main Library entrance");

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
