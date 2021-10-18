package Componentes;

import totalcross.ui.Label;
import totalcross.ui.MainWindow;
import totalcross.ui.gfx.Color;

public class ComponenteLabel extends MainWindow {
	private Label lbTitulo;
	private Label lbTitulo1;
	private Label lbLetreiro;
	
	public ComponenteLabel() {
		lbTitulo = new Label("Lista");
		lbTitulo1 = new Label("Lista1");
		lbTitulo1.backgroundType = Label.SOLID_BACKGROUND;
		lbTitulo1.setBackColor(Color.BLUE);
		lbTitulo1.setForeColor(Color.WHITE);
		lbLetreiro = new Label("Nesta tela você encontrará informações sobre algumas propriedades das labels");
		lbLetreiro.setMarqueeText(lbLetreiro.getText(), 200, -1, -10);
		
	}
	
	@Override
	public void initUI() {
		add(lbTitulo, CENTER, TOP + 10);
		add(lbTitulo1, SAME, AFTER + 10);
		add(lbLetreiro, CENTER, AFTER + 10, 200, PREFERRED);
		
	}

}
