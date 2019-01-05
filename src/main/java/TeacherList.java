import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class TeacherList {

   private List<Info> list;
   private Map<String,String> map;
   private Set<String> set;

    public void getListInfo(){
        for(Info info : list)
        {
            System.out.println(info);
        }
    }
}
