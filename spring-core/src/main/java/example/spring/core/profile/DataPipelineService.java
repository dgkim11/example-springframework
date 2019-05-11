package example.spring.core.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataPipelineService {
    @Value("${file.read.path}")
    private String readPath;
    @Value("${file.write.path}")
    private String writePath;

    public String getReadPath() {
        return readPath;
    }

    public String getWritePath() {
        return writePath;
    }

    public void startProcess()  {
        System.out.println("Reading file from " + readPath);
        System.out.println("Writing data to " + writePath);
    }
}
