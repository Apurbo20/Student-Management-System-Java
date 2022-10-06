
package studentmanagementsystem;


public class StudentManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student saif = new Student("191-35-2629", "Saif", 3.9, 13500);
        //saif.assignStudentInfo("191-35-2629","Saif",3.7);
        System.out.println(saif.getId() + " " + saif.name + " " + saif.cgpa);
        saif.setId("191-35-2999");
        saif.giving_exam();
        System.out.println(saif.attendingOnlineClass());
        Student meem = new Student("191-35-2705", "Meem", 3.81, 13000);
        //if use method
        //meem.assignStudentInfo("191-35-2705", "Meem",3.8);
        System.out.println(meem.getId() + " " + meem.name + " " + meem.cgpa);
        meem.giving_exam();
        System.out.println(meem.attendingOnlineClass());
        teacher apurbo = new teacher("191-35-2629 ", "Saif ", 15000);
        System.out.println(apurbo.id + apurbo.name + apurbo.salary);
        apurbo.taking_exam();
        System.out.println(apurbo.takingOnlineClass());
        Admin a1 = new Admin();
        //a1.add(5, 10);
        a1.givingWaiver(saif);
        a1.givingWaiver(meem);
        a1.givingRegistrationClearence(saif);
        a1.givingRegistrationClearence(meem);
    }
    
}
