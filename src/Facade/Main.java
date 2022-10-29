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
    NotificationServer server = new NotificationServer();
    Connection connection = server.connect();
    AuthToken token = server.authenticate("root", "1234");
    Message msg = new Message("new msg");
    server.sendMessage(msg, token, "target");
    connection.disconnect();
    }
}
