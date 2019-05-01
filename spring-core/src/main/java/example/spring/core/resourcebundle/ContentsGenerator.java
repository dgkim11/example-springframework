package example.spring.core.resourcebundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class ContentsGenerator {
    @Autowired
    private MessageSource msg;

    public String getContents() {
        return msg.getMessage("contents.title", null, Locale.getDefault()) + "," +
                msg.getMessage("contents.body", null, Locale.getDefault());
    }
}
