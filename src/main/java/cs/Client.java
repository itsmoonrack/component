package cs;

import hadl.component.Component;
import hadl.component.PortComponent;
import hadl.component.Service;

public class Client extends Component {
	private Service clientService;
	private PortComponent clientPort;

	public Client(int numPort) throws SecurityException, NoSuchMethodException {
		super("client");
		clientService = new Service(this, Client.class.getMethod("recieve", String.class));
	}
	
	public void send(String message) {
		clientService.call(clientPort, message);
	}
	
	public void recieve(String result) {
		System.out.println("Recieve " + result);
	}

}