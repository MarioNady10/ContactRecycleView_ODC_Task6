package com.example.listview;

public class Contact {
    String name;
    String Number;
    int Image;

    public Contact(String name, String number, int image) {
        this.name = name;
        Number = number;
        Image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
