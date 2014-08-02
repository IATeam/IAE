package services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import data.*;

@Transactional
public class Services {
	
	SessionFactory sessionFactory;
	Session sess;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session sess() {
		//sess = sessionFactory.getCurrentSession();
		//sess.beginTransaction();
		return sessionFactory.getCurrentSession();
		//sess=null;
		//sess = sessionFactory.openSession();
		//return sess;
	}
	
	public Event getEventById(long id) {
		Event tmp = (Event)sess().get(Event.class, id);
		return tmp;
	}
	
	public Person getPersonById(long id) {
		return (Person)sess().load(Person.class, id);
	}
	
	public void deleteEventById(long id) {
		sess().delete(getEventById(id));
	}
	
	public void deletePersonById(long id) {
		sess().delete(getPersonById(id));
	}
	
	public void createEvent(String name) {
		Event theEvent = new Event();
		theEvent.setName(name);
		sess().save(theEvent);
	}
	
	public void createPerson(String name) {
		Person p = new Person();
		p.setName(name);
		sess().save(p);
	}
	
	@SuppressWarnings("unchecked")
	public List<Event> getEvents() {
		return sess().createQuery("from Event").list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Person> getPeople() {
		return sess().createQuery("from Person").list();
	}
	
	public void removePersonFromEvent(int personId, int eventId) {
		getEventById(eventId).getPeople().remove(getPersonById(personId));
	}
	
	public void addPersonFromEvent(int personId, int eventId) {
		getEventById(eventId).getPeople().add(getPersonById(personId));
	}
	
	public GenderTypes getGenderTypeById(long id) {
		GenderTypes tmp = (GenderTypes)sess().get(GenderTypes.class, id);
		return tmp;
	}
	
}
