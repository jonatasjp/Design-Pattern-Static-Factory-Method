package implementacao;

public abstract class GeradorArquivo implements Gerador{
	
	public static GeradorArquivo getInstanceGeradorPdf(){
		return new GeradorArquivoPdf();
	}
	
	public static GeradorArquivo getInstanceGeradorXlsx() {
		return new GeradorArquivoXlsx();
	}
	
	public static GeradorArquivo getInstanceGeradorTxt() {
		return new GeradorArquivoTxt();
	}
	
}
