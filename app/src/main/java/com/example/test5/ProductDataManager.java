package com.example.test5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductDataManager {

    
    public final Product getProduct() {
        Product product = new Product();

        product.setName("Dell Laptop");
        product.setThumbnail("https://btech.com/media/catalog/product/cache/e4d64343b1bc593f1c5348fe05efa4a6/i/t/item_xl_11566461_16471670.jpg");
        product.setImages(((new String[]{"https://btech.com/media/catalog/product/cache/e4d64343b1bc593f1c5348fe05efa4a6/i/t/item_xl_11566461_16471670.jpg", "https://altyseer.com/wp-content/uploads/2017/04/Dell-inspiron.jpg", "https://images-na.ssl-images-amazon.com/images/I/41aA0jNF8GL._AC_.jpg"})));
        product.setCreatedAt(1576227768L);
        product.setAvailability("In Stock");
        product.setOriginalPrice(8000);
        product.setSalePrice(6480);
        Store store = new Store();

        store.setId("giuhj44tn4");
        store.setName("Dynamic Store");
        store.setAvatar("https://pbs.twimg.com/profile_images/960492050960433152/P7JLux_-_400x400.jpg");
        store.setRating(4.5D);
        store.setCity("Cairo");
        store.setCountry("Egypt");
        product.setStore(store);
        product.setDescription("Best Dell Laptop ever made in history forever ever never Best Dell Laptop ever made in history forever ever neverBest Dell Laptop ever made in history forever ever never");

        ArrayList<Attribute> attributeslist = new ArrayList<>();
//        Attribute[] attributeslist = new Attribute[4];
        Attribute attribute1 = new Attribute();
        Attribute attribute2 = new Attribute();
        Attribute attribute3 = new Attribute();
        Attribute attribute4 = new Attribute();
//                 attribute1
        attribute1.setName("Color");
        attribute1.setType(AttributeType.COLOR);
        attribute1.setValues((new String[]{"#aaa9ad", "#000000"}));
        attributeslist.add(attribute1);
        //     attribute2
        attribute2.setName("Hard Disk");
        attribute2.setType(AttributeType.TEXT);
        attribute2.setValues((new String[]{"1 TB", "500GB"}));
        //   attribute3
        attribute3.setName("RAM");
        attribute3.setType(AttributeType.TEXT);
        attribute3.setValues(new String[]{"16GB", "8GB"});
        //attribute4
        attribute4.setName("Processor");
        attribute4.setType(AttributeType.TEXT);
        attribute4.setValues((new String[]{"i7", "i5"}));

        attributeslist.add(attribute2);
        attributeslist.add(attribute3);
        attributeslist.add(attribute4);

        product.setAttributes(attributeslist);


        ArrayList<Variant> variantArrayList = new ArrayList<>();

        ArrayList<ValueAttribute> valueAttributes1 = new ArrayList<>();
        Variant variant1 = new Variant();
        valueAttributes1.add(new ValueAttribute("Color", "#000000"));
        valueAttributes1.add(new ValueAttribute("Hard Disk", "1TB"));
        valueAttributes1.add(new ValueAttribute("RAM", "16GB"));
        valueAttributes1.add(new ValueAttribute("Processor", "i7"));
        variant1.setValueAttributes(valueAttributes1);
        variantArrayList.add(variant1);


        ArrayList<ValueAttribute> valueAttributes2 = new ArrayList<>();
        Variant variant2 = new Variant();

        valueAttributes2.add(new ValueAttribute("Color", "#aaa9ad"));
        valueAttributes2.add(new ValueAttribute("Hard Disk", "1 TB"));
        valueAttributes2.add(new ValueAttribute("RAM", "8GB"));
        valueAttributes2.add(new ValueAttribute("Processor", "i7"));
        variant2.setValueAttributes(valueAttributes2);


        ArrayList<ValueAttribute> valueAttributes3 = new ArrayList<>();
        Variant variant3 = new Variant();

        valueAttributes3.add(new ValueAttribute("Color", "#aaa9ad"));
        valueAttributes3.add(new ValueAttribute("Hard Disk", "500 GB"));
        valueAttributes3.add(new ValueAttribute("RAM", "32GB"));
        valueAttributes3.add(new ValueAttribute("Processor", "i7"));
        variant3.setValueAttributes(valueAttributes3);

        ArrayList<ValueAttribute> valueAttributes4 = new ArrayList<>();
        Variant variant4 = new Variant();
        valueAttributes4.add(new ValueAttribute("Color", "#000000"));
        valueAttributes4.add(new ValueAttribute("Hard Disk", "1 TB GB"));
        valueAttributes4.add(new ValueAttribute("RAM", "16GB"));
        valueAttributes4.add(new ValueAttribute("Processor", "i7"));
        variant4.setValueAttributes(valueAttributes4);

        ArrayList<ValueAttribute> valueAttributes5 = new ArrayList<>();
        Variant variant5 = new Variant();
        valueAttributes5.add(new ValueAttribute("Color", "#000000"));
        valueAttributes5.add(new ValueAttribute("Hard Disk", "1 TB GB"));
        valueAttributes5.add(new ValueAttribute("RAM", "64GB"));
        valueAttributes5.add(new ValueAttribute("Processor", "i5"));
        variant5.setValueAttributes(valueAttributes5);

        variantArrayList.add(variant2);
        variantArrayList.add(variant3);
        variantArrayList.add(variant4);
        variantArrayList.add(variant5);
        product.setVariants(variantArrayList);


//        attribute2.setName("Hard Disk");
//        attribute2.setType(AttributeType.TEXT);
//        attribute2.setValues((new String[]{"1 TB", "500 GB"}));
//
//        attribute3.setName("RAM");
//        attribute3.setType(AttributeType.TEXT);
//        attribute3.setValues(new String[]{"16 GB", "8 GB"});
//
//        attribute4.setName("Processor");
//        attribute4.setType(AttributeType.TEXT);
//        attribute4.setValues((new String[]{"i7", "i5"}));
//
//        attributeslist.add(attribute2);
//        attributeslist.add(attribute3);
//        attributeslist.add(attribute4);
//
//        product.setAttributes(attributeslist);


        return product;
    }
}
