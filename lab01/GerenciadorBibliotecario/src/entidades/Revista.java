package entidades;

public class Revista extends Itens{
	private String organizador;
	private int volume;
	private int num;
	
	public Revista(String titulo, String ano, String organizador, int volume, int num) {
		super(titulo, ano);
		this.organizador = organizador;
		this.volume = volume;
		this.num = num;
	}
	public String getOrganizador() {
		return organizador;
	}
	public void setOrganizador(String organizador) {
		this.organizador = organizador;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}
