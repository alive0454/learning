import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alive.ssmtest.pojo.*;
import com.alive.ssmtest.service.*;

@RunWith(SpringJUnit4ClassRunner.class)     //��ʾ�̳���SpringJUnit4ClassRunner��  
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	 private ApplicationContext ac = null;
	@Resource
	private IUserService userService;

//	@Before
//	public void before() throws Exception {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		System.out.println("before");
//		userService = (IUserService) ac.getBean("userService");
//		System.out.println("123123213");
//		System.out.println(userService);
//	}

	@Test
	public void test1() {
		System.out.println(userService);
		User user = userService.getUserById(1);
		System.out.println(user.getUsername());
		logger.info("ֵ��" + user.getUsername());
		logger.info(JSON.toJSONString(user));
	}
}
