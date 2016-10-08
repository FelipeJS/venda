package lab.venda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {

	@Autowired
	private VendaRepository vendaRepository;

	public Venda registrarVenda(Venda venda) {
		return vendaRepository.save(venda);
	}

	public Venda obterVenda(Integer codigo) {
		return vendaRepository.findOneByCodigo(codigo);
	}

	public Iterable<Venda> obterTodos() {
		return vendaRepository.findAll();
	}
}
