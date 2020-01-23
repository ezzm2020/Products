package com.example.test5;


public class Store {
    
    private String id = "";
    
    private String name = "";
    
    private String avatar = "";
    private double rating = 4.0D;
    
    private String city = "";
    
    private String country = "";

    
    public final String getId() {
        return this.id;
    }

    public final void setId( String var1) {
        this.id = var1;
    }

    
    public final String getName() {
        return this.name;
    }

    public final void setName( String var1) {
        this.name = var1;
    }

    
    public final String getAvatar() {
        return this.avatar;
    }

    public final void setAvatar( String var1) {
        this.avatar = var1;
    }

    public final double getRating() {
        return this.rating;
    }

    public final void setRating(double var1) {
        this.rating = var1;
    }

    
    public final String getCity() {
        return this.city;
    }

    public final void setCity( String var1) {
        this.city = var1;
    }

    
    public final String getCountry() {
        return this.country;
    }

    public final void setCountry( String var1) {

        this.country = var1;
    }
}
