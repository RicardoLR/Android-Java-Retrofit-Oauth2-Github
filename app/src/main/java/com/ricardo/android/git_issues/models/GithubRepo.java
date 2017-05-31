package com.ricardo.android.git_issues.models;

public class GithubRepo {
    private String name;
    private String owner;
    private String url;

    @Override
    public String toString() {
        return(getName() + " " + getUrl());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}