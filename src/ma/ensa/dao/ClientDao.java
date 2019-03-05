package ma.ensa.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.ensa.entities.Client;


@Repository
@Transactional
public class ClientDao implements IClientDao {
	
	@Autowired
    private SessionFactory sessionFactory;

	public int add(Client client) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean update(Client client) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

    
	

	public int addClient(Client client) {
		Session session = sessionFactory.getCurrentSession();
		session.save(client);
		return client.getId();
	}

	public Set<Client> allClients() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Client");
		Set<Client> clients = new HashSet<Client>(query.getResultList());
		return clients;
	}
	
}
