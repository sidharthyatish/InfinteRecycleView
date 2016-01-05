package com.example.sidharthyatish.infinterecycleview;

/**
 * Created by Sidharth Yatish on 11-12-2015.
 */
public class Article {
    private String title;
    private String thumbUrl;
    private String date;
    private String content;

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
