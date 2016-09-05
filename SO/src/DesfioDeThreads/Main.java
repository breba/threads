package DesfioDeThreads;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String args[]) throws InterruptedException {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para somatório"));
		SomaImpar soma1 = new SomaImpar(numero);
		SomaPar soma2 = new SomaPar(numero);
		
		Thread threadSoma1 = new Thread(soma1);
		Thread threadSoma2 = new Thread(soma2);
		threadSoma1.start();
		threadSoma2.start();
		threadSoma1.join();
		threadSoma2.join();
		
		int somaTotal = soma1.getSoma() + soma2.getSoma();
		System.out.println(somaTotal);

	}

}
