package chainsOfResponsability;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {
	public static void main(String[] args) throws IOException {
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("nome", "Dione");
		mapa.put("idade", 31);
		
		Processador processaCompactado = new ProcessaCompactado();
		Processador processaCriptografado = new ProcessaCriptografado(processaCompactado);		
		GeradorArquivo gerador = new GeradorArquivoPropriedades(processaCriptografado);
		
		gerador.gerarArquivo("C:\\Gerador\\ChainsOfResponsability\\Arquivo.zip", mapa);
	}
}