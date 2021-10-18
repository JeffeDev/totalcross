package Componentes;

import totalcross.ui.ComboBox;
import totalcross.ui.MainWindow;
import totalcross.ui.event.Event;
import totalcross.ui.event.KeyEvent;
import domains.Carros;

public class ComponenteComboBoxEvent extends MainWindow {

	private ComboBox cbEstadoCivil;
	
	private ComboBox cbDomain;
	private Carros[] carrosArray;
	
	public ComponenteComboBoxEvent() {
		cbEstadoCivil = new ComboBox(
			new String[] {
					"", "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Separado(a)", "União Estavel"
			});
		cbEstadoCivil.setSelectedItem("Divorciado(a)");
		
		carrosArray = new Carros[] {
				new Carros("Ford", "Focus", "Prata"),
				new Carros("GM", "Onix", "Vermelho"),
				new Carros("Fiat", "Uno", "Prata"),
				new Carros("Ford", "Onix", "Branco"),
				new Carros("Ford", "Fiesta", "Azul"),
				new Carros("GM", "Vectra", "Prata")
				
		};
		
		cbDomain = new ComboBox(carrosArray);
		cbDomain.setSelectedItem(new Carros("GM", "Onix", "Vermelho"));
		
		int selectedEstadoCivilIndex = cbEstadoCivil.getSelectedIndex();
		String selectedEstadoCivil = (String) cbEstadoCivil.getSelectedItem();
		
		int selectedCarroIndex = cbDomain.getSelectedIndex();
		Carros selectedCarro = (Carros) cbDomain.getSelectedItem();
				
		System.out.println(String.format("Estado Civil %s do array %s", selectedEstadoCivil, selectedEstadoCivilIndex ));
		System.out.println(String.format("Carro esta na posição %s do array %s", selectedCarroIndex, selectedCarro ));
		
		cbDomain.add(new Carros("Toyota", "Yaris", "Cinza"));
		cbEstadoCivil.add("Viúvo(a)");
	}	
	
	@Override
	public void initUI() {
		add(cbEstadoCivil, LEFT+10, TOP+10);
		add(cbDomain, SAME, AFTER + 10);
	}
	
	@Override
	public void onEvent(Event event) {
		if (event instanceof KeyEvent) {
			KeyEvent ke = (KeyEvent) event;
			if (ke.isDownKey()) {
				int index = (cbDomain.getSelectedIndex() + 1 == cbDomain.size()) 
						? 0 : cbDomain.getSelectedIndex() + 1;
				cbDomain.setSelectedIndex(index);
			}
		}
		super.onEvent(event);
	}

}
