/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singelton_class;

import java.util.*;

/**
 *
 * @author lenovo
 */
public class Singelton {
   private static Singelton instance;
   private List<String> servers= new ArrayList<>();
   String[]split;
   private Singelton(){
       System.out.println("instance created");
   }
   public static Singelton getInstance(){
       if (instance == null){
           instance = new Singelton();
       }
       
       return instance;
       
   }
   public boolean addServer(String server){
     
     split = server.split(" ");
     if (split[0].equalsIgnoreCase("HTTP")||split[0].equalsIgnoreCase("HTTPS")){
         for(String s:servers){
         if(s.equalsIgnoreCase(server)){
           return false;  
         }
         }
         servers.add(server);
         return true;
      
     }
     else
     return false;  
   }
   public void download(String h){
       for(String s:servers){
            split = s.split(" ");
           if(split[0].equalsIgnoreCase(h))
           System.out.println(s);
       }
   }
}
