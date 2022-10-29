/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter.najahFilters;
import adapter.Filter;
import adapter.Image;
/**
 *
 * @author lenovo
 */
public class Desert implements Filter{

    public void init(){
        
    }
    public void prepare(){
        
    }
    public void render(Image image){
        System.out.println("Desert Filter");
    }
    @Override
    public void apply(Image img) {
        init();
        prepare();
        render(img);
       }
    
}
