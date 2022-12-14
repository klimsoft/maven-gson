package org.example;

import com.google.gson.Gson;

public class Info {
    private String author;
    private String version;
    private String year;

    public Info(String author, String version, String year) {
        this.author = author;
        this.version = version;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getVersion() {
        return version;
    }

    public String getYear() {
        return year;
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}
