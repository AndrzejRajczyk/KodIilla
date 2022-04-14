package com.kodilla.stream;

import stream.book.Book;
import stream.book.BookDirectory;
import stream.forumUser.Forum;
import stream.forumUser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {


        Forum forum = new Forum();
        Map<String, ForumUser> theResultForum= forum.getUsersList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getAge()>19)
                .filter(forumUser ->forumUser.getUserPostQuantity()>0)
                .collect(Collectors.toMap(forumUser->forumUser.getUserId(), forumUser->forumUser));

                    System.out.println("Filtred collection of Users: #"+theResultForum.size());
                    theResultForum.entrySet().stream()
                            .map(entry->"Key value: :" + entry.getKey() + " " + entry.getValue())
                            .forEach(System.out::println);

    }
}