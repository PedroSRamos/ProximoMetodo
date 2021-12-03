package br.edu.univas.main;

import br.edu.univas.proxy.ImagemP;
import br.edu.univas.proxy.img;
import br.edu.univas.proxy.desenho;

	public class Main {
		public static void main(String[] args) {
			
			desenho ds = new ImagemP ("Gatinho fofo");
			
			ds.desenha();
			System.out.println();
			
			ds.desenha();
			System.out.println();
		}
}