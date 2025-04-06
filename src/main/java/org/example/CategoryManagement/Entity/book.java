package org.example.CategoryManagement.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String author;
    private long cost;
    private Category category;

    public book() {
    }

    public book(Long id, String author, long cost, Category category) {
        this.id = id;
        this.author = author;
        this.cost = cost;
        this.category = category;
    }

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", cost=" + cost +
                ", category=" + category +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
