package cursojava.threadTela;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
			new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	          public static void add(ObjetoFilaThread objetoFilaThread  ) {
		pilha_fila.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
		Iterator iteracao = pilha_fila.iterator();
		   synchronized (iteracao) {/* Bloquear o acesso a esta lista por outro processos*/
			   
				while (iteracao.hasNext()) {/*Enquanto conter dados na lista irá processar */
					
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();/*Pega o objeto atual*/
					
					/*processar 10mil notas fiscal
					 * gerar uma lista enorme de pdf
					 * gerar um envio em massa de e-mail
					 *  
					 * */
				   System.out.println("*************************************");
				   System.out.println(processar.getEmail());
				   System.out.println(processar.getNome());
                   System.out.println("*************************************");

					iteracao.remove();
					try {
						Thread.sleep(100);/*Da um tempo pra descarga de memoria */
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		try {
			Thread.sleep(1000);/*processou toda lista da um tempo pra limpez de memoria*/
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
