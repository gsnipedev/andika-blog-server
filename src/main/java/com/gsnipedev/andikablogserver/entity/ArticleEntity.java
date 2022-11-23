package com.gsnipedev.andikablogserver.entity;

import javax.persistence.*;

@Entity
@Table(name = "article")
public class ArticleEntity {

    @Id
    @GeneratedValue
    protected int id;

    @Column(name = "title")
    protected String title;

    @Column(name = "img_url")
    protected String imgUrl;

    @Column(name = "text_content")
    protected String textContent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }
}
