package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototypelib;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototypelib {

     String name;
     Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Set<Book> getBooks() {
        return books;
    }
    public Library shallowCopy() throws CloneNotSupportedException{
        return (Library) super.clone();
    }
    public Library deepCopy() throws CloneNotSupportedException{
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books=new HashSet<>();
        for(Book book: books){
            clonedLibrary.getBooks().add(book);
        }
        return  clonedLibrary;

       }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
