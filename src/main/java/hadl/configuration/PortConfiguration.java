package hadl.configuration;

import com.google.inject.Inject;

import hadl.Port;
import hadl.component.PortComponent;

public class PortConfiguration extends Port {
	
	@Inject
	private PortComponent port;

	public PortConfiguration() {
		// TODO Auto-generated constructor stub
		super();
	}
	public PortConfiguration(int number, String data) {
		super(number, data);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void writeBytes(String data) {
		
		
	}
	@Override
	public void readBytes(String data) {
		
		
	}
	
	

}
