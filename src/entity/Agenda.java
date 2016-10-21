package entity;

import java.util.List;

public class Agenda {

		private Funcionario funcionario;
		private List<Periodo> periodos;
		
		public List<Periodo> getPeriodos() {
			return periodos;
		}

		public void setPeriodos(List<Periodo> periodos) {
			this.periodos = periodos;
		}

		private Agenda(Funcionario funcionario, List<Periodo> periodos) {
			this.periodos = periodos;
			this.funcionario = funcionario;
		}
		
		public static Agenda nova(Funcionario funcionario, List<Periodo> periodos){
			return new Agenda(funcionario, periodos);
		}
		
		public Funcionario getFuncionario(){
			return this.funcionario;
		}
		
		public void novoPeriodo(Funcionario funcionario, Periodo periodo){
			this.funcionario = funcionario;
			this.periodos.add(periodo);
		}
		
		public void removePeriodo(Periodo periodo){
			this.periodos.remove(periodo);
		}
		
		public void alteraPeriodo(Periodo de, Periodo para){
			this.periodos.remove(de);
			this.periodos.add(para);
		}
		
		@Override
		public String toString() {
			return "Agenda de: "+this.getFuncionario().getNome()+" possui: "+this.periodos.size()+" periodos cadastrados";
		}
}
