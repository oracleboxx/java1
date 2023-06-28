package java11;

class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
}

public class Test02 {

	public static void main(String[] args) {
		try {
			int i = -2;
			if(i<0) {
				throw new  MyException("error");
			}
			else {
				throw new RuntimeException();
			}
		}
		catch(MyException e) {
			if(e instanceof Exception) {
				Exception ec = (Exception)e;
				ec.getMessage();
				System.out.println(ec.getMessage());
			}
		}
		
	}
	}