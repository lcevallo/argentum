package br.com.alura.argentum.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaMundoBean {
	private String mensaje="Este mensaje va directo a este bean";
	private String nome;
	
	public void botonClicado(){
		System.out.println("El boton fue clicado!! Su nombre es: "+this.nome);
	}
	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
