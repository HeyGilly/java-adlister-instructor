package com.java_adlister.model;

import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {
    //-- Entities
    private long id;
    private String artist;
    private String albumName;
    private Date releaseDate;
    private Integer sales;
    private String genre;

    //-- Constructor with No fields
    public Album() {}
    //-- Constructor with all fields
    public Album(long id, String artist, String albumName, Date releaseDate, Integer sales, String genre) {
        this.id = id;
        this.artist = artist;
        this.albumName = albumName;
        this.releaseDate = releaseDate;
        this.sales = sales;
        this.genre = genre;
    }

    //-- getters and Setters
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}

    public String getArtist() {return artist;}
    public void setArtist(String artist) {this.artist = artist;}

    public String getAlbumName() {return albumName;}
    public void setAlbumName(String albumName) {this.albumName = albumName;}

    public Date getReleaseDate(int i) {return releaseDate;}
    public void setReleaseDate(Date releaseDate) {this.releaseDate = releaseDate;}

    public Integer getSales() {return sales;}
    public void setSales(Integer sales) {this.sales = sales;}

    public String getGenre() {return genre;}
    public void setGenre(String genre) {this.genre = genre;}

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", albumName='" + albumName + '\'' +
                ", releaseDate=" + releaseDate +
                ", sales=" + sales +
                ", genre='" + genre + '\'' +
                '}';
    }
}
