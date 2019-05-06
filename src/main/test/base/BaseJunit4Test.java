package base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import xy.basic.util.RedisUtil;

import javax.annotation.Resource;

/**
 * @Description: spring整合Junit4单元测试基类，
 * * 			其他类实现该类可以省略一些注解配置。
 * @author: xiayun
 * @date: 2019年4月2日
 */
@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)//使用junit4进行测试
//加载配置文件，可以指定多个配置文件，locations指定的是一个数组
@ContextConfiguration(locations = {"classpath:applicationContext-redis.xml","classpath:applicationContext-dao.xml",
        "classpath:spring-mvc.xml"})
@Transactional
//配置事务管理器，同时指定自动回滚
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
//加载配置文件,这里写你自己的spring配置文件的存放目录
public class BaseJunit4Test {


    @Resource
    private RedisUtil redisUtil;

    @Test
    public void test() {

        System.out.println(123);
        redisUtil.set("xiayun", "123");
        redisUtil.set("zs", "zhangsan");
        Object value = redisUtil.get("xia");
        System.out.println(value);
    }

}
