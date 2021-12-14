package com.example.publiclibrary;

public class Journal extends EditorialOffice{

    private String statements;
    private int Month;

    public Journal(int cost, String name, int quantity, int numberOfRemainingBooks, String publishingHouse, String genre, int year, int timeToRead) {
        super(cost, name, quantity, numberOfRemainingBooks, publishingHouse, genre, year, timeToRead);
    }
}
