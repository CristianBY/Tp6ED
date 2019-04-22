import javax.swing.*;

public class ProbandoIMC {
	public static void main (String[] args){
		String peso, estatura, estado;
		double kilos, metros, imc;
		
		peso = JOptionPane.showInputDialog (" Introduzca el peso(kg) ");
		kilos = new Double(peso);
		estatura = JOptionPane.showInputDialog (" Introduzca su altura en metros ");
		metros = new Double(estatura);
		CalculadoraIMC cal = new CalculadoraIMC(kilos, metros);
		imc = cal.calculoIMC();
		estado= cal.gradoIMC();		
		JOptionPane.showMessageDialog (null , " El IMC es de : " + imc+" - "+ estado);
	}
}