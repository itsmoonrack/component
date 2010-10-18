package Test;

import config.configuration;
import hadl.Port;
import hadl.component.Component;
import hadl.component.PortComponent;
import hadl.configuration.Configuration;
import hadl.configuration.PortConfiguration;
import hadl.connector.Connector;
import hadl.connector.Role;

public class Main {

	public static void main(String[] args) {

		 // creation de la configuration de base [niveau 0]
		Configuration clientServeur = new Configuration("client/serveur");
        Component client=new Component("client");
        Port port_client= new PortComponent(1);
        client.addPort(new Integer(1), port_client);        
        Component serveur=new Component("serveur");
        Port port_serveur= new PortComponent(1);
        serveur.addPort(new Integer(1), port_serveur);        
       
        Connector rpc= new Connector("rpc");
        Role caller= new Role();
        Role callee= new Role();
        rpc.addRole("caller", caller);
        rpc.addRole("callee", callee);
        
		// creation des composants [1er niveau]
		clientServeur.addComposant(client);
		clientServeur.addComposant(serveur);
		// creation du connecteur [1er niveau]
		clientServeur.addConnecteur(rpc);
	     //port_serveur,port_client;
		clientServeur.attachement(client,port_client,role_entree,rpc,role_sortie,port_serveur,port_client,serveur);
		
  
		// creation de la configuration [2eme niveau]
		Configuration config_serveur=new Configuration("serveur interne");
		PortConfiguration port_conf_serv=new PortConfiguration();
		config_serveur.addPort(new Integer(1),port_conf_serv);
		Component database= new Component("database");
		PortComponent port_base= new PortComponent(1);
		database.addPort(new Integer(1),port_base );
		/*Component security= new Component("security");
		Component manager=new Component("manager");*/
		config_serveur.addComposant(database);
		//config_serveur.addComposant(security);
		//config_serveur.addComposant(manager);
		serveur.addConfiguration(config_serveur);
		serveur.bindind(portconf,"database");
		//ser
		
		// send
		String message;
		Component client=clientServeur.getComposant("client");
		client.send(message,portout,serveur,portin);
		client.receive(serveur);
		
		clientServeur.getComposant("serveur").addConfiguration("serveur interne");
 
		// creation des composants [3eme niveau]
		clientServeur.getComposant("serveur").getConfiguration("serveurinterne").addComposant("bdd");
		clientServeur.getComposant("serveur").getConfiguration("serveurinterne").addComposant("connection");
		clientServeur.getComposant("serveur").getConfiguration("serveurinterne").addComposant("security");
 
		// creation des connecteurs [3eme niveau]
		clientServeur.getComposant("serveur").getConfiguration("serveurinterne").addConnecteur("conn1");
		clientServeur.getComposant("serveur").getConfiguration("serveurinterne").addConnecteur("conn2");
		clientServeur.getComposant("serveur").getConfiguration("serveurinterne").addConnecteur("conn3");
 
		//affichages
		clientServeur.getComposant("serveur").getConfiguration("serveurinterne").afficheListeConnecteurs();

		 */
		
		Configuration serv_config=new Configuration();
		serv_config.addport(p1);
		
		Component database=new Component();
		serv_config.add(database);
		serv_config.binding(p1,database,numport);
		Component serveur=new Component();
	}
}
