package Componentes;

import totalcross.ui.MainWindow;
import totalcross.ui.Radio;
import totalcross.ui.RadioGroupController;

public class ComponenteRadio extends MainWindow {
	private Radio radioJuridico;
	private Radio radioFisico;
	private RadioGroupController radioTipoPessoa;
	
	private Radio sexoMasculino;
	private Radio sexoFeminino;
	private Radio sexoNaoinformar;
	private RadioGroupController radioTipoSexo;
	
	public ComponenteRadio() {
		radioTipoPessoa = new RadioGroupController();
		radioJuridico = new Radio("Jurídico");
		radioFisico = new Radio("Físico");	
			
		radioTipoPessoa.add(radioFisico);
		radioTipoPessoa.add(radioJuridico);
		
		radioJuridico.setChecked(true);
		
		radioTipoSexo = new RadioGroupController();
		sexoMasculino = new Radio("Masculino");
		sexoFeminino = new Radio("Feminino");
		sexoNaoinformar = new Radio("Não Informar");
		
		radioTipoSexo.add(sexoMasculino);
		radioTipoSexo.add(sexoFeminino);
		radioTipoSexo.add(sexoNaoinformar);
		
		sexoMasculino.setChecked(true);
		
		System.out.println("Tipo Pessoa = Juridico?" + (radioJuridico.isChecked() ? "Sim" : "Não"));
		System.out.println("Tipo Sexo = Masculino?" + (sexoMasculino.isChecked() ? "Sim" : "Não"));
	}
	
	
	public void initUI() {
		add(radioJuridico, LEFT + 10, TOP + 10);
		add(radioFisico, SAME, AFTER + 10);
		
		add(sexoMasculino, SAME, AFTER + 10);
		add(sexoFeminino, SAME, AFTER + 10);
		add(sexoNaoinformar, SAME, AFTER + 10);

	}



}
