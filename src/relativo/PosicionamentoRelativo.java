package relativo;

import totalcross.ui.Button;
import totalcross.ui.MainWindow;

public class PosicionamentoRelativo extends MainWindow {
	private Button btLeftTop;
	private Button btCenterCenter;
	private Button btRightBottom;
	
	public PosicionamentoRelativo() {
		btLeftTop      = new Button("Aqui temos o primeiro Botão");
		btCenterCenter = new Button("O segundo botão deveria ser posicionado aqui");
		btRightBottom  = new Button("O último botão esta em sua posição");
	}
	
	@Override
	public void initUI() {
		add(btLeftTop, LEFT, TOP);
		add(btCenterCenter, SAME, AFTER);
		add(btRightBottom, RIGHT, BEFORE);
		//add(btCenterCenter,CENTER,CENTER);
		//add(btRightBottom,RIGHT,BOTTOM);
		
	}
}
