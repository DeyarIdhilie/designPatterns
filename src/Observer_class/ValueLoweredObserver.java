/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer_class;

/**
 *
 * @author lenovo
 */
public class ValueLoweredObserver implements Observer {
    private ConcreteSubject sub = new ConcreteSubject();
    private int value;
    int counter=0;
    public ValueLoweredObserver(ConcreteSubject sub){
        this.sub=sub;
    }
    @Override
    public void update() {
        if (counter ==0){
       System.out.println("ValueLoweredObserver="+this.sub.getValue());
       this.value=this.sub.getValue();
       counter++;
        }
        else if(counter>0){
            if(this.sub.getValue()<this.value){
                System.out.println("ValueLoweredObserver= "+this.sub.getValue());
            }
        }
    }
}
