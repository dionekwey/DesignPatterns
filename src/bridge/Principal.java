package bridge;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {
	
	public static void main(String[] args) throws IOException {
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("nome", "Dione");
		mapa.put("idade", 31);
		
		GeradorArquivo geraCriptografado = new GeradorArquivoPropriedades(new ProcessaCriptografado());
		geraCriptografado.gerarArquivo("C:\\Gerador\\Bridge\\Cripto.txt", mapa);
		
		GeradorArquivo geraCompactado = new GeradorArquivoXml(new ProcessaCompactado());
		geraCompactado.gerarArquivo("C:\\Gerador\\Bridge\\XML.zip", mapa);
		
		GeradorArquivo geraDefault = new GeradorArquivoPropriedades(new ProcessaDefault());
		geraDefault.gerarArquivo("C:\\Gerador\\Bridge\\Default.txt", mapa);
	}
	
}