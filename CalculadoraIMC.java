public class CalculadoraIMC{
	double peso, estatura;
	public CalculadoraIMC(){
		peso = 73;
		estatura = 1.8;
	}
	public CalculadoraIMC(double peso, double estatura){
		this.peso = peso;
		this.estatura = estatura;
	}
	public double getPeso(){
		return peso;
	}
	public double getEstatura(){
		return estatura;
	}
	public void setPeso(double peso){
		this.peso = peso;
	}
	public void setEstatura(double estatura){
		this.estatura = estatura;
	}
	public double calculoIMC(){
		double imc;
		if (estatura<= 0 || peso<0){
			imc= -1;
		}else{
			imc = peso/(Math.pow(estatura,2));
		}
		return imc;
	}
	public String gradoIMC(){
		String estado;
		double imc;
		imc = this.calculoIMC();
		if (imc>=0 && imc<16.00){
			estado = "Delgadez severa";
		}else if(imc>=16 && imc<17){
			estado = "Delgadez moderada";
		}else if(imc>=17 && imc<18.5){
			estado = "Delgadez aceptable";
		}else if(imc>=18.5 && imc<25){
			estado = "Peso normal";
		}else if(imc>=25 && imc<30){
			estado = "Sobrepeso";
		}else if(imc>=30 && imc<35){
			estado = "Obeso I";
		}else if(imc>=35 && imc<=40){
			estado = "Obeso II";
		}else if(imc>40){
			estado = "Obeso III";
		}else{
			estado = "IMC inválido";
		}
		return estado;
	}
}