package br.edu.univas.proxy;

public class img implements desenho {

	private img minhaImagem;
	private String nomeArquivo = "Gatinho fofo";
	
	public img (String nomeArquivo){
		this.nomeArquivo = nomeArquivo;
	}
	
	@Override
	public void desenha() {
		if(minhaImagem == null) {
			System.out.println("\n Nao tem imagem... Criando Imagem...\n");
			minhaImagem = new img (nomeArquivo);
		}else{
			System.out.println("\n Recuperando Imagem " + nomeArquivo + " criada antes...\n");
		}
		
		minhaImagem.desenha();
	}
	

}
