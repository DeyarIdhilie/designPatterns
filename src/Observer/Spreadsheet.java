/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author lenovo
 */
public class Spreadsheet implements Observer {

    @Override
    public void update() {
       System.out.println("Spreadsheet got notified");
    }
    
}
