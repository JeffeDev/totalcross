package Componentes;

import totalcross.ui.Check;
import totalcross.ui.Label;
import totalcross.ui.MainWindow;

public class ComponenteCheck extends MainWindow {
	private Check checkJava;
	private Check checkPHP;
	private Check checkHTML;
	private Check checkPyton;
	
	public ComponenteCheck() {
		checkJava = new Check("Java");
		checkPHP = new Check("PHP");
		checkHTML = new Check("HTML");
		checkPyton = new Check("Pyton");
	}
	
	@Override
	public void initUI() {
		add(new Label("Escolha as linguagens de Programação"), CENTER, TOP + 10);
		add(checkJava, LEFT + 10, AFTER + 10);
		add(checkPHP, LEFT + 10, AFTER + 10);
		add(checkHTML, LEFT + 10, AFTER + 10);
		add(checkPyton, LEFT + 10, AFTER + 10);
		
	}

}
