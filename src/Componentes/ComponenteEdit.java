package Componentes;

import totalcross.ui.Edit;
import totalcross.ui.MainWindow;

public class ComponenteEdit extends MainWindow {
	
	private Edit editNormal;
	private Edit editCep;
	
	private Edit editFone;
	private Edit editCpf;
	private Edit editValor;
	
	public ComponenteEdit() {
		editNormal = new Edit();
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
	}
	

}
