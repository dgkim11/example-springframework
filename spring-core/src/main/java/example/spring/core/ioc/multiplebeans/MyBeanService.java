package example.spring.core.ioc.multiplebeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBeanService {
    @Autowired
    private List<MyBean> myBeanList;

    @Autowired
    @Qualifier("bean2")
    private MyBean myBean;

    @Autowired
    private MyBean primaryMyBean;

    public List<MyBean> getMyBeanList() {
        return myBeanList;
    }

    public MyBean getMyBean()  {
        return myBean;
    }

    public MyBean getPrimaryMyBean()    {
        return primaryMyBean;
    }
}
