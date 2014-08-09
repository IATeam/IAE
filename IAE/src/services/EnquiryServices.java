package services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import data.*;

/**
 * @author Quang
 * Created for testing
 */
@Transactional
public class EnquiryServices {
	SessionFactory sessionFactory;
	//Session sess;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session esess() {
		//sess = sessionFactory.getCurrentSession();
		//sess.beginTransaction();
		return sessionFactory.getCurrentSession();
		//sess=null;
		//sess = sessionFactory.openSession();
		//return sess;
	}
	

	@SuppressWarnings("unchecked")
	public List<Enquiries> getEnquiriesList(){
		return esess().createQuery("from Enquiries").list();
	}
}
