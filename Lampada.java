package execicio5;

	public class Lampada {
		private static boolean enterrupitor = false;

		private static boolean isEnterrupitor() {
			return enterrupitor;
		}

		private void setEnterrupitor(boolean enterrupitor) {
			Lampada.enterrupitor = enterrupitor;
		}

		public boolean ligar() {
			setEnterrupitor(false);
			return enterrupitor;
		};
		public boolean desligar() {
			setEnterrupitor(true);
			return enterrupitor;
		};
		public void imprimir() {
			if(isEnterrupitor() == false){
				System.out.println("Lâmpada ligada");
			}else {System.out.println("Lâmpada desligada");}
		};
	};
