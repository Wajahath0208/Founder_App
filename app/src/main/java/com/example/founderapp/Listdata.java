package com.example.founderapp;

public class Listdata {
    int  img_id;
    String foundername;
    String description;
    String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }



    public Listdata(int img_id, String foundername, String description,String company) {
        this.img_id = img_id;
        this.foundername = foundername;
        this.description = description;
        this.company=company;
    }

    public int getImg_id() {
        return img_id;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }

    public String getFoundername() {
        return foundername;
    }

    public void setFoundername(String foundername) {
        this.foundername = foundername;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
