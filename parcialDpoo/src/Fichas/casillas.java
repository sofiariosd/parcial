package Fichas;

public abstract class casillas{
	protected double posicionFilas;
	protected double posicionColumnas;
		
		public double getValor1() {
			return posicionFilas;
		}
	
		public void setValor1(double posicionFilas) {
			this.posicionFilas = posicionFilas;
		}
	
		public casillas(double posicionFilas) {
			this.posicionFilas = posicionFilas;
		}
		
		public abstract double calcularPosiblesMovimientosFilas();
		public abstract double calcularPosiblesMovimientosColumnas();
			
}


