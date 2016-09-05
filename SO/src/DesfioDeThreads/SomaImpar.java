package DesfioDeThreads;

public class SomaImpar extends Thread{
	private int soma;
	private int numero;

	public SomaImpar(int numero) {
		this.soma = 0;
		this.numero = numero;
	}

	private void soma() {
		int soma = 0;
		if((this.numero%2) != 0){
			for (int i = 1; i <= this.numero; i += 2) {
				soma += i;
			}
		}else{
			for (int i = 1; i < this.numero; i += 2) {
				soma += i;
			}
		}
		this.soma = soma;
	}

	public int getSoma() {
		return this.soma;
	}

	@Override
	public void run() {
		soma();
	}

}
