package java11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test03 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		BufferedReader br;
		ArrayList<String> arrlist =new ArrayList<>();
		br = new BufferedReader(new InputStreamReader(System.in));
		 try {
			 System.out.println("회원가입");
			 String My_id =br.readLine();
			if(My_id.equals("lee")) {
				arrlist.add("lee");
				String My_pwd = br.readLine();
				arrlist.add("asd123");
				System.out.println("회원 완료했습니다");
			}
			else {
				throw new Exception();
			}
		 }
		 catch(Exception e) {
			 
		 }
	}

}
