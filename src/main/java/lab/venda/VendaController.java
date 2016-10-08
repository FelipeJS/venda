package lab.venda;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venda")
public class VendaController {
  
  @Autowired
  private VendaService vendaService;
  
  @RequestMapping(value = "/consultar", method = GET)
  public Venda consultar(@RequestParam Integer codigo) {
    return vendaService.obterVenda(codigo);
  }

  @RequestMapping("/listar")
  public Iterable<Venda> listar() {
    return vendaService.obterTodos();
  }

  @RequestMapping(value = "/novo", method = POST)
  public Venda novo(@RequestBody Venda venda) {
    return vendaService.registrarVenda(venda);
  }
}