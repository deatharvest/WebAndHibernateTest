package test;

import entity.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.Date;

/**
 * Created by JN on 2016/4/21.
 */
public class HibernateTest {



    public static void main(String[] args){

        Users users = new Users(1,"jn","password","595509710@qq.com","男","hi",new Date());

        System.out.println(users+"");


        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        session.save(users);
        tx.commit();
        HibernateUtil.closeSession(session);



    }
}
