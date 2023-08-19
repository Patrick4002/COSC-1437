/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.customer;

/**
 *
 * @author phatbui
 */
public class Customer {
    private String name;
    private int creditScore;

    public Customer() {
        this.name = null;
        this.creditScore = 300;
    }

    public Customer(String name, int creditScore) {
        setName(name);
        setCreditScore(creditScore);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCreditScore(int creditScore) {
        if (creditScore >= 300) {
            this.creditScore = creditScore;
        } else {
            this.creditScore = 300;
        }
    }

    public int getCreditScore() {
        return creditScore;
    }

    public String getCreditRating() {
        if (creditScore >= 200 && creditScore <= 629) {
            return "Bad";
        } else if (creditScore >= 630 && creditScore <= 689) {
            return "Fair";
        } else if (creditScore >= 690 && creditScore <= 719) {
            return "Good";
        } else if (creditScore >= 720 && creditScore <= 850) {
            return "Excellent";
        } else {
            return "Invalid credit score";
        }
    }
}
