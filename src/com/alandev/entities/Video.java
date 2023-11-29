package com.alandev.entities;

public class Video extends Lesson {

    private String url;
    private Integer second;

    public Video() {
    }

    public Video(String title, String url, Integer second) {
        super(title);
        this.url = url;
        this.second = second;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    @Override
    public int duration() {
        return this.second;
    }
}
