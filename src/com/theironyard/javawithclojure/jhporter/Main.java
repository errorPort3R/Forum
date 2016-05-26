package com.theironyard.javawithclojure.jhporter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	    ArrayList<Post> posts = new ArrayList<>();

        //parse file
        File f = new File("posts.txt");
        Scanner fileScanner =  new Scanner(f);
        while (fileScanner.hasNext())
        {

            String line = fileScanner.nextLine();
            String[] fields = line.split("\\|");
            Post post = new Post(Integer.valueOf(fields[0]), fields[1], fields[2]);
            posts.add(post);
        }

        Scanner input = new Scanner(System.in);
        int currentPost = -1;
        while (currentPost != -2)
        {
            //print out replies to current post
            int postID = 0;
            for(Post post :posts)
            {
                if(post.replyID == currentPost)
                {
                    System.out.printf("[%d]%s by %s\n",postID, post.text, post.author);
                }
                postID++;
            }
            //ask for new id
            System.out.println("type the ID you want to see replies to: ");
            currentPost = Integer.valueOf(input.nextLine());
        }
    }
}
