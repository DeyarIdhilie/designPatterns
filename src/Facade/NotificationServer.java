/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author lenovo
 */
public class NotificationServer {
   //open a new connection
    public Connection connect(){
        return new Connection();
    }
    //authentication
    public AuthToken authenticate(String username, String password){
        return new AuthToken();
    }
    //send message to targer
    public void sendMessage(Message message, AuthToken token, String target){
        System.out.println("sending messgae,"+message.msg);
    }
}
