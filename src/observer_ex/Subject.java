/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer_ex;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class Subject {
    private List<Observer>subscribers = new ArrayList<>();
    public void addSubscriber(Observer observer){
        subscribers.add(observer);
    }
    public void removeSubscriber(Observer observer){
        subscribers.remove(observer);
    }
    public void notifySubscribers(){
        for(Observer observer:subscribers){
            observer.update();
        }
    }
}
