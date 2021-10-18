package Componentes;

import totalcross.io.IOException;
import totalcross.ui.Button;
import totalcross.ui.MainWindow;
import totalcross.ui.event.ControlEvent;
import totalcross.ui.event.Event;
import totalcross.ui.event.KeyEvent;
import totalcross.ui.event.PenEvent;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class ComponenteButtonCapturaFoto extends MainWindow {

	private Button btTexto;
	private Button btImagem;
	private Button btTextoBorda;
	private Button btImagemBorda;
	private Button btCompleto;
	
	public ComponenteButtonCapturaFoto() throws ImageException, IOException {
		btTexto = new Button("Enviar");
		btImagem = new Button(new Image("/resources/camera.png"));
		btTextoBorda = new Button("Enviar", Button.BORDER_3D_VERTICAL_GRADIENT);
		
		//btImagemBorda = new Button(new Image("/resources/camera.png"), Button.BORDER_ROUND);
		
		btImagemBorda = new Button(new Image("/resources/camera.png"));
		btImagemBorda.setBackColor(Color.GREEN);
		btImagemBorda.borderColor3DG = Color.RED;
		btImagemBorda.setBorder(Button.BORDER_GRAY_IMAGE);
		
		btCompleto = new Button("Enviar", new Image("/resources/camera.png"), BOTTOM, 0);
	}
	@Override
	public void initUI() {
		add(btTexto, LEFT, TOP);
		add(btImagem, RIGHT, BOTTOM);
		add(btTextoBorda, RIGHT, TOP);
		add(btCompleto, CENTER, CENTER);
		add(btImagemBorda, LEFT, BOTTOM, 100, 100);
	}
	
	@Override
	public void onEvent(Event event) {
		//super.onEvent(event);
		switch(event.type) {
		case ControlEvent.PRESSED : 
			if (event.target == btTexto) {
				System.out.println("Mensagem : Botão btTexto Clicado");
				break;
			}
		case KeyEvent.SPECIAL_KEY_PRESS : 
			btCompleto.simulatePress();
			System.out.println("Foto capturada");
			break;		 
		case PenEvent.PEN_DOWN : 
			System.out.println("Inicio do Clique");
			break;
		case PenEvent.PEN_UP:
			System.out.println("Fim clique");
			break;
		}
			
	}
}
