package com.borodatos.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Vitali Usik
 * 
 */
@Entity
@Table(name = "ARTICLE")
public class Article {

    public Article() {
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "TITLE_IMG")
    private String titleImg;
    
    @Column(name = "TITLE_IMG_V")
    private String titleImgV;
    
    @Column(name = "TITLE_IMG_S")
    private String titleImgS;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "DATE")
    private Date date;

    @Column(name = "LINK")
    private String link;

    @Column(name = "SECTION")
    private String section;

    @Column(name = "PRIORITY")
    private String priority;

    @Column(name = "VIEWS")
    @GeneratedValue
    private Integer views;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleImg() {
        return titleImg;
    }

    public void setTitleImg(String titleImg) {
        this.titleImg = titleImg;
    }

    public String getTitleImgV() {
        return titleImgV;
    }

    public void setTitleImgV(String titleImgV) {
        this.titleImgV = titleImgV;
    }

    public String getTitleImgS() {
        return titleImgS;
    }

    public void setTitleImgS(String titleImgS) {
        this.titleImgS = titleImgS;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }
}
