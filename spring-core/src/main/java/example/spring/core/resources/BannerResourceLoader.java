package example.spring.core.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 특정 파일을 Resource 객체 형태로 주입 받을 수 있다. 이 Resource 객체를 통해 파일 전체의 내용을 읽어들일 수 있다.
 */
public class BannerResourceLoader {
    @Value("classpath:banner.txt")
    private Resource bannerResource;
    private String bannerText;

    @PostConstruct
    public void loadResource() throws IOException {
        StringBuilder bannerText = new StringBuilder();
        Files.lines(Paths.get(bannerResource.getURI()), Charset.forName("UTF-8"))
                .forEachOrdered(text -> bannerText.append(text + System.getProperty("line.separator")));
        this.bannerText = bannerText.toString();
    }

    public String getBannerText()   {
        return bannerText;
    }
}
