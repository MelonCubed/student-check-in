package backend;

import com.fazecast.jSerialComm.*;


public class SerialTest {

	
	
	public static void main(String args[]){
		for (SerialPort key : SerialPort.getCommPorts()){
			System.out.println(key.getSystemPortName());
		}
	}
}


