package com.gwolf.vo;

public class Company implements java.io.Serializable{
    private String title;
    private String note;

    @Override
    public String toString() {
        return "Company{" +
                "title='" + title + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public Company setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getNote() {
        return note;
    }

    public Company setNote(String note) {
        this.note = note;
        return this;
    }
}
