package Componentes;

import java.util.List;

import Service.CarroService;
import totalcross.io.IOException;
import totalcross.ui.Grid;
import totalcross.ui.MainWindow;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class ComponenteGridOrganizado extends MainWindow {
	private Grid gridCarros;
	private CarroService carroSerivice = new CarroService();
	
	
	public ComponenteGridOrganizado() throws ImageException, IOException {

		loadGridData();
		
		gridCarros.del(3);
		
		
		String[] row = gridCarros.getItem(5);
		StringBuilder sb = new StringBuilder();		

		sb.append("O carro na posição 5 é ");
		for (int i=0; i < row.length; i++) {
			sb.append(row[i] + (i==row.length -1 ? "" : " - "));
			
		}
		System.out.println(sb.toString());
		sb.setLength(0);
		

		
		gridCarros.setSelectedIndex(2);
		System.out.println("Você esta na posição: " + gridCarros.getSelectedIndex());
		
		
		sb.append("Nesta posição esta o ponteiro getSelectedItem: ");
		row = gridCarros.getSelectedItem();
		for (int i=0; i < row.length; i++) {
			sb.append(row[i] + (i==row.length -1 ? "" : " - "));
			
		}
		System.out.println(sb.toString());
		sb.setLength(0);	
		
		
		System.out.println(sb.toString());
		
		
		gridCarros.qsort(1, true);
		
		
		gridCarros.setColumnChoices(3, new String[] {"2019", "2018", "2017", "2016", "2015", "2014", "2013"});
		gridCarros.setColumnEditable(4, true);
		gridCarros.setImage("@Foto1", new Image("/resources/camera.png"));
	}
	private void loadGridData() {
		gridCarros = new Grid(
				new String[] {"Marca", "Modelo", "Cor", "Ano", "Estoque", "Foto"}, 
				new int[] {-23, -23, -17, -12, -14, -5},
				new int[] { CENTER, CENTER, CENTER, CENTER, RIGHT, CENTER},
				false);
		
		//List<String[]> carrosList = CarroService.getInstance().instantiateCarros();
		List<String[]> carrosList = carroSerivice.instantiateCarros();
		
		if (carrosList != null && carrosList.size() > 0) {
			for(int i=0;i<carrosList.size(); i++) {
				gridCarros.add(carrosList.get(i));
			}
		}
	
	}

	@Override
	public void initUI() {
		add(gridCarros, LEFT, TOP, FILL, FILL);
	}

}

