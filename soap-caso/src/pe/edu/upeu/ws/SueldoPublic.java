package pe.edu.upeu.ws;

import javax.xml.ws.Endpoint;

public class SueldoPublic {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9092/soap/sueldo", new SueldoImpl());
	}
}
