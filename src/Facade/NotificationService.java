/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author lenovo
 */
public class NotificationService {
    public void sendMessage(String message, String target, String username, String password){
       NotificationServer server= new NotificationServer();
       Connection connection = server.connect();
       AuthToken token = server.authenticate(username, password);
       Message msg = new Message(message);
       server.sendMessage(msg,token,target);
       connection.disconnect();
    }
}
