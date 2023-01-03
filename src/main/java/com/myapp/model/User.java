package com.myapp.model;
import com.myapp.enumeration.Gender;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String firstname;
    private String lastname;
    private String Contactno;
    private String email;
    private Gender gender;
    private String password;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getContactno() {
        return Contactno;
    }

    public void setContactno(String contactno) {
        Contactno = contactno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                    "id=" + id +
                    ", firstname=" + firstname +
                    ", lastname='" + lastname + '\'' +
                    ", ContactNo='" + Contactno + '\'' +
                    ", Password='" + password + '\'' +
                    ", gender=" + gender +
                    ", email='" + email + '\'' +
                    '}';
    }
}
