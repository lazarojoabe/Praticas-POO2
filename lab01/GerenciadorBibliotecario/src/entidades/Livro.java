package entidades;

public class Livro extends Itens{
	private String autor;

	public Livro(String titulo, String ano, String autor) {
		super(titulo, ano);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	


}
