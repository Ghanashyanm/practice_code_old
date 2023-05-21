package dao;
import java.util.ArrayList;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import vo.regvo;

public class regdao<E> 
{
    public void insert(regvo vo)
    {
    	try
    	{
    		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    		Session session = sessionFactory.openSession();
    		Transaction transaction = session.beginTransaction();
    		session.save(vo);
    		transaction.commit();
    		session.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
//    String s2 = new abc().s().conacat("x");
    public List<?> search(regvo vo)
    {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
           
            Session session = sessionFactory.openSession();
           
            Query q=session.createQuery("from regvo");
           
            List<?> ls=q.list();
   
        return ls;
    }
    public void delete(regvo v)
    {
    	try
    	{
	    	SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();
	    	Session session = sessionFactory.openSession();
	    	Transaction transaction = session.beginTransaction();
	    	session.delete(v);
	    	transaction.commit();
	    	session.close();
    	}
    	catch (Exception e) 
    	{
    		e.printStackTrace();
		}
    }
    public List<?> ShowData()
    {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            Query q=session.createQuery("from regvo");
            List<?> ls=q.list();
            return ls;
    }
    public List<?> edit(regvo v)
    {
    	List<?> ls = new ArrayList();
    	try
    	{
	    	SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();
	    	Session session = sessionFactory.openSession();
	    	Query q = session.createQuery("from regvo where id="+v.getId()+" ");
	    	ls =  q.list();
	    	session.close();
    	}
    	catch (Exception e) 
    	{
    		e.printStackTrace();
		}
    	return ls;
    }
    public void update(regvo v)
    {
    	try
    	{
	    	SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();
	    	Session session = sessionFactory.openSession();
	    	Transaction transaction = session.beginTransaction();
	    	session.update(v);
	    	transaction.commit();
	    	session.close();
    	}
    	catch (Exception e) 
    	{
    		e.printStackTrace();
		}
    }
}
 