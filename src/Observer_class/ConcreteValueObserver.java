/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer_class;

/**
 *
 * @author lenovo
 */
public class ConcreteValueObserver implements Observer{

    private ConcreteSubject sub = new ConcreteSubject();
    public ConcreteValueObserver(ConcreteSubject sub){
        this.sub=sub;
    }
    @Override
    public void update() {
       System.out.println("ConcreteValueObserver ="+this.sub.getValue());
    }
    
}
