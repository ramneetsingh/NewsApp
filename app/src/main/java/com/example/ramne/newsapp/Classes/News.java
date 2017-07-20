package com.example.ramne.newsapp.Classes;

/**
 * Created by ramne on 7/17/2017.
 */

public class News {
    private String Category;
    private String ImageUrl;
    private String Headline;
    private String TextUrl;
    private String Date;

    public  News()
    {

    }
    public News(String newsCategory, String newsImageUrl, String newsHeadline, String newsTextUrl, String newsDate) {
        this.Category = newsCategory;
        this.ImageUrl = newsImageUrl;
        this.Headline = newsHeadline;
        this.TextUrl = newsTextUrl;
        this.Date = newsDate;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getHeadline() {
        return Headline;
    }

    public void setHeadline(String headline) {
        Headline = headline;
    }

    public String getTextUrl() {
        return TextUrl;
    }

    public void setTextUrl(String textUrl) {
        TextUrl = textUrl;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
