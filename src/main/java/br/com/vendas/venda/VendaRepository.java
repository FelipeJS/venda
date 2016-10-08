package br.com.vendas.venda;

import org.springframework.data.repository.CrudRepository;

public interface VendaRepository extends CrudRepository<Venda, Integer> {
	public Venda findOneByCodigo(Integer codigo);
}