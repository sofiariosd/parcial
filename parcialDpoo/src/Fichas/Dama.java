package Fichas;

public class Dama extends casillas{
	public double posicionFilas;
		
		public Dama (double posicionFilas, double posicionColumnas) {
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
