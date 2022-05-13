package qsp;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoDataDriven {
	
	public static void main(String[] args) {
     ArrayList<String> al=new ArrayList<>();
     al.add("https://demo.actitime.com/");
     al.add("admin");
     //If we try to add email in between un & pw tomorrow
     al.add("admin@actitime.com");
     al.add("manager");
     //we get emailid instead of password
     System.out.println(al.get(2));
     
     HashMap<String , String> map=new HashMap<>();
     map.put("url", "https://demo.actitime.com/");
     //If we try to add email in between un & pw tomorrow
     map.put("email", "admin@actitime.com");
     map.put("username", "admin");
     map.put("password", "manager");
     //we still get same output i.e password
     System.out.println(map.get("password"));
	}

}
