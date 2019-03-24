package estruturado;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {
	
	public static void main(String[] args) throws IOException {
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("nome", "Dione");
		mapa.put("idade", 31);

		GeradorArquivo geraCripgrafado = new GeradorArquivo();
		geraCripgrafado.gerarArquivo("C:\\Gerador\\Estruturado\\Criptografado.txt", mapa, "PROPRIEDADES_CRIPTOGRAFADO");

		GeradorArquivo geraCompactado = new GeradorArquivo();
		geraCompactado.gerarArquivo("C:\\Gerador\\Estruturado\\XML.zip", mapa, "XML_COMPACTADO");  
	}
	
}
