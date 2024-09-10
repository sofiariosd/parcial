package Fichas;

public class Torre extends casillas{
public double posicionFilas;
private int posicionColumnas;
	
	public Torre(double posicionFilas, double posicionColumnas) {
		super(posicionFilas);
		this.posicionColumnas = (int) posicionColumnas;
	}
	
	public double calcularPosiblesMovimientosFilas() {
		return (8 - this.posicionFilas); 
	}
	public double calcularPosiblesMovimientosColumnas () {
			return 8 - this.posicionColumnas;
		}

}
