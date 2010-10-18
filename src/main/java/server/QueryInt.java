package server;

import hadl.component.Component;
import hadl.component.PortComponent;

public class QueryInt extends PortComponent {

	public QueryInt(int numPort) {
		super(numPort);
		// TODO Auto-generated constructor stub
	}
	
	public void writeBytes(String message) {
		Component db = new Component("db");
		db.recieve(message);
	}

}
