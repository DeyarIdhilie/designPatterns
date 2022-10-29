/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;
import adapter.najahFilters.Desert;
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
       Desert desert = new Desert();
       DesertFilter desertfilter= new DesertFilter(desert);
       imageview.applyFilter(desertfilter);
       
   } 
}
