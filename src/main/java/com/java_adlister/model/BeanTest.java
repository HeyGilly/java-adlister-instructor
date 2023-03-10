package com.java_adlister.model;

import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args){
        Album whiteAlbum = new Album();
        whiteAlbum.setId(1);
        whiteAlbum.setAlbumName("The White Album");
        whiteAlbum.setArtist("The Beatles");
        whiteAlbum.setGenre("Rock");
        whiteAlbum.getReleaseDate(1978);
        whiteAlbum.setSales(200000);

        System.out.println(whiteAlbum);


        Author bob = new Author();
        bob.setId(2);
        bob.setFirstName("bob");
        bob.setLastName("lucas");



        ArrayList<Quote> quotes = new ArrayList<>();
        Quote quote = new Quote();
        quote.setId(3);
        quote.setContent("I like pizza");
       quote.setAuthor(String.valueOf(bob));
        quotes.add(quote);

        System.out.println(quotes);

        for (Quote x : quotes){
            System.out.println(x);
        }


    }


}
