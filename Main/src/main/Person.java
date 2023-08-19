/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author phatbui
 */
class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;

    // No-argument constructor
    public Person() {
        this.name = "";
        this.phoneNumber = "";
        this.emailAddress = "";
    }

    // 3-argument constructor
    public Person(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    // toString method
    @Override
    public String toString() {
        return "Name: " + name + "\nPhone: " + phoneNumber + "\nEmail: " + emailAddress;
    }
}
