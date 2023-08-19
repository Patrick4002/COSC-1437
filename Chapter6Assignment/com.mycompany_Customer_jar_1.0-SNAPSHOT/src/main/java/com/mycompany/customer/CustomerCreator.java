/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.customer;

/**
 *
 * @author phatbui
 */
public class CustomerCreator {
    public static void main(String[] args) {
        Customer customer = new Customer("Bob Smith", 640);
        System.out.println("Name: " + customer.getName());
        System.out.println("Credit Score: " + customer.getCreditScore());
        System.out.println("Credit Rating: " + customer.getCreditRating());
    }
}
