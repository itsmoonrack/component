package hadl.configuration;

import hadl.component.Component;
import hadl.connector.Connector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Configuration  {
	// attributs de la classe
	private int nbre_composant=0;
	private int nbre_connecteur=0;
	private Map liste_composant;
	private  Map liste_connecteur;
	private Map ports;
	private String name_conf;
	public Configuration(String string) {
		// TODO Auto-generated constructor stub
		name_conf=string;
		liste_composant= new Hashtable();
		liste_connecteur=new Hashtable();
		ports=new Hashtable();
		
	}
	
	public void addComposant(Component client) {
		// TODO Auto-generated method stub
		liste_composant.put(client.getname(),client);
		
		
	}
	public void addConnecteur(Connector rpc) {
		// TODO Auto-generated method stub
		liste_connecteur.put(rpc.getname(),rpc);
	}

	public Component getComposant(String string) {
		// TODO Auto-generated method stub
		return (Component) liste_composant.get(string);
	}

	public void addPort(Integer integer, PortConfiguration portConfServ) {
		ports.put(integer, portConfServ);
		// TODO Auto-generated method stub
		
	}

}
