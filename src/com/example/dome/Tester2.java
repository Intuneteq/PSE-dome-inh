package com.example.dome;

public class Tester2
{
    public static void main(String[] args)
    {
        Item p = new Item("AAA", 20);
        DVD v = new DVD("Matilda","Disney",94);
        CD c = new CD("Metallica", "Metallica",9,75);

        String s;

        // This will run because the method is available in the DVD class
        s = v.getDirector();

        // This will not run because getDirector method implemented in CD class
        //s = c.getDirector();

        // This will not run because there is no getDirector method implemented in the Item class
        //s = p.getDirector();

        //s =  v.getArtist();
        s =  c.getArtist();
        //s =  p.getArtist();

        s = v.getComment();
        s = c.getComment();
        s = p.getComment();

        s = v.getTitle();
        s = c.getTitle();
        s = p.getTitle();


    }
}