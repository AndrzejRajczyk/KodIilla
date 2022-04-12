package com.kodilla.testing.forum.statistics;

public class AdvStatistics  {
    double commentQuantity;
    double postsQuantity;
    double averagePostsPUsers;
    double averageCommentsPUsers;
    int usersQuantity;
    double averageCommentsPPost;





    void calculateAdvStatistics(Statistics statistics) {

        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentQuantity = statistics.commentsCount();
        averageCommentsPPost = statistics.commentsCount();
        if(usersQuantity==0){
            averagePostsPUsers=0;
            averageCommentsPUsers=0;
        }
        else{
            averagePostsPUsers  = postsQuantity/usersQuantity;
            averageCommentsPUsers = commentQuantity/usersQuantity;
        }
        if (postsQuantity ==0){
            averageCommentsPPost=0;
        }
        else{ averageCommentsPPost = commentQuantity/postsQuantity;
        }

    }

    void showStatistics() {
        System.out.println("Post quantity: " + postsQuantity);
        System.out.println("Comments quantity: " + commentQuantity);
        System.out.println("Users quantity: " + usersQuantity);
        System.out.println("Posts per user: " + averageCommentsPPost);
        System.out.println("Average comments per user: " + averageCommentsPUsers);
        System.out.println("Average comments per user: "+ averagePostsPUsers);
    }
}
