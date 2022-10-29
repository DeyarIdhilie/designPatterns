/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author lenovo
 */
public class Chart implements Observer {

    @Override
    public void update(int value) {
       System.out.println("chart got notified + value= "+value);
    }
    
}
