package com.hacktoberfest;
/*Peque�a clase Rectangulo que nos sirve como ejemplo de
 *creaci�n de objetos*/

public class Rectangulo{
	private double base;
	private double altura;
	
	public Rectangulo(){}//Constructor vac�o
	
	public Rectangulo(double base, double altura){//Constructor con los atributos del objeto
		super();
		this.base = base;
		this.altura = altura;
	}

	//Getters y setters que nos permiten darle valores a los par�metros, as� como recogerlos
	public double getBase(){return base;}
	public void setBase(final double base) {this.base = base;}
	
	public double getAltura(){return altura;}
	public void setAltura(final double altura){this.altura = altura;}
	
	//Un peque�o m�todo que nos comprueba que un lado es "posible"
	public boolean comprobarLado(final int lado){
		if(lado < 0){return true;}
		else{return false;}
	}
	
	//Getters del �rea y per�metro del rect�ngulo
	public double getAreaRectangulo(){return base*altura;}
	public double getPerimetroRectangulo(){return 2*base+2*altura;}
}

