package absoluto;

import totalcross.ui.Button;
import totalcross.ui.MainWindow;

public class PosicionamentoAbsoluto extends MainWindow {
	private Button btLeftTop;
	private Button btCenterCenter;
	private Button btRightBottom;
	
	public PosicionamentoAbsoluto() {
		btLeftTop      = new Button("LEFT/TOP");
		btCenterCenter = new Button("CENTER/CENTER");
		btRightBottom  = new Button("RIGHT/BOTTOM");
	}
	
	@Override
	public void initUI() {
		add(btLeftTop, 0, 0);
		add(btCenterCenter, 240 -(116/2), 360-(23/2));
		System.out.println("Largura:" + btCenterCenter.getWidth());
		System.out.println("Altura:"+btCenterCenter.getHeight());
		add(btRightBottom, 368, 697);
	
		
	}
}
