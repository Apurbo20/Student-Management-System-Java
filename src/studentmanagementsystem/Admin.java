
package studentmanagementsystem;


public class Admin {
    
 //   void add(int a, int b){
        //System.out.println(a+b);
    //}
    
   protected void givingWaiver(Student ab){
        if(ab.cgpa>3.8)
            System.out.println("10% waiver");
    
    }
    void givingRegistrationClearence(Student s){
        if(s.registration_fee>=13500)
            System.out.println("clearence done");
    }
}
