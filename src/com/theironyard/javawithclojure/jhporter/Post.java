package com.theironyard.javawithclojure.jhporter;

/**
 * Created by jeffryporter on 5/26/16.
 */
public class Post
{
    int replyID;
    String author;
    String text;

    public Post(int replyID, String author, String text)
    {
        this.replyID = replyID;
        this.author = author;
        this.text = text;
    }
}
