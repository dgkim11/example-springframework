package example.spring.core.lifecycle.postprocessor;

public class Sample1Bean {
    public void setEncoding(String encoding)    {
        System.out.println("[Sample1Bean] set encoding type to " + encoding);
    }
}
