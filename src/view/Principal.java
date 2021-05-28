package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {
	public static void main (String[] args) {
		IArquivosController arqCont = new ArquivosController();
		String dirWin = "C:\\Windows";
		String path = "C:\\TEMP";
		String nome = "texte";
		
		try {
			//arquivosController.readDir(dirWin);
			//arquivosController.createFile(path, nome);
			//arquivosController.readFile(path, nome);
			arqCont.openFile(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
