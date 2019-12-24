package com.kuka.pojotest;

import com.kuka.mapper.IUserMapper;
import com.kuka.pojo.Order;
import com.kuka.pojo.User;
import lombok.extern.slf4j.Slf4j;
import netscape.javascript.JSException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.plugin.javascript.navig.Array;

import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.util.Date;

@Slf4j
public class UserTest {
    private final Logger logger = LoggerFactory.getLogger(UserTest.class);
    @Test
    public void testUser() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        User user= new User();
        user.setId(1000);
        user.setUserName("Yzj1999");
        User userDataTable = session.selectOne("com.kuka.pojo.mapping.user.selectOne",user );
//        UserMapper mapper = session.getMapper(IUserMapper.class);
//        User user = mapper.selectOne(1000);
        logger.info(userDataTable.toString());
    }
    @Test
    public void testUserOrder() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        User user=new User();
        user.setId(1000);
        Order order=new Order();
        order.setOrderName("订单1");
        order.setPrice(1010);
        order.setCreatedon(new Date());
        order.setUser(user);
        session.insert("com.kuka.pojo.mapping.order.insertOrder",order);
        User userDataTable = session.selectOne("com.kuka.pojo.mapping.user.selectOne",1000);
        logger.info(userDataTable.toString());
        session.commit();
        session.close();
    }
    @Test
    public void testOrderUser() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        Order orderDataTable = session.selectOne("com.kuka.pojo.mapping.order.selectOne",4);
        logger.info(orderDataTable.toString());
        session.commit();
        session.close();
    }

}
