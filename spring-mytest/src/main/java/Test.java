/**
 * @author wangq
 * @since 2021/11/2 15:22
 */
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("hah");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User)context.getBean("user");
		System.out.println(user.toString());

	}
}
