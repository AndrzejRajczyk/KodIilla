package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Product")
public final class Product {
    int id;
    String name;
    private List<Item> item = new ArrayList<>();


    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "ID", unique = true)
    @NotNull
    @GeneratedValue
    public int getId() {
        return id;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }
    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItem() {
        return item;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }


    public void setName(String name) {
        this.name = name;
    }
}


