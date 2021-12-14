package com.example.publiclibrary;

public class EditorialOffice extends printedEdition{
    private int number;
    private String chiefEditor;

    public EditorialOffice(int cost, String name, int quantity, int numberOfRemainingBooks, String publishingHouse, String genre, int year, int timeToRead) {
        super(cost, name, quantity, numberOfRemainingBooks, publishingHouse, genre, year, timeToRead);
    }
}
