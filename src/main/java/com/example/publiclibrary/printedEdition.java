package com.example.publiclibrary;

public class printedEdition {
    private int cost;
    private String name;
    private int quantity;
    private int numberOfRemainingBooks;
    private String publishingHouse;
    private String genre;
    private int year;
    private int timeToRead;

    public printedEdition(int cost, String name, int quantity, int numberOfRemainingBooks, String publishingHouse, String genre, int year, int timeToRead) {
        this.cost = cost;
        this.name = name;
        this.quantity = quantity;
        this.numberOfRemainingBooks = numberOfRemainingBooks;
        this.publishingHouse = publishingHouse;
        this.genre = genre;
        this.year = year;
        this.timeToRead = timeToRead;
    }

}
