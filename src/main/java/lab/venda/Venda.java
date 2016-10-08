package lab.venda;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lab.cliente.Cliente;
import lab.produto.Produto;
import lab.vendedor.Vendedor;

@Entity
public class Venda {

	public static final String PERECIVEL = "perecivel";

	@Id
	private Integer codigo;

	@ManyToOne
	@JoinColumn(name = "cliente_codigo")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "produto_codigo")
	private Produto produto;

	@ManyToOne
	@JoinColumn(name = "vendedor_codigo")
	private Vendedor vendedor;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

}
