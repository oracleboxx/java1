package java11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UserManager {
	private boolean isStop;
	private BufferedReader br;
	private ArrayList<User> UserLog;
	int index;

	public UserManager() {
		isStop = false;
		br = new BufferedReader(new InputStreamReader(System.in));
		UserLog = new ArrayList<User>();
		index = -1;
	}

	public void start() throws IOException {
		while (!isStop) {
			int menu = -1;
			System.out.println("메뉴 선택");
			System.out.println("1.회원 가입");
			System.out.println("2.회원 검색");
			System.out.println("3.정보 수정");
			System.out.println("4.회원 탈퇴");
			System.out.println("5.전체 보기");
			System.out.println("6.종료하기");
			try {
				menu = Integer.parseInt(br.readLine());

			} catch (NumberFormatException nf) {
				menu = -1;
			}
			switch (menu) {
			case 0:
				stop();
				break;

			case 1:
				addUser();
				break;

			case 2:
				serchUser();
				break;

			case 3:
				updateUser();
				break;

			case 4:
				deleteUser();
				break;

			case 5:
				showAllUser();
				break;
			}
		}
	}

	public void addUser() throws IOException {
		System.out.println("이름 입력:");
		String name = br.readLine();
		System.out.println("나이 입력:");
		String age = br.readLine();
		System.out.println("전화번호 입력:");
		String tel = br.readLine();
		System.out.println("주소 입력:");
		String address = br.readLine();
		User user = new User(name, age, tel, address);
		UserLog.add(user);
		System.out.println("회원 등록했습니다");
	}

	public void serchUser() throws IOException {
		System.out.println("검색할 이름을 입력해주세요:");
		String findName = br.readLine();
		index = -1;
		for (int i = 0; i < UserLog.size(); i++) {
			User user = (User) UserLog.get(i);
			if (user.getName().equals(findName)) {
				index = i;
				break;
			}
		}
		if (index < 0) {
			System.out.println("회원 가입을 안했습니다");

		} else {
			System.out.println("회원등록이 되어있습니다");

		}
	}

	public void updateUser() throws IOException {
		boolean isLoop = false;
		int menu = -1;
		if (index < 0) {
			System.out.println("회원 검색을 먼저 해주세요");
		}
		User user = UserLog.get(index);
		while (!isLoop) {
			System.out.println("1.전화번호");
			System.out.println("2.주소");
			System.out.println("0.수정취소");

			try {
				menu = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				menu = -1;

			}
			switch (menu) {
			case 0:
				System.out.println("수정 취소합니다");
				isLoop = true;
				break;
			case 1:
				System.out.println("수정할 전화번호 입력");
				String ReplaceTel = br.readLine();
				user.setTel(ReplaceTel);
				isLoop = false;
				System.out.println("전화번호 수정완료");
				break;
			case 2:
				System.out.println("수정할 주소 입력");
				String ReplaceAdress = br.readLine();
				user.setTel(ReplaceAdress);
				isLoop = false;
				System.out.println("주소 수정완료");
				break;
			default:
				System.out.println("메뉴선택 실패");
				isLoop = false;
			}

		}
	}

	public void deleteUser() throws IOException {
		if (index < 0) {
			System.out.println("회원 검색을 먼저 실행해주세요");
		}
		User user = UserLog.get(index);
		System.out.println(user.getName() + "아이디 삭제하시겠습니까 Y/N?");
		String number = br.readLine();
		if (number.equals("Y")) {
			UserLog.remove(index);
			System.out.println("삭제 완료했습니다");
			index = -1;
		} else {
			System.out.println(user.getName() + "삭제가 안되었습다");
		}
	}

	public void showAllUser() throws IOException {
		for (int i = 0; i < UserLog.size(); i++) {
			User user = (User) UserLog.get(i);
			System.out.println("이름" + user.getName() + "");
			System.out.println("나이" + user.getAge() + "");
			System.out.println("전화번호" + user.getTel() + "");
			System.out.println("주소" + user.getAddress() + "");

		}
	}

	public void stop() throws IOException {
		System.out.println("종료하시겠습니까 ? Y/N");
		String menu = br.readLine();
		if (menu.equals("Y") || menu.equals("y")) {
			isStop = true;
		} else {
			isStop = false;
		}

	}

}
