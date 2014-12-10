package com.borodatos.model;

import java.util.Date;

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
    
    @Column(name = "TAGS")
    private String tags;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "DATE")
    private Date date;
    
    @Column(name = "STATUS")
    private String status;

    @Column(name = "LINK")
    private String link;

    @Column(name = "SECTION")
    private String section;

    @Column(name = "PRIORITY")
    private String priority;

    @Column(name = "VIEWS")
    @GeneratedValue
    private Integer views;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the titleImg
	 */
	public String getTitleImg() {
		return titleImg;
	}

	/**
	 * @param titleImg the titleImg to set
	 */
	public void setTitleImg(String titleImg) {
		this.titleImg = titleImg;
	}

	/**
	 * @return the titleImgV
	 */
	public String getTitleImgV() {
		return titleImgV;
	}

	/**
	 * @param titleImgV the titleImgV to set
	 */
	public void setTitleImgV(String titleImgV) {
		this.titleImgV = titleImgV;
	}

	/**
	 * @return the titleImgS
	 */
	public String getTitleImgS() {
		return titleImgS;
	}

	/**
	 * @param titleImgS the titleImgS to set
	 */
	public void setTitleImgS(String titleImgS) {
		this.titleImgS = titleImgS;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the tags
	 */
	public String getTags() {
		return tags;
	}

	/**
	 * @param tags the tags to set
	 */
	public void setTags(String tags) {
		this.tags = tags;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}

	/**
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}

	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}

	/**
	 * @return the views
	 */
	public Integer getViews() {
		return views;
	}

	/**
	 * @param views the views to set
	 */
	public void setViews(Integer views) {
		this.views = views;
	}

}
