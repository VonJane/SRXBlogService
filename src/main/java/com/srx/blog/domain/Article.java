package com.srx.blog.domain;

public class Article {
    private Long id;

    private String articleTitle;

    private String articleContent;

    private String articleContentShort;

    private String articleSourceUri;

    private Integer istop;

    private Integer hascomment;

    private Long articleCategoryId;

    private Integer importance;

    private Long createBy;

    private String createDate;

    private Long updateBy;

    private String updateDate;

    private Long timestamp;

    private Integer isEffective;

    private String articleStatus;

    private String author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    public String getArticleContentShort() {
        return articleContentShort;
    }

    public void setArticleContentShort(String articleContentShort) {
        this.articleContentShort = articleContentShort == null ? null : articleContentShort.trim();
    }

    public String getArticleSourceUri() {
        return articleSourceUri;
    }

    public void setArticleSourceUri(String articleSourceUri) {
        this.articleSourceUri = articleSourceUri == null ? null : articleSourceUri.trim();
    }

    public Integer getIstop() {
        return istop;
    }

    public void setIstop(Integer istop) {
        this.istop = istop;
    }

    public Integer getHascomment() {
        return hascomment;
    }

    public void setHascomment(Integer hascomment) {
        this.hascomment = hascomment;
    }

    public Long getArticleCategoryId() {
        return articleCategoryId;
    }

    public void setArticleCategoryId(Long articleCategoryId) {
        this.articleCategoryId = articleCategoryId;
    }

    public Integer getImportance() {
        return importance;
    }

    public void setImportance(Integer importance) {
        this.importance = importance;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }

    public String getArticleStatus() {
        return articleStatus;
    }

    public String getAuthor() {
        return author;
    }

    public void setArticleStatus(String articleStatus) {
        this.articleStatus = articleStatus;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}