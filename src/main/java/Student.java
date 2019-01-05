import lombok.Data;


public class Student {

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public int getGrade() {
        return grade;
    }

    public String name;
    public int rollno;
    public int grade;

    public Student(String name){
        this.name=name;
    }

    public Student(String name,int rollNo){
        this.name=name;
        this.rollno = rollNo;
    }

    public Student(int grade){
        this.grade= grade;

    }

    public void getInfo()
    {
        System.out.println("info Received" + name +" Roll no is "+ rollno+" grade is  "+ grade);
    }

}
