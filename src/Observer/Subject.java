/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import java.util.*;

/**
 *
 * @author lenovo
 */
public class Subject {
    private List<Observer>observers= new ArrayList<>();
    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    public void removeObserevr(Observer observer){
        this.observers.remove(observer);
    }
    public void notifyObservers(int value){
        for(Observer observer: observers){
            observer.update(value);
        }
    }
}
