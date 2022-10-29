/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singelton;

/**
 *
 * @author lenovo
 */
public final class Singelton {
    private static Singelton singeltonInstance;
    public int value;
    private Singelton(int value){
        try{
            Thread.sleep(1000);
            
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
        this.value = value;
        System.out.println("new object is created");
    }
    public static Singelton getInstance(int value){
        if(singeltonInstance == null){
            singeltonInstance = new Singelton(value);
            
        }
        else 
            System.out.println("object already exist");
        return singeltonInstance;
    }
}
