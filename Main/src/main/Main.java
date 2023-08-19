/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author phatbui
 */

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an array of 4 People
        Person[] peopleArray = new Person[4];

        // First two elements are People objects
        peopleArray[0] = new Person("John Doe", "123-456-7890", "johndoe@example.com");
        peopleArray[1] = new Person("Jane Smith", "987-654-3210", "janesmith@example.com");

        // Next two elements are Employee objects
        peopleArray[2] = new Employee("Alice Johnson", "555-888-9999", "alice@example.com", "1234-5678");
        peopleArray[3] = new Employee("Bob Williams", "111-222-3333", "bob@example.com", "9876-5432");

        // Print each object using a loop
        for (Person person : peopleArray) {
            System.out.println(person);
            System.out.println();
        }
    }
}

