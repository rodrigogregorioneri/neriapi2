package app.api.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import app.api.entities.*;
import app.api.business.*;

/**
 * Controller para expor serviços REST de Pedidos
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Pedidos")
public class PedidosREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("PedidosBusiness")
  private PedidosBusiness pedidosBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Pedidos post(@Validated @RequestBody final Pedidos entity) throws Exception {
    return pedidosBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Pedidos put(@Validated @RequestBody final Pedidos entity) throws Exception {
    return pedidosBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{pedidosId}")
  public Pedidos put(@Validated @RequestBody final Pedidos entity, @PathVariable("pedidosId") java.lang.String pedidosId) throws Exception {
    return pedidosBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{pedidosId}")
  public void delete(@PathVariable("pedidosId") java.lang.String pedidosId) throws Exception {
    pedidosBusiness.delete(pedidosId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Pedidos>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(pedidosBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{pedidosId}")
  public Pedidos get(@PathVariable("pedidosId") java.lang.String pedidosId) throws Exception {
    return pedidosBusiness.get(pedidosId);
  }
}
