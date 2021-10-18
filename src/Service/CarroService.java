package Service;

import java.util.ArrayList;
import java.util.List;

public class CarroService {
	
	private static CarroService instance;
	
	public static CarroService getInstance() {
		if (instance == null) {
			instance = new CarroService();
		}
		return instance;
	}
	
	public List<String[]> instantiateCarros(){
		List<String[]> carrosList = new ArrayList<String[]>();
		carrosList.add(new String[] {"Ford", "Ká", "Branco", "", "","@Foto1"});
		carrosList.add(new String[] {"Ford", "Fiesta", "Vermelho", "", "", ""});
		carrosList.add(new String[] {"Ford", "Focus", "Preto", "", "", ""});
		carrosList.add(new String[] {"Ford", "Fusion", "Prata", "", "", ""});
		carrosList.add(new String[] {"Ford", "Ká", "Cinca", "", "", ""});
		carrosList.add(new String[] {"Ford", "Ranger", "Azul", "", "", ""}); 
		carrosList.add(new String[] {"Chevrolet", "Onix", "Vermelho", "", "", ""});
		carrosList.add(new String[] {"Chevrolet", "Prisma", "Branco", "", "", ""});
		carrosList.add(new String[] {"Chevrolet", "Cruze", "Preto", "", "", ""});
		carrosList.add(new String[] {"Chevrolet", "Onix", "Prata", "", "", ""});

		return carrosList;
	}
	
	public List<String[]> instantiateCarrosSumary(){
		List<String[]> carrosList = new ArrayList<String[]>();
		carrosList.add(new String[] {"Ford", "Ká", "Branco"});
		carrosList.add(new String[] {"Ford", "Fiesta", "Vermelho"});
		carrosList.add(new String[] {"Ford", "Focus", "Preto"});
		carrosList.add(new String[] {"Ford", "Fusion", "Prata"});
		carrosList.add(new String[] {"Ford", "Ká", "Cinca"});
		carrosList.add(new String[] {"Ford", "Ranger", "Azul"}); 
		carrosList.add(new String[] {"Chevrolet", "Onix", "Vermelho"});
		carrosList.add(new String[] {"Chevrolet", "Prisma", "Branco"});
		carrosList.add(new String[] {"Chevrolet", "Cruze", "Preto"});
		carrosList.add(new String[] {"Chevrolet", "Onix", "Prata"});

	    return carrosList;	
	}
	
	public List<String[]> instantiateHorarios(){
		List<String[]> horariosList = new ArrayList<String[]>();
		horariosList.add(new String[] {"Dia 12/12/2021", "Horário: 08:00am", "Previsão: 09:00am"});
		horariosList.add(new String[] {"Dia 01/01/2022", "Horário: 08:00am", "Previsão: 09:00am"});
		horariosList.add(new String[] {"Dia 12/01/2022", "Horário: 08:00am", "Previsão: 09:00am"});
		horariosList.add(new String[] {"Dia 15/01/2022", "Horário: 08:00am", "Previsão: 09:00am"});
		horariosList.add(new String[] {"Dia 16/02/2022", "Horário: 08:00am", "Previsão: 09:00am"});
		return horariosList;
	}
	
	public String[] getAgendaVazia() {
		return new String[] {"Dia: a Confirmar", "Horário: a Confirmar", "Previsão: sem previsão"};
	}
}
