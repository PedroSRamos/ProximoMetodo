package br.edu.univas.proxy;

public class ImagemP implements desenho {

	@SuppressWarnings("unused")
	private String imagem;
	
		public ImagemP(String imagem) {
			this.imagem = imagem;
			carregandoImagem(imagem);
		}

		@Override
		public void desenha() {
			System.out.println("Desenhando: \n"
					+ "	A___A \r\n"
					+ " |・ㅅ・|  \r\n"
					+ "	|っ　ｃ|  \r\n"
					+ "	|　　 |  \r\n"
					+ "	|　　　|  \r\n"
					+ "	|　　　|  \r\n"
					+ "	|　　　|  \r\n"
					+ "	|　　　|  \r\n"
					+ "	U￣￣U   \r\n"
					+ "_Gatinho FOFO_");
		}
		private void carregandoImagem(String imagem) {
			System.out.println("Carregando arquivo"+imagem+"do banco de dados.\n");
		}

}
