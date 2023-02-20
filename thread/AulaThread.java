package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();

		System.out.println("Chegou a fim do codigo de teste de thread");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}
	/*---------------------------------------------------------------------------*/

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			for (int pos = 0; pos < 10; pos++) {

				System.out.println("Executando algo rotina, por exemplo envio de e-mail");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {

			for (int pos = 0; pos < 10; pos++) {

				System.out.println("Executando algo rotina, por exemplo envio de notas ficais");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
}

