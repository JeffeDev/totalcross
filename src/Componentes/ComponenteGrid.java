package Componentes;

import totalcross.ui.Grid;
import totalcross.ui.MainWindow;

public class ComponenteGrid extends MainWindow {
	private Grid gridCarros;
	
	
	public ComponenteGrid() {
		gridCarros = new Grid(
				new String[] {"Marca", "Modelo", "Cor", "Ano", "Estoque"}, 
				new int[] {-25, -25, -20, -15, -15},
				new int[] { CENTER, CENTER, CENTER, CENTER, CENTER},
				false);
		
		gridCarros.add(new String[] {"Ford", "Ká", "Branco", "", ""});
		gridCarros.add(new String[] {"Ford", "Fiesta", "Vermelho", "", ""});
		gridCarros.add(new String[] {"Ford", "Focus", "Preto", "", ""});
		gridCarros.add(new String[] {"Ford", "Fusion", "Prata", "", ""});
		gridCarros.add(new String[] {"Ford", "Ká", "Cinca", "", ""});
		
		
		gridCarros.add(new String[][]
				{
					new String[] {"Chevrolet", "Onix", "Vermelho", "", ""},
					new String[] {"Chevrolet", "Prisma", "Branco", "", ""},
					new String[] {"Chevrolet", "Cruze", "Preto", "", ""},
					new String[] {"Chevrolet", "Onix", "Prata", "", ""},
				});
		gridCarros.add(new String[] {"Ford", "Ranger", "Azul", "", ""}, 4); 

		
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
	}
	
	@Override
	public void initUI() {
		add(gridCarros, LEFT, TOP, FILL, FILL);
	}

}
