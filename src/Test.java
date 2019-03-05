import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.AppConfig;
import ma.ensa.dao.IClientDao;

import ma.ensa.entities.Client;
import ma.ensa.entities.Produit;
import ma.ensa.service.IPannier;
import ma.ensa.service.Pannier;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/configContext.xml");
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class); 
		IClientDao clientDao = (IClientDao) ctx.getBean("clientDao");
		Client client1 = new Client("nomclient1","0001000000","m1@gmail.com");
		Client client2 = new Client("nomclient2","0002000000","m2@gmail.com");
		clientDao.addClient(client1);
		clientDao.addClient(client2);
		System.out.println(clientDao.allClients().size());
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		

	}

}
