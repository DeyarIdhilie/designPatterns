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
public class DesertFilter implements Filter{

    private Desert desert;
    public DesertFilter(Desert desert){
        this.desert= desert;
    }
    @Override
    public void apply(Image img) {
        desert.init();
        desert.prepare();
        desert.render(img);
    }
    
}
