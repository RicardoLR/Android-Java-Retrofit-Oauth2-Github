package com.ricardo.android.git_issues.models;

import com.google.gson.annotations.SerializedName;

public class GithubIssue {

    private String id;
    private String title;
    private String comments_url;

    @SerializedName("body")
    private
    String comment;

    @Override
    public String toString() {
        return getId() +  " - " + getTitle();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComments_url() {
        return comments_url;
    }

    public void setComments_url(String comments_url) {
        this.comments_url = comments_url;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}