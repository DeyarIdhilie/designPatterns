/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer_class;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String args[]){
       ConcreteSubject sub = new ConcreteSubject();
       ConcreteValueObserver obs = new ConcreteValueObserver(sub);
       ValueLoweredObserver obs2 = new ValueLoweredObserver(sub);
       ByTenChangedObserver obs3= new ByTenChangedObserver(sub);
       sub.registerSubscriber(obs);
       sub.registerSubscriber(obs2);
       sub.registerSubscriber(obs3);
       sub.setValue(7);
       sub.setValue(6);
       sub.setValue(9);
       sub.setValue(17);
    }
}
