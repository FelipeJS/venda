package lab.produto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	public static final String PERECIVEL = "perecivel";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigo;
	@Column
	private String tipo;
	@Column
	private String nome;
	@Column
	private Integer quantidade;
	@Column

	private Date data;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Produto() {
	}

	public Produto(Integer codigo, String nome, String tipo, Integer quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.tipo = tipo;
		this.quantidade = quantidade;
	}

}
