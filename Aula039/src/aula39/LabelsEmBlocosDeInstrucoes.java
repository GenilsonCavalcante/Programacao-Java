package aula39;

public class LabelsEmBlocosDeInstrucoes {
	public static void main(String[] args) {
		/*
		 * A instru��o break pode ser utilizada para finalizar n�o domente um 
		 * looping e sim, qualquer bloco marcado por um label.
		 */
		
		label1:{
			System.out.println("Label 1 ini");
			label2:{
				System.out.println("Label 2 ini");
				label3:{
					System.out.println("Label 3 ini");
					if(true) {
						break label2;
					}
				}
				System.out.println("Label 2 fim");//Essa linha n�o � executada!!!
			}
			System.out.println("Label 1 fim");
		}
		
	}
}
