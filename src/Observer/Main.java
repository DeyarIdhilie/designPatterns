/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String args[]){
        DataSource datasource = new DataSource();
        var chart1 = new Chart(datasource);
        var spreadSheet1 = new Spreadsheet(datasource);
        datasource.addObserver(chart1);
        datasource.addObserver(spreadSheet1);
        datasource.setValue(7);
    }
}
