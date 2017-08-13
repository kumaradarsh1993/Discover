package com.example.kadar.discover;

/**
 * Created by kadar on 11-08-2017.
 */

public class ArticleModel {
    String title;
    String link;
    String description;
    String imageResourceId;
    int isfav;
    int isturned;

    ArticleModel()
    {
        title="";
        link="";
        description="";
        imageResourceId="";
        isfav=0;
        isturned=0;
    }

    public int getIsturned() {
        return isturned;
    }
    public void setIsturned(int isturned) {
        this.isturned = isturned;
    }

    public int getIsfav() {
        return isfav;
    }
    public void setIsfav(int isfav) {
        this.isfav = isfav;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageResourceId() {
        return imageResourceId;
    }
    public void setImageResourceId(String imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}

