package com.example.publiclibrary;

public class Newspaper extends EditorialOffice{

    private boolean isColor =false;
    private int releaseDate;

    public Newspaper(int cost, String name, int quantity, int numberOfRemainingBooks, String publishingHouse, String genre, int year, int timeToRead) {
        super(cost, name, quantity, numberOfRemainingBooks, publishingHouse, genre, year, timeToRead);
    }
}
