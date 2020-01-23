package com.example.test5;



import java.util.ArrayList;
import java.util.List;

public  class Product {
    
    private String name = "";
    
    private String thumbnail = "";
    
    private String[] images;
    private long createdAt;
    
    private String availability;
    private int originalPrice;
    private int salePrice;
    
    private Store store;
    
    private String description;
    
    private ArrayList<Attribute> attributes;
    
    private ArrayList<Variant> variants;

    public Product( String name,  String thumbnail,  String[] images, long createdAt,  String availability, int originalPrice, int salePrice,  Store store,  String description,  ArrayList<Attribute> attributes,  ArrayList<Variant> variants) {
        this.name = name;
        this.thumbnail = thumbnail;
        this.images = images;
        this.createdAt = createdAt;
        this.availability = availability;
        this.originalPrice = originalPrice;
        this.salePrice = salePrice;
        this.store = store;
        this.description = description;
        this.attributes = attributes;
        this.variants = variants;
    }

    public Product() {
    }

    
    public String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }

    
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail( String thumbnail) {
        this.thumbnail = thumbnail;
    }

    
    public String[] getImages() {
        return images;
    }

    public void setImages( String[] images) {
        this.images = images;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    
    public String getAvailability() {
        return availability;
    }

    public void setAvailability( String availability) {
        this.availability = availability;
    }

    public int getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(int originalPrice) {
        this.originalPrice = originalPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    
    public Store getStore() {
        return store;
    }

    public void setStore( Store store) {
        this.store = store;
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription( String description) {
        this.description = description;
    }

    
    public ArrayList<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes( ArrayList<Attribute> attributes) {
        this.attributes = attributes;
    }

    
    public ArrayList<Variant> getVariants() {
        return variants;
    }

    public void setVariants( ArrayList<Variant> variants) {
        this.variants = variants;
    }
}
