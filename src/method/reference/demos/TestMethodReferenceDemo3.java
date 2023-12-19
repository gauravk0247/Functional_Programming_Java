package method.reference.demos;

class User{
	private String userName;
	private String userPassword;
	private String userPhone;
	public User(String userName, String userPassword, String userPhone) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public String getUserPhone() {
		return userPhone;
	}
}

interface UserService{
	User signup(String un, String pw, String phone);
}
public class TestMethodReferenceDemo3 {

	public static void main(String[] args) {
		UserService service = User::new;
		User obj = service.signup("Rav", "Ravi@123", "1235");
		System.out.println(obj.getUserName()+" "+obj.getUserPassword()+" "+obj.getUserPhone());
		}
}