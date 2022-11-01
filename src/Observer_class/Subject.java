/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer_class;

import java.util.*;

/**
 *
 * @author lenovo
 */
public class Subject {
    List<Observer>subscribers=new ArrayList<>();
    
    public void registerSubscriber(Observer subscriber){
        subscribers.add(subscriber);
    }
    public void notifySubscribers(){
        for(Observer observer:subscribers){
            observer.update();
        }
    }
}
