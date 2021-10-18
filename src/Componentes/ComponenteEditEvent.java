package Componentes;

import totalcross.ui.Edit;
import totalcross.ui.MainWindow;
import totalcross.ui.event.ControlEvent;
import totalcross.ui.event.Event;
import totalcross.ui.event.KeyEvent;

public class ComponenteEditEvent extends MainWindow {
	
	private Edit editNormal;
	private Edit editCep;
	
	private Edit editFone;
	private Edit editCpf;
	private Edit editValor;
	private Edit editNome;
	
	public ComponenteEditEvent() {
		editNormal = new Edit();
		
		editNome = new Edit();
		editNome.caption = "Digite seu nome";
		
		editCep = new Edit("99999-999");
		editCep.setMode(Edit.NORMAL, true);
		editCep.setValidChars("0123456789");
		editCep.setText("88735000");
		
		editFone = new Edit("(99)99999-9999");
		editFone.setMode(Edit.NORMAL, true);
		editFone.setValidChars("0123456789");
		editFone.setText("48999679641");
		
		editCpf = new Edit("999.999.999-99");
		editCpf.setMode(Edit.NORMAL, true);
		editCpf.setValidChars("0123456789");
		editCpf.setText("12205151835");
		
		editValor = new Edit("99999.999,99");
		editValor.setMode(Edit.CURRENCY, true);
		editValor.setValidChars("0123456789");	
		editValor.setText("1854,13");
		
		System.out.println(editCep.getTextWithoutMask());
		System.out.println(editFone.getTextWithoutMask());
		System.out.println(editCpf.getTextWithoutMask());
		System.out.println(editValor.getText());
	}
	
	@Override
	public void initUI() {
		add(editNormal, LEFT + 5, TOP + 5);
		add(editCep, SAME, AFTER + 5);
		
		add(editFone, SAME, AFTER + 5);
		add(editCpf, SAME, AFTER + 5);
		add(editValor, SAME, AFTER + 5);
		add(editNome, SAME, AFTER + 5);
	}
	
	@Override
	public void onEvent(Event event) {
		switch(event.type) {
		case ControlEvent.FOCUS_IN : 
			if (event.target == editCep) {
				System.out.println("Aguardando informações CEP...");
				break;
			}
		case ControlEvent.FOCUS_OUT : 
			if (event.target == editCep) {
				System.out.println(String.format("Cep digitado: %s", editCep.getText()));
				break;
			}
		case ControlEvent.HIGHLIGHT_IN : 
			if (event.target == editValor) {
				System.out.println(String.format("O mesmo comportamento do FOCUS_IN"));
				break;
			}
		case KeyEvent.KEY_PRESS : 
			if (event.target == editFone) {
				System.out.println(editFone.getText());
				break;
			}	
		}
		super.onEvent(event);
	}
}