package Fichas;

public class rey extends casillas {
	public double posicionFilas;
	
	public rey (double posicionFilas, double posicionColumnas) {
		super(posicionFilas);
		this.posicionColumnas = (int)posicionColumnas;
	}
	
	public double calcularPosiblesMovimientosFilas() {
		return (8 - this.posicionFilas); 
	}
	public double calcularPosiblesMovimientosColumnas () {
			return 8 - this.posicionColumnas;
		}
	
}


