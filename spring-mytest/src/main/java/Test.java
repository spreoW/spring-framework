/**
 * @author wangq
 * @since 2021/11/2 15:22
 */
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		BeanDefinitionParser;
//		DefaultListableBeanFactory;
//		AbstractAutowireCapableBeanFactory;
		System.out.println("hah");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		AnnotationConfigApplicationContext context = new ClassPathXmlApplicationContext("");
		User user = (User)context.getBean("user");
		System.out.println(user.toString());

	}
}
