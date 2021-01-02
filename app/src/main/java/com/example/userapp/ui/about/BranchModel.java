package com.example.userapp.ui.about;

public class BranchModel {

    private int img;
    private  String tittle,description;

    public BranchModel(int img, String tittle, String description) {
        this.img = img;
        this.tittle = tittle;
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
