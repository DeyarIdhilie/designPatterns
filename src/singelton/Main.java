/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singelton;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String args[]){
        Singelton singelton = Singelton.getInstance(7);
        Singelton newSingelton = Singelton.getInstance(10);
        System.out.println(singelton.value);
        System.out.println(newSingelton.value);
    }
}
