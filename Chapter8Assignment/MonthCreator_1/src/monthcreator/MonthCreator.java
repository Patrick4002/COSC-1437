/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monthcreator;

/**
 *
 * @author phatbui
 */
public class MonthCreator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Month month1 = new Month(10);
        Month month2 = new Month(11);

        System.out.println(month1.toString());
        System.out.println(month2.toString());

        if (month1.equals(month2)) {
            System.out.println("October is equal to November");
        } else {
            System.out.println("October is not equal to November");
        }
    }
    
}
