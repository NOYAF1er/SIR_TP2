package jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domain.Person;


public class JpaTest {

	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("example");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
//			Person personne = new Person("nom", "prenom", "em@ail.com");
//			manager.persist(personne);
			
			List<Person> personnes = new ArrayList<Person>();
			for(int i = 0; i < 5; i++)
			{
				personnes.add(new Person("nom"+i, "prenom"+i, "em"+i+"@ail.com"));
				manager.persist(personnes.get(i));
			}
				
		tx.commit();
		
		
		// TODOs
		
		
		
		
		manager.close();
		System.out.println("done");
	}

	


}
