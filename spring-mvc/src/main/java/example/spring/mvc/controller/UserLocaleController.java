package example.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.Locale;

/**
 * UserLocale을 설정하는 예제이다. User Locale은 Configuration 클래스에서 LocaleResolver 빈을 통해서 Locale이 처리된다.
 * 여기서는 Locale에 따라 Resource bundle에 정의된 메세지를 보여주는 예제이다. 이 예제는 Handlebars에서 제공하는 i18n Helper를
 * 이용해서 Locale에 따라 resource bundle에 정의된 메세지를 처리한다.
 */
@Controller
public class UserLocaleController {
    @Autowired
    private ReloadableResourceBundleMessageSource msg;

    @GetMapping("/userlocale/{clientName}")
    public String userLocale(@PathVariable String clientName, Model model, Locale locale)  {
        String welcomeMessage = MessageFormat.format(msg.getMessage("welcome.message", null, locale), clientName, LocalDateTime.now().toString());
        model.addAttribute("welcomeMessage", welcomeMessage);

        return "userlocale";
    }
}
