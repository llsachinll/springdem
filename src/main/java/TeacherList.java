import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class TeacherList implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

   private List<Info> list;
   private Map<String,String> map;
   private Set<String> set;

    public void getListInfo(){
        for(Info info : list)
        {
            System.out.println(info);
        }
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);


    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    public void setBeanName(String name) {
        System.out.println(name);

    }
}
