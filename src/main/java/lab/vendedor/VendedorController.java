package lab.vendedor;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
  
  @Autowired
  private VendedorService vendedorService;
  
  @RequestMapping(value = "/consultar", method = GET)
  public Vendedor consultar(@RequestParam Integer codigo) {
    return vendedorService.obterVendedor(codigo);
  }

  @RequestMapping("/listar")
  public Iterable<Vendedor> listar() {
    return vendedorService.obterTodos();
  }

  @RequestMapping(value = "/novo", method = POST)
  public Vendedor novo(@RequestBody Vendedor produto) {
    return vendedorService.registrarVendedor(produto);
  }
}