package com.example.retrofitsample;

import java.util.ArrayList;

public class Model {
    private int page;
    private int per_page;
    private int total;

    public void setPage(int page) {
        this.page = page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    private int total_pages;
    private ArrayList<Data> data;

    public Model(int page, int per_page, int total, int total_pages, ArrayList<Data> data) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_pages = total_pages;
        this.data = data;
    }

    public int getPage() {
        return page;
    }

    public int getPer_page() {
        return per_page;
    }

    public int getTotal() {
        return total;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public ArrayList<Data> getData() {
        return data;
    }
}
