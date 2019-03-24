package templateMethod;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {
	public static void main(String[] args) throws IOException {
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("nome", "Dione");
		mapa.put("idade", 31);
		
		GeradorArquivo geraCriptografado = new GeradorArquivoPropriedadesCriptografado();
		geraCriptografado.gerarArquivo("C:\\Gerador\\Template\\Criptografado.txt", mapa);
		
		GeradorArquivo geraXML = new GeradorArquivoXmlCompactado();
		geraXML.gerarArquivo("C:\\Gerador\\Template\\XML.zip", mapa);
	}
}