/**
 * @author wangq
 * @since 2021/11/2 15:22
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		BeanDefinitionParser;
//		DefaultListableBeanFactory;
//		AbstractAutowireCapableBeanFactory;
		System.out.println("hah");
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("beanconfig.xml");
		User user = (User)context.getBean("user");
		System.out.println(user.toString());

	}
}
