package pe.edu.upeu.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "pe.edu.upeu.ws.SueldoDao")
public class SueldoImpl implements SueldoDao{
	@Override
	public double calcularSueldo(double horas, double pagoHora) {
		double sueldototal;
		if(horas<=40) {
			sueldototal = horas * pagoHora;
		}else {
			sueldototal = 40 * pagoHora + (horas-40)*(pagoHora+(pagoHora/2));
		}
		return sueldototal;
	}
}
