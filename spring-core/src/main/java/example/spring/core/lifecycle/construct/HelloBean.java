package example.spring.core.lifecycle.construct;

public class HelloBean {
    public void initBean()  {
        System.out.println("init HelloBean");
    }

    public void closeBean() {
        System.out.println("close HelloBean");
    }

    public void hello()   {
        System.out.println("Hello world ~ from HelloBean");
    }
}
