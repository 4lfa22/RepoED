package practicaunidad3;
/**
 * 
 * @author alfonso
 * @version V1.0.
 * @since 26/11/2021
 */
public class CCuenta {

	
	protected String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;
	
	public CCuenta() {
	}
	/**
	 * 
	 * @param nom hace referencia al nombre
	 * @param cue hace referencia a la cuenta
	 * @param sal hace referencia al saldo
	 * @param tipo hace referencia al ripo de interés 
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInterés = tipo;
	}
	/**
	 * 
	 * @param nom asigna un valor de tipo String al nombre
	 */
	public void asignarNombre(String nom) {
		nombre = nom;
	}
	/**
	 * 
	 * @return devuelve el valor asignado al nombre
	 */
	public String obtenerNombre() {
		return nombre;
	}
	/**
	 * 
	 * @return devuelve el valor del saldo
	 */
	public double estado() {
		return saldo;
	}
	/**
	 * 
	 * @param cantidad que se quiere ingresar y que no puede ser negativa y después la suma al saldo
	 * @throws Exception cuando la cantidad es negativa salta la excepción que impide ingresar la cantidad negativa
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}
	/**
	 * 
	 * @param cantidad que se quiere retirar y que no puede ser negativa y que comprueba que si al restarse al saldo no da un valor inferior a cero para después poder restarlo del saldo
	 * @throws Exception salta la excepción que depende de el error que nos hubiese ocurrido 
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (estado() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}
	/**
	 * 
	 * @return devuelve el valor de la cuenta
	 */
	public String obtenerCuenta() {
		return cuenta;
	}
	/**
	 * 
	 * @param cuenta llama a la función cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * 
	 * @param saldo llama a la función saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * 
	 * @return devuelve el tipo de interés
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}
	/** 
	 * 
	 * @param tipoInterés llama a la función tipoInterés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
