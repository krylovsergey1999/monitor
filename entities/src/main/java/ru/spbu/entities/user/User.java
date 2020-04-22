package ru.spbu.entities.user;

import ru.spbu.entities.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "usr")
public class User extends BaseEntity {
    private String name;

    private String email;

    private String country;

    private String website;

    // Constructors
    public User() {
        super();
    }

    public User(Long id, String name, String email, String country, String website) {
        super(id);
        this.name = name;
        this.email = email;
        this.country = country;
        this.website = website;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}