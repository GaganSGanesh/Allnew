package Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Fileutility {
	public String getProprtykeyValue(String key) throws Throwable {
		FileInputStream fis=new FileInputStream("./data/demo.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		return value;
		
		
	}

}
