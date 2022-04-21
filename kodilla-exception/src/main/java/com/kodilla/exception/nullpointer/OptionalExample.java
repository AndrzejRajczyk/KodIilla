package com.kodilla.optional;

import com.kodilla.exception.test.Useroptional;


import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Useroptional user = new Useroptional("user1", 30, 100, "Test");

        Optional<Useroptional> optionalUser = Optional.ofNullable(user);

        optionalUser.ifPresent(u -> System.out.println(u.getUsername()));
    }
}