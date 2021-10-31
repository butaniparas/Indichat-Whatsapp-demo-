package com.example.indichat.model;

public class callmodel {
    int image;
    String header;
    String desc;
    int icon;

    public callmodel(int image, String header, String desc,int icon) {
        this.image = image;
        this.header = header;
        this.desc = desc;
        this.icon = icon;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
