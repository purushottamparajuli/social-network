package com.example.polina.socialnetwork;

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by polina on 04.06.15.
 */
public interface API {
    public JSONObject logIn (String email, String password);
    public JSONObject logInWithFacebook (String token);
    public JSONObject signUp (String email, String password);
    public JSONObject saveProfile(String name, String birthday, String sex, String imageUrl, String imageMiniUrl);
    public  JSONObject getProfile();
    public  JSONObject getUser(String userId);
    public JSONObject newPost (String message, JSONObject location,  String image, String account);
    public JSONObject getLoadPosts(String userId, String postId);
    public JSONObject sendComment(String postId, String comment);
    public JSONObject deletePost(String postId);
    public JSONObject getComments(String postId);
    public JSONObject editComment(String postId, String commentId, String comment) throws JSONException;
    public JSONObject deleteComment(String postId, String commentId);
    public JSONObject findUsers (String name, int offset);
    public JSONObject getFollowers(String id, int offset);
    public JSONObject getFollowing (String id, int offset);
    public JSONObject getFeed (String postId);








}
