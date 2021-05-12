package pe.edu.upeu.ws;

public class ClienteService {
	public static void main(String[] args) {
		SueldoImplService s = new SueldoImplService();
		SueldoDao sueldo = s.getSueldoImplPort();
		System.out.println("Sueldo Bruto");
		System.out.println(sueldo.calcularSueldo(41, 1));
	}
	

}
