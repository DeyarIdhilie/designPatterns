/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singelton_class;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String args[]){
        
        Singelton instance = Singelton.getInstance();
        Singelton instance2 = Singelton.getInstance();
        boolean b= instance.addServer("http sarah");
        boolean c= instance.addServer("https marah");
        boolean d= instance.addServer("htt marah");
        boolean f= instance2.addServer("https farah");
        instance.download("https");
        instance2.download("http");
    }
}
