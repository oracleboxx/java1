package java11;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		
	   List ListName = new ArrayList();
	   ListName.add("seoul");
	   ListName.add("busan");
	for(int i =0 ; i<ListName.size(); i++) {
		String result=(String) ListName.get(i);
	 System.out.println(result.toUpperCase());
	   
	   
	   
	 
	         
	   }
	}

}
