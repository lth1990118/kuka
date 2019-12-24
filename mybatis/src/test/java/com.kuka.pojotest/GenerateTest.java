package com.kuka.pojotest;


import com.generate.pojo.order;
import com.generate.pojo.user;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;

@Slf4j
public class GenerateTest {
    private final Logger logger = LoggerFactory.getLogger(GenerateTest.class);
    @Test
    public void testUser() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        user userDataTable = session.selectOne("com.generate.dao.userMapper.selectByPrimaryKey",1000 );
        logger.info(userDataTable.toString());
    }
    @Test
    public void testOrder() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        order orderDataTable = session.selectOne("com.generate.dao.orderMapper.selectByPrimaryKey",6 );
        logger.info(orderDataTable.toString());
    }
    @Test
    public void testOrderInsert() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        order order = new order();
        order.setOrdername("订单2");
        order.setCreatedon(new Date());
        BigDecimal price=new BigDecimal(100);
        order.setPrice(price);
        user user=new user();
        user.setId(1000);
        order.setUser(user);
        int i = session.insert("com.generate.dao.orderMapper.insert",order );
        session.commit();;
        session.close();
        logger.info(i+"");
    }
}
