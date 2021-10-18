package domains;

public class Carros {
	
	private String marca;
	private String modelo;
	private String cor;
	
	public Carros() {}
	
	public Carros(String marca, String modelo, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public String getMarca() {return marca;}
	public void setMarca(String marca) {this.marca = marca;}
	
	public String getModelo() {return modelo;}
	public void setModelo(String modelo) {this.modelo = modelo;}

	public String getCor() {return cor;}
	public void setCor(String cor) {this.cor = cor;}
	
	@Override
	public String toString() {
		return String.format("[%s] - %s, %s", this.marca, this.modelo, this.cor);
	}
	
	@Override
	public boolean equals(Object obj) {
		Carros carroFilter = (Carros) obj;
		if  (this.marca != null        && this.marca.equals(carroFilter.marca) 
				&& this.modelo != null && this.modelo.equals(carroFilter.modelo) 
				&& this.cor != null    && this.cor.equals(carroFilter.cor)
			){
			return true;
		}
		return false;
	}
}
