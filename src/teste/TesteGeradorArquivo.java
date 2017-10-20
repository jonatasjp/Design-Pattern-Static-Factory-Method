package teste;

import org.junit.Test;
import org.junit.Assert;

import implementacao.GeradorArquivo;

public class TesteGeradorArquivo {

	@Test
	public void testarGeracaoArquivoPDF() {
		GeradorArquivo geradorArquivo = GeradorArquivo.getInstanceGeradorPdf();
		String resultado = geradorArquivo.gerar();

		Assert.assertEquals("arquivo PDF gerado com sucesso", resultado);
	}

	@Test
	public void testarGeracaoArquivoXLSX() {
		GeradorArquivo geradorArquivo = GeradorArquivo.getInstanceGeradorXlsx();
		String resultado = geradorArquivo.gerar();

		Assert.assertEquals("arquivo XLSX gerado com sucesso", resultado);
	}
	
	@Test
	public void testarGeracaoArquivoTXT() {
		GeradorArquivo geradorArquivo = GeradorArquivo.getInstanceGeradorTxt();
		String resultado = geradorArquivo.gerar();

		Assert.assertEquals("arquivo TXT gerado com sucesso", resultado);
	}
}
