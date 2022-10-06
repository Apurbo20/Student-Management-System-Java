
package studentmanagementsystem;

public class teacher {
    String id;
    String name;
    double salary;
    void taking_exam() {
        System.out.println("taking exam");
    }
     String takingOnlineClass() {
        return "taking online classes";
    
    }
         teacher(String i, String n, double c){
         id=i;
         name=n;
         salary=c;
     }
}