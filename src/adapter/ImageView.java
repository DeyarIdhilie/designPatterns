/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author lenovo
 */
public class ImageView {
    private Image image;
    public ImageView(Image image){
        this.image = image;
    }
    public void applyFilter(Filter filter){
        filter.apply(image);
    }
}
