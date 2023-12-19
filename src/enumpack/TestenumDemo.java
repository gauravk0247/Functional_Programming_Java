package enumpack;

import java.util.Scanner;

enum UserStatus{
	ACTIVATED, DEACTIVATED;
}
class User{
	private String userName;
	private String UserPassword;
	private UserStatus status;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public UserStatus getStatus() {
		return status;
	}
	public void setStatus(UserStatus status) {
		this.status = status;
	}
}
public class TestenumDemo {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your LogIn Data");
		System.out.println("Enter UserName");
		String un = sc.next();
		System.out.println("Enter PassWord");
		String pw = sc.next();
		System.out.println("Enter User Status");
		String us = sc.next();
		UserStatus s1 = UserStatus.valueOf(us);
		User u = new User();
		u.setUserName(un);
		u.setUserPassword(pw);
		u.setStatus(s1);
		System.out.println(u.getUserName()+" "+u.getUserPassword()+" "+u.getStatus());
		}catch(IllegalArgumentException e){
			System.out.println("no valid constants");
		}
	}
}