package com.example.securityTest.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "User name shouldn't be empty")
    @Size(min = 2, max = 100, message = "User name should be between 2 and 100 characters")
    @Column(name = "username")
    private String userName;
    @Min(value = 1900, message = "Year of birth should be greater than 1900")
    @Column(name = "year_of_birth")
    private int yearOfBirth;

    @Column(name = "password")
    private String password;

    public Person() {
    }

    public Person(int id, String userName, int yearOfBirth, String password) {
        this.id = id;
        this.userName = userName;
        this.yearOfBirth = yearOfBirth;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", password='" + password + '\'' +
                '}';
    }
}
