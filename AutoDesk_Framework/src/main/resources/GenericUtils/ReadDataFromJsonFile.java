package GenericUtils;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;


public class ReadDataFromJsonFile {
	

//	public void getDataFromJson() throws IOException, ParseException {
//FileReader reader=new FileReader("./Data/CommonData.json");//to read a json file we need a class call filereader class
//JSONParser parser=new JSONParser();//to convert json file to java file
//Object object=parser.parse(reader);//which return type it will return we dont no so we create an object and push it to main file[reader]
//JSONObject jsonObject=(JSONObject)object;//to load and get the values from json[typecast]
//String URL = jsonObject.get("url").toString();//jsonobject is like getproperty
//String BROWSER = jsonObject.get("browser").toString();
//String US = jsonObject.get("username").toString();
//String PASSWORD = jsonObject.get("password").toString();
//System.out.println(URL);
//System.out.println(BROWSER);
//System.out.println(US);
//System.out.println(PASSWORD);
//}
	@Test
	public void readDataFromJSON() throws Throwable {
	//read the data from json file
	FileReader file = new FileReader("./Data/commondata.json");
	//convert the json file into java object
	JSONParser jsonobj=new JSONParser();
	Object jobj=jsonobj.parse(file);
	//type cast java ob to hashmap
	HashMap map=(HashMap)jobj;
	String USERNAME = map.get("username").toString();
	System.out.println(USERNAME);
	String PASSWORD = map.get("password").toString();
	System.out.println(PASSWORD);
	String URL= map.get("url").toString();
	System.out.println(URL);

	
}


}
