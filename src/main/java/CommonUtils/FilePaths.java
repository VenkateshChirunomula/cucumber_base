package CommonUtils;

public class FilePaths {

    private static final String projectPath = System.getProperty("user.dir");
    private static final String LocatorsFolderPath = projectPath+"\\src\\main\\resources\\Locators\\";


    public static String getProjectPath(){
        return projectPath;
    }
    public static String getLocatorsFolderPath(){
        return LocatorsFolderPath;
    }
}
