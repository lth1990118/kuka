package com;

import com.kuka.pojo.Order;
import com.kuka.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class BatisMain {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        User user = session.selectOne("com.kuka.pojo.mapping.user.selectLazayLoad", 1000);
        System.out.println("user:"+user.getName());
        System.out.println("order:"+user.getOrders().size());
        //System.out.println(user.toString());
//        for (Order order : user.getOrders()) {
//            System.out.println(order.toString());
//        }
//        System.out.println(user.toString());
    }
}
