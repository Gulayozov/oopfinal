package com.fproject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "employee")
@Getter
@Setter
public class UsersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String login;
    private String password;
    private String email;

    // Default constructor
    public UsersModel() {
    }

    // Constructor with all fields
    public UsersModel(Integer id, String login, String password, String email) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    // Constructor without id
    public UsersModel(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    // Constructor without email
    public UsersModel(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public UsersModel(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersModel that = (UsersModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(login, that.login) &&
                Objects.equals(password, that.password) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, email);
    }

    @Override
    public String toString() {
        return "UsersModel{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
