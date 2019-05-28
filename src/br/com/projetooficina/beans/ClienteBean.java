package br.com.projetooficina.beans;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.projetooficina.model.Colaborador;
import br.com.projetooficina.repository.ColaboradorRepository;

@Named(value="clienteBean")
@RequestScoped
public class ClienteBean implements Serializable {

	private static final long serialVersionUID = 772905806377110954L;

	@Inject
	private Colaborador colaborador;
	
	@Inject
	private ColaboradorRepository colaboradorRepository;
	
	private String titulo = "Cadastro de Clientes";
	
	//@PostConstruct
    public void init(){
        System.out.println(" Bean executado! ");
        colaborador.setNome("Alberto Rober");
		colaborador.setEmail("aa@email.com");		
    }
	
	public void save() {
		colaborador.setNome("Alberto Rober");
		colaborador.setEmail("aa@email.com");
		System.out.println("chamou repo.save1");
		colaboradorRepository.novoRegistro(colaborador);
	}
	
	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public String getTitulo() {
		return titulo;
	}
	
	

}
