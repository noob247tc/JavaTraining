import org.w3c.dom.ls.LSOutput;

public class Students {

    String name = "Spongebob";
    int age;
    double gpa;
    boolean isEnrolled;

    Students(String name, int age, double gpa){

        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;

    }
    void study(){
        System.out.println(this.name + "is studying");
    }

}
