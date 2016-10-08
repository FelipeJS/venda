package br.com.vendas.vendedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendedorService {

	@Autowired
	private VendedorRepository vendedorRepository;

	public Vendedor registrarVendedor(Vendedor vendedor) {
		return vendedorRepository.save(vendedor);
	}

	public Vendedor obterVendedor(Integer codigo) {
		return vendedorRepository.findOneByCodigo(codigo);
	}

	public Iterable<Vendedor> obterTodos() {
		return vendedorRepository.findAll();
	}
}
