package app.api.business;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import app.api.dao.PedidosRepository;
import app.api.entities.Pedidos;;

/**
 * Classe que representa a camada de negócios de PedidosBusiness
 * 
 * @generated
 **/
@Service("PedidosBusiness")
public class PedidosBusiness {



  /**
   * Instância da classe PedidosDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("PedidosDAO")
  protected PedidosRepository repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Pedidos post(final Pedidos entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Pedidos result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Pedidos put(final Pedidos entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Pedidos result = repository.saveAndFlush(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public void delete(java.lang.String id) throws Exception {
    Pedidos entity = this.get(id);
    // begin-user-code  
    // end-user-code
    this.repository.delete(entity);
    // begin-user-code  
    // end-user-code        
  }
  
  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public Pedidos get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Pedidos result = repository.findOne(id);
    // begin-user-code
    // end-user-code
    return result;
  }

  // CRUD
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Pedidos> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Pedidos> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
}

