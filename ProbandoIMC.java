import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class ProbandoJFX extends Application{
	@Override
	public void start(Stage primaryStage) {

		Scene sceneInicial;
		Label peso = new Label("Peso");
		TextField kilos = new TextField();
		Label estatura = new Label("Estatura");
		TextField metros = new TextField();
		Button calcular = new Button("_Calcular");
		VBox rootInicial = new VBox(peso,kilos,estatura,metros,calcular);
		kilos.setMaxWidth(150);
		metros.setMaxWidth(150);
		rootInicial.setTranslateY(30);
		rootInicial.setTranslateX(60);
		

		sceneInicial = new Scene (rootInicial,300,200);
		
		calcular.setOnAction(e -> {
					
			rootInicial.getChildren().clear();
			CalculadoraIMC cal = new CalculadoraIMC(Double.parseDouble(kilos.getText()), Double.parseDouble(metros.getText()));
			Label imc = new Label("IMC");
			TextField resultado = new TextField(String.valueOf(cal.calculoIMC()));
			resultado.setMaxWidth(150);
			Label estado = new Label(String.valueOf(cal.gradoIMC()));
			rootInicial.getChildren().add(imc);
			rootInicial.getChildren().add(resultado);
			rootInicial.getChildren().add(estado);
		});
		primaryStage.setScene(sceneInicial);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}