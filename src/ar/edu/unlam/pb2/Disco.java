package ar.edu.unlam.pb2;
//Trabajo Practico "Discos" de Programacion Basica 2 — Miércoles, mañana.
//Integrantes: Delgado Rosario, Pacchi David.
public class Disco {
	//Atributos
	private Double radioInterior;
	private Double radioExterior;
	//Metodo Constructor
	public Disco(Double interior, Double exterior){
		this.radioInterior=interior;
		this.radioExterior=exterior;
	}
	//Metodos
	public Double perimetroInterior(){
		return (2*Math.PI*this.radioInterior);
	}
	public Double perimetroExterior(){
		return (2*Math.PI*this.radioExterior);
	}
	public Double superficie(){
		Double radio=this.radioExterior+this.radioInterior;
		return (Math.PI*(Math.pow(radio, 2)));
	}
	//Getters y Setters
	public void setRadioInterior(Double radioInterior){
		this.radioInterior=radioInterior;
	}
	public Double getRadioInterior(){
		return this.radioInterior;
	}
	public void setRadioExterior(Double radioExterior){
		this.radioExterior=radioExterior;
	}
	public Double getRadioExterior(){
		return this.radioExterior;
	}

}
