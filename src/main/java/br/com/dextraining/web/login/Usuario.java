package br.com.dextraining.web.login;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="usuario'")
public class Usuario {

	private String usuario;
	
	private String senha;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	} 
}
