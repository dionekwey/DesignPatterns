package observer;

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
		
		List<Processador> processadores = new ArrayList<Processador>();
		processadores.add(new ProcessaCriptografado());
		processadores.add(new ProcessaCompactado());
		
		List<Processador> processadores1 = new ArrayList<Processador>();
		processadores1.add(new ProcessaCompactado());
		processadores1.add(new ProcessaCriptografado());
		
		List<Processador> processadores2 = new ArrayList<Processador>();
		processadores2.add(new ProcessaDefault());
		processadores2.add(new ProcessaCompactado());
		
		GeradorArquivo gerador = new GeradorArquivoPropriedades(new ProcessadorComposto(processadores));
		gerador.addObservador(new LogService());
		gerador.addObservador(new LogBO());
		gerador.gerarArquivo("C:\\Gerador\\Observer\\Prop.zip", mapa);
		
		GeradorArquivo geraXML = new GeradorArquivoXml(new ProcessadorComposto(processadores1));
		geraXML.gerarArquivo("C:\\Gerador\\Observer\\XML.txt", mapa);
		
		GeradorArquivo geraDefault = new GeradorArquivoPropriedades(new ProcessadorComposto(processadores2));
		geraDefault.gerarArquivo("C:\\Gerador\\Observer\\Default.zip", mapa);
	}
}