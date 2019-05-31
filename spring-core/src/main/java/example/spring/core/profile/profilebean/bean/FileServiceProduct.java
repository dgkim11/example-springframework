package example.spring.core.profile.profilebean.bean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("fileService")
@Profile("production")
public class FileServiceProduct implements FileService {
    @Override
    public String load() {
        return "loaded from s3 file in product";
    }
}
