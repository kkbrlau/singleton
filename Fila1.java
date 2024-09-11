package filadeimpressao;

public class Fila1 {
	private static Fila1 instancia;
	
	private Fila1() {
		
	}
	
	public static Fila1 getInstancia() {
		if (instancia == null) {
			instancia = new Fila1();
		}
		return instancia;
	}
    
	public void ImprimeDocumento() {
		System.out.println("O documento foi impresso");
	}
	
    public void RemoveDocumento() {
    	System.out.println("O documento foi removido");
	}
	
    public void RemoveTodosDocumentos() {
    	System.out.println("Todos os documentos foram impressos");
    }
		
}
