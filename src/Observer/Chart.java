/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author lenovo
 */
public class Chart implements Observer {

    DataSource dataSource = new DataSource();
    public Chart(DataSource datasource){
        this.dataSource= datasource;
    }
    @Override
    public void update() {
       System.out.println("chart got notified + value= "+dataSource.getValue());
    }
    
}
