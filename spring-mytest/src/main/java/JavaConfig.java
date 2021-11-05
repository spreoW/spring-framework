/**
 * @author wangq
 * @since 2021/11/2 15:22
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public User user(){
		return new User("001","zhangsna");
	}
}
