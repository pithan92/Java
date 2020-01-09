package execicio5;

	public class Lampada {
		private  boolean enterrupitor = false;

		private  boolean isEnterruptor() {
			return enterrupitor;
		}

		private void setEnterruptor(boolean enterruptor) {
			Lampada.enterruptor = enterruptor;
		}

		public boolean ligar() {
			setEnterruptor(false);
			return enterruptor;
		};
		public boolean desligar() {
			setEnterruptor(true);
			return enterruptor;
		};
		public void imprimir() {
			if(isEnterruptor() == false){
				System.out.println("Lâmpada ligada");
			}else {System.out.println("Lâmpada desligada");}
		};

		public static void main(String[] args) {	
			Lampada l1 = new Lampada();
			l1.ligar();
			l1.desligar();
			l1.imprimir();
			
		}

	}
