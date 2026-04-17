package com.pluralsight;

public class Book {

    private int id;
    private String isbn;
    private String title;
    boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title, boolean b, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = b;
        this.checkedOutTo = checkedOutTo;

    }

    public int getId() { return this.id; }

    public void setId(String isId) { this.checkedOutTo = isId; }

    public String getIsbn() { return this.isbn; }

    public String getTitle() { return this.title; }

    public boolean getIsCheckedOut() { return this.isCheckedOut; }

    public void setIsCheckOut(boolean isCheckedOut) { this.isCheckedOut = isCheckedOut; }


    public String getCheckedOutTo() { return this.checkedOutTo; }

    public void setIsCheckedOutTo(String isCheckedOutTo) { this.checkedOutTo = isCheckedOutTo; }





    public static void checkOut() {


    }

    public static void checkIn() {


    }

}
