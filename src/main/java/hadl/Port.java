package hadl;

import java.util.Observable;


public abstract class Port extends Observable {
	private int numPort;
	

	public Port(int number, String data2) {
		// TODO Auto-generated constructor stub
	}
	public Port(int num) {
		numPort = num;
		// TODO Auto-generated constructor stub
	}

	public Port() {
		// TODO Auto-generated constructor stub
	}

	public abstract void writeBytes(String data);
	public abstract void readBytes(String data);

}
