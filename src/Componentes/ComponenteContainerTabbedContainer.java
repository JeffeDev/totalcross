package Componentes;

import java.util.List;

import Service.CarroService;
import totalcross.io.IOException;
import totalcross.sys.Vm;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Label;
import totalcross.ui.MainWindow;
import totalcross.ui.ScrollContainer;
import totalcross.ui.TabbedContainer;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class ComponenteContainerTabbedContainer extends MainWindow {

	private CarroService carroService;	
	private ScrollContainer containerCarros;
	private TabbedContainer tabbedContainer;
	
	public ComponenteContainerTabbedContainer() {
		carroService = new CarroService();
		containerCarros = new ScrollContainer();
		tabbedContainer = new TabbedContainer(new String[] {"Dados", "Horários"});
	}
	
	private void loadContainerLabels() throws ImageException, IOException {
		List<String[]> carrosList = carroService.instantiateCarrosSumary();
		for(String[] dados : carrosList) {
			Container containerLabels = new Container();
			containerLabels.setBorderStyle(BORDER_SIMPLE);
			
			containerCarros.add(containerLabels, LEFT + 10, AFTER + 3, containerCarros.getWidth()-30, 105);
			
			for(int dadosIndex = 0; dadosIndex < dados.length; dadosIndex ++) {
				int horizontalPosition = dadosIndex % 2 == 0 ? LEFT + 10 : RIGHT - 10;
				int verticalPosition = dadosIndex % 2 == 0 ? AFTER : SAME ;
				containerLabels.add(new Label(dados[dadosIndex]), horizontalPosition, verticalPosition);
			}
			Container containerFoto = new Container();
			containerLabels.add(containerFoto, LEFT + 10, AFTER + 5, 50, 50);
			containerFoto.add(new Button (new Image("/resources/camera.png")), LEFT, TOP, FILL, FILL);
		}
	}
	@Override
	public void initUI() {
		//add(scrollContainer, LEFT, TOP, FILL, FILL);
		add(tabbedContainer, LEFT, TOP, FILL, FILL);
		tabbedContainer.setContainer(0, containerCarros);
		try {
		  loadContainerLabels();
		} catch (ImageException e) {
			
		} catch (IOException e) {
		  Vm.debug(e.getMessage());
		}  
	}

}
