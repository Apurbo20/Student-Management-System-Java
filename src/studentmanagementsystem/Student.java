
package studentmanagementsystem;


public class Student {
    private String id;
    String name;
    double cgpa;
    double registration_fee;
    void giving_exam() {
        System.out.println("Giving exam");
    
    }
     String attendingOnlineClass() {
        return "attending online classes";
    
    }//rule; the value the method will return it will be the type of the the method
     //void assignStudentInfo(String i, String n, double c){
     //contructor is special method
       public Student(String i, String n, double c, int f){
         id=i;
         name=n;
         cgpa=c;
         registration_fee = f;
     }
      String getId(){
          return id;
      }
      void setId(String a){
          id=a;
      }

}

