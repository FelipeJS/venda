package lab.vendedor;

import org.springframework.data.repository.CrudRepository;

public interface VendedorRepository extends CrudRepository<Vendedor, Integer> {
	public Vendedor findOneByCodigo(Integer codigo);
}