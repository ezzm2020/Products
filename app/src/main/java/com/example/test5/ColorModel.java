package com.example.test5;

import androidx.databinding.BindingAdapter;

public class ColorModel {
    int img;
    String namecolor;


    public ColorModel(int img, String namecolor) {
        this.img = img;
        this.namecolor = namecolor;
    }

    public ColorModel(String namecolor) {
        this.namecolor = namecolor;
    }
    public ColorModel(int img) {
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNamecolor() {
        return namecolor;
    }

    public void setNamecolor(String namecolor) {
        this.namecolor = namecolor;
    }
}
