package CommonUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

import org.openqa.selenium.By;

public class Properties {

    public static HashMap<String,String> getLocatorTypeAndValue(String locator, String page){

        java.util.Properties p = new java.util.Properties();
        try {
            p.load(new FileInputStream(new File(FilePaths.getLocatorsFolderPath() + page + ".properties")));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        HashMap<String,String> map = new HashMap<>();
        map.put("type",p.getProperty(locator).split(":")[0]);
        map.put("value",p.getProperty(locator).split(":")[1]);
        return map;

    }


    public static By getLocator(String locator,String page){
        By by ;
        switch (getLocatorTypeAndValue(locator,page).get("type")) {
            case "css":
                by = By.cssSelector(getLocatorTypeAndValue(locator,page).get("value"));
                break;
            case "xpath":
            default:
                by = By.xpath(getLocatorTypeAndValue(locator,page).get("value"));
                break;
        }

        return by;
    }
}
