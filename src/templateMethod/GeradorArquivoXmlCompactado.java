package templateMethod;

import java.util.Map;

public class GeradorArquivoXmlCompactado extends GeradorArquivo {
	
	@Override
	protected String gerarConteudo(Map<String,Object> propriedades) {
		StringBuilder propFileBuilder = new StringBuilder();
		propFileBuilder.append("<properties>");
		
		for (String prop: propriedades.keySet()) {
			propFileBuilder.append("<" + prop + ">" + propriedades.get(prop) + "</" + prop + ">");
		}
		
		propFileBuilder.append("</propriedades>");
		return propFileBuilder.toString();
	}
	
}