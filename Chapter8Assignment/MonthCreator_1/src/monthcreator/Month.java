/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monthcreator;

/**
 *
 * @author phatbui
 */
public class Month {
    private int monthNumber;

    public Month(int m) {
        setMonthNumber(m);
    }

    public void setMonthNumber(int m) {
        if (m >= 1 && m <= 12) {
            monthNumber = m;
        } else {
            monthNumber = 1;
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July",
                                "August", "September", "October", "November", "December"};
        return monthNames[monthNumber - 1];
    }

    public String getSeason() {
        if (monthNumber >= 1 && monthNumber <= 2 || monthNumber == 12) {
            return "Winter";
        } else if (monthNumber >= 3 && monthNumber <= 5) {
            return "Spring";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            return "Summer";
        } else {
            return "Fall";
        }
    }

    @Override
    public String toString() {
        return "Month Number: " + monthNumber + "\nMonth Name: " + getMonthName() +
                "\nSeason: " + getSeason();
    }

    public boolean equals(Month month2) {
        return this.monthNumber == month2.getMonthNumber();
    }
}
