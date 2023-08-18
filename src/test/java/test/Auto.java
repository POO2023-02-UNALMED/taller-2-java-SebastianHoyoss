package test;

public class Auto {
	String modelo;
	int precio;
	Asiento [] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int contador=0;
		
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] !=null) {
				contador++;
			}
		}
		return contador;
	}
	String verificarIntegridad() 
	{
		boolean verificar = true;
		if (motor.registro!=registro) {
			verificar = false;
		}
		for(int i =0;i<asientos.length;i++) {
			if (asientos[i]!=null && asientos[i].registro != registro) {
				verificar = false;
				break;
			}
		}
		if (verificar== true) {
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}
}
