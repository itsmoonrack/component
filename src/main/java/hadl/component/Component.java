package hadl.component;

import java.util.Hashtable;
import java.util.Map;

import com.google.inject.Binding;

import hadl.Port;
import hadl.configuration.Configuration;
import hadl.connector.Connector;
import hadl.connector.Role;

public class Component {
	private String nameComp;
	Configuration config = null;
	protected Map<Integer, Port> port;

	public Component(String string) {
		// TODO Auto-generated constructor stub
		nameComp = string;
		port = new Hashtable<Integer, Port>();
	}
	public String getname() {
		// TODO Auto-generated method stub
		return nameComp;
	}
	public void addConfiguration(String string) {
		// TODO
		config = new Configuration(string);

	}
	public void addConfiguration(Configuration conf) {
		// TODO
		config = conf;

	}
	public void  Binding(int numport,String composant){
		Component c = config.getComposant(composant);

	}

	public void attachement(Component client, Port port_client, Role role_entree,Connector rpc, Role role_sortie, Port port_serveur, Port port_client, Component serveur);

	public Configuration getConfiguration() {
		// TODO Auto-generated method stub
		return config;
	}
	public void addPort(Integer num, Port p){
		port.put(num, p);

	}
	public void send(String message, Component serveur) {
		// TODO Auto-generated method stub

	}

}
