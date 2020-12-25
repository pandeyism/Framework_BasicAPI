package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
//create a method here that will load the properties file//
//this method is returning the object of properties class//

public class PropertiesFileLoad {

	public static Properties PropertiesLoad(String Path) throws IOException
	{
		File f=new File(Path);
		
		FileReader fr=new FileReader(f);
		Properties pr=new Properties();
		pr.load(fr);
		return pr;
	}
}
