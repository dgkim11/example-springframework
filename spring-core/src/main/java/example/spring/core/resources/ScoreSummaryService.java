package example.spring.core.resources;

import org.springframework.beans.factory.annotation.Value;

public class ScoreSummaryService {
    private String readFileName;
    private String writeFileName;
    @Value("${processing-message}")
    private String processingMessage;

    public ScoreSummaryService(String readFileName, String writeFileName)   {
        this.readFileName = readFileName;
        this.writeFileName = writeFileName;
    }

    public void createSummaryFile() {
        System.out.println("Reading " + readFileName);
        System.out.println(processingMessage);
        System.out.println("Created " + writeFileName);
        System.out.println("finished");
    }
}
