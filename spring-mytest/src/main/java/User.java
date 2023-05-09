/**
 * @author wangq
 * @since 2021/11/2 15:23
 */
public class User {

	private String id;
	private String userName;

	public void init(){
		id = "1";
		userName = "张三";
	}

	public User() {
	}

	public User(String id, String userName) {
		this.id = id;
		this.userName = userName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", userName='" + userName + '\'' +
				'}';
	}
}
