/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author phatbui
 */
// Employee Class (subclass of Person)
class Employee extends Person {
    private String employeeNumber;

    // No-argument constructor
    public Employee() {
        super();
        this.employeeNumber = "";
    }

    // 4-argument constructor
    public Employee(String name, String phoneNumber, String emailAddress, String employeeNumber) {
        super(name, phoneNumber, emailAddress);
        this.employeeNumber = employeeNumber;
    }

    // Getter and setter method for employeeNumber
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmployee Number: " + employeeNumber;
    }
}