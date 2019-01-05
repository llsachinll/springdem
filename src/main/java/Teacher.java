import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Teacher {
    private Info info1;
    private Info info2;
    private Info info3;

    public void getTeacherInfo() {
        System.out.println("Info1 = "+ info1 + " Info2 is "+info2 + " Info 3 is "+ info3);

    }

}
