package example.spring.core.profile.profilebean.bean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("fileService")
@Profile("local")
public class FileServiceLocal implements FileService {
    @Override
    public String load() {
        return "loaded from local file";
    }
}
