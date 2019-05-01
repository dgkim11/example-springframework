package example.spring.core.resources;

public class ScoreSummaryService {
    private String readFileName;
    private String writeFileName;

    public ScoreSummaryService(String readFileName, String writeFileName)   {
        this.readFileName = readFileName;
        this.writeFileName = writeFileName;
    }

    public void createSummaryFile() {
        System.out.println("Reading " + readFileName);
        System.out.println("processing now..");
        System.out.println("Created " + writeFileName);
        System.out.println("finished");
    }
}
