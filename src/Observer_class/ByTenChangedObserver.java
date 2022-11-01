/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer_class;
import java.lang.Math.*;
/**
 *
 * @author lenovo
 */
public class ByTenChangedObserver implements Observer{
    private ConcreteSubject sub = new ConcreteSubject();
    private int value;
    int counter=0;
    public ByTenChangedObserver(ConcreteSubject sub){
        this.sub=sub;
    }
    @Override
    public void update() {
        if (counter ==0){
       System.out.println("ByTenChangedObserver="+this.sub.getValue());
       this.value=this.sub.getValue();
       counter++;
        }
        else if(counter>0){
            if(Math.abs(this.sub.getValue()-this.value )>=10){
                System.out.println("ByTenChangedObserver= "+this.sub.getValue());
            }
        }
    } 
}
