/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author lenovo
 */
public class Main {
   public static void main(String args[]){
    NotificationService service = new NotificationService();
    service.sendMessage("hello world", "deyar_ip", "deyar", "1234");
    }
}
