package net.blf2.model;

/**
 * Created by t_mengxh on 2016/10/28.
 */
public class ArticleInfo {
    private String articleId;
    private String articleTitle;
    private String articleText;
    private String articleAuthorId;
    private Long articleCreatedTime;
    private Integer articleRule;
    private Integer articleStatus;
    private String tagList;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleText() {
        return articleText;
    }

    public void setArticleText(String articleText) {
        this.articleText = articleText;
    }

    public String getArticleAuthorId() {
        return articleAuthorId;
    }

    public void setArticleAuthorId(String articleAuthorId) {
        this.articleAuthorId = articleAuthorId;
    }

    public Long getArticleCreatedTime() {
        return articleCreatedTime;
    }

    public void setArticleCreatedTime(Long articleCreatedTime) {
        this.articleCreatedTime = articleCreatedTime;
    }

    public Integer getArticleRule() {
        return articleRule;
    }

    public void setArticleRule(Integer articleRule) {
        this.articleRule = articleRule;
    }

    public Integer getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(Integer articleStatus) {
        this.articleStatus = articleStatus;
    }

    public String getTagList() {
        return tagList;
    }

    public void setTagList(String tagList) {
        this.tagList = tagList;
    }
}
