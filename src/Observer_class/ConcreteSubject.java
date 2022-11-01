/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer_class;

/**
 *
 * @author lenovo
 */
public class ConcreteSubject extends Subject{
    private int value;
    public void setValue(int value){
        this.value = value;
        notifySubscribers();
        
    }
    public int getValue(){
        return this.value;
    }
}
