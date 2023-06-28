package java11;

public class User {
 private String name;
 private String age;
 private String tel;
 private String address;
 	public User(String name, String age, String tel, String address) {
 		this.name = name;
 		this.age = age;
 		this.tel = tel;
 		this.address = address;
 	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
