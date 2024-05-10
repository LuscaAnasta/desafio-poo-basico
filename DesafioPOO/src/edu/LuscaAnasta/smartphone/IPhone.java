package edu.LuscaAnasta.smartphone;

import edu.LuscaAnasta.smartphone.aplicativos.Aparelho_Telefonico;
import edu.LuscaAnasta.smartphone.aplicativos.Navegador_Internet;
import edu.LuscaAnasta.smartphone.aplicativos.Reprodutor_Musical;

public class IPhone implements Aparelho_Telefonico, Navegador_Internet, Reprodutor_Musical {
	
			
	@Override
	public void tocar() {
		System.out.println("Tocando Musica.");				
	}
	
	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Musica.");	
		
	}
	
	@Override
	public void pausar() {
		System.out.println("Musica Pausada.");	
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Pagina.");	
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando Pagina.");	
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina.");	
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando.");	
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo.");	
		
	}

	@Override
	public void correioDeVoz() {
		System.out.println("Correio de Voz.");	
		
	}
	
}
