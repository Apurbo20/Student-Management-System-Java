/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestModule;
 import studentmanagementsystem.*;

public class Teacher extends Admin {
    void check(){
        Student  saif = new Student ("191-35-2629", "Saif", 3.9, 13500);
        //System.out.println(saif.id);
        Admin a1 = new Admin();
        givingWaiver(saif);
    }
}
