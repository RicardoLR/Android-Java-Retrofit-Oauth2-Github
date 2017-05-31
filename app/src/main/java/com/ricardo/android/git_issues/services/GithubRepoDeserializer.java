package com.ricardo.android.git_issues.services;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

import com.ricardo.android.git_issues.models.GithubRepo;


public class GithubRepoDeserializer implements JsonDeserializer<GithubRepo> {


    /**  Deserializamos porque la informacion viene 


    [
      {
        "id": 1296269,
        "owner": {
          "login": "octocat",

            ...
           "clave":"valor"
        },
        "name": "Hello-World",
        "url": "https://api.github.com/repos/octocat/Hello-World",
        1
        ...
        "clave":"valor"
      }
    ]

    */
    @Override
    public GithubRepo deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        
        GithubRepo githubRepo = new GithubRepo();

        JsonObject repoJsonObject =  json.getAsJsonObject();
        githubRepo.setName( repoJsonObject.get("name").getAsString() );
        githubRepo.setUrl( repoJsonObject.get("url").getAsString() );

        JsonElement ownerJsonElement = repoJsonObject.get("owner");
        JsonObject ownerJsonObject = ownerJsonElement.getAsJsonObject();
        githubRepo.setOwner( ownerJsonObject.get("login").getAsString() );

        return githubRepo;
    }
}