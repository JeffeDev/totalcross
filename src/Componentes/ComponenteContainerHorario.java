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

public class ComponenteContainerHorario extends MainWindow {

	private CarroService carroService;	
	private TabbedContainer tabbedContainer;
	
	private ScrollContainer containerCarros;
	private ScrollContainer containerHorarios;

	public ComponenteContainerHorario() {
		carroService = new CarroService();
		tabbedContainer = new TabbedContainer(new String[] {"Dados", "Horários"});
		containerCarros = new ScrollContainer();
		containerHorarios = new ScrollContainer();	
	}
	
	private void loadContainerLabels() throws ImageException, IOException {
		List<String[]> carrosList = carroService.instantiateCarrosSumary();
		List<String[]> horariosList = carroService.instantiateHorarios();
		
		for(int index = 0; index < carrosList.size(); index++) {
			
			String[] dadosCarros = carrosList.get(index);
			String[] dadosHorarios = horariosList.size() <= index
					? carroService.getAgendaVazia() : horariosList.get(index);
			
			Container containerLabels = new Container();
			Container containerHorario = new Container();
			
			containerLabels.setBorderStyle(BORDER_SIMPLE);
			containerHorario.setBorderStyle(BORDER_SIMPLE);
			
			containerCarros.add(containerLabels, LEFT + 10, AFTER + 3, containerCarros.getWidth()-30, 105);
			containerHorarios.add(containerHorario, LEFT + 10, AFTER + 3, containerHorarios.getWidth()-30, 105);
			
			for(int dadosIndex = 0; dadosIndex < dadosCarros.length; dadosIndex ++) {
				int horizontalPosition = dadosIndex % 2 == 0 ? LEFT + 10 : RIGHT - 10;
				int verticalPosition = dadosIndex % 2 == 0 ? AFTER : SAME ;
				
				containerLabels.add(new Label(dadosCarros[dadosIndex]), horizontalPosition, verticalPosition);
				containerHorario.add(new Label(dadosHorarios[dadosIndex]), horizontalPosition, verticalPosition);
				
			}
			Container containerFoto = new Container();
			containerLabels.add(containerFoto, LEFT + 10, AFTER + 5, 50, 50);
			containerFoto.add(new Button (new Image("/resources/camera.png")), LEFT, TOP, FILL, FILL);
		}
	}
	@Override
	public void initUI() {
		add(tabbedContainer, LEFT, TOP, FILL, FILL);
		tabbedContainer.setContainer(0, containerCarros);
		tabbedContainer.setContainer(1, containerHorarios);
		try {
		  loadContainerLabels();
		} catch (ImageException e) {
			
		} catch (IOException e) {
		  Vm.debug(e.getMessage());
		}  
	}

}
