/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author lenovo
 */
public class Main {
   public static void main(String args[]){
       Image image = new Image();
       ImageView imageview = new ImageView(image);
       VividFilter filter = new VividFilter();
       imageview.applyFilter(filter);
   } 
}
