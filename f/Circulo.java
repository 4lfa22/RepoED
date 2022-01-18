package utilidades;
/**
 * método principal
 * @author alfonso
 * @version v.1.0
 * @since 23/11/2021
 */

public class Circulo {
	private double rad;
/**
 * 
 * @param selecciona el radio
 */
	public Circulo(double radio) {
		this.rad = radio;
	}
/**
 * 
 * @return devuelve el radio
 */
	public double getRad() {
		return rad;
	}
/**
 * 
 * @param selecciona el radio
 */
	public void setRad(double rad) {
		this.rad = rad;
	}

	public void imprimir() {
		String color = "rojo";
		System.out.println("Diámetro: " + 2 * rad);
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * rad * rad;
		System.out.println(area);
	}
/** 
 * @param compara con decimales dos circulos
 */
	public boolean esIgual(Circulo otro, boolean conDecimales) {
		double radio1 = this.rad;
		double radio2 = otro.getRad();
		if (conDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
