package com.myapp.model;

import com.myapp.enumeration.Gender;

public class UserDetails {


    private Gender gender;
    private int uid;
    private String firstname;
    private String lastname;
    private String email;
    private String contactno;

    public UserDetails() {
    }
    public Gender getGender() {
        return gender;
    }

    public int getUid() {
        return uid;
    }
    public void setGender(Gender gender) {
        this.gender=gender;
    }

    public void setId(int uid) {
        this.uid=uid;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getContactno() {
        return contactno;
    }
}
