package ma.ensa.dao;

import java.util.Set;

import ma.ensa.entities.Client;

public interface IClientDao {
	
	int add(Client client) ; 
	boolean update(Client client) ; 
	boolean delete(int id) ; 
	public int addClient(Client client);
	public Set<Client> allClients();


}
