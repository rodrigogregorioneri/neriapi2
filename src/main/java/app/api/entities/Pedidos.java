package app.api.entities;
import javax.persistence.*;

import java.io.Serializable;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela PEDIDOS
 * @generated
 */
@Entity
@Table(name = "\"pedidos\"")
@XmlRootElement
public class Pedidos implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "codigo_cliente", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Long codigo_cliente;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "datada_cadastro", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date datada_cadastro;
  
  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nome;
  
  /**
  * @generated
  */
  @Column(name = "numero_controle", nullable = true, unique = true, insertable=true, updatable=true)
  private java.lang.Long numero_controle;
  
  /**
  * @generated
  */
  @Column(name = "quantidade", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.Integer quantidade;
  
  /**
  * @generated
  */
  @Column(name = "valor", nullable = true, unique = false, insertable=true, updatable=true)
  private double valor;
  
  /**
   * Construtor
   * @generated
   */
  public Pedidos(){
  }

  
  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Pedidos setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém codigo_cliente
   * return codigo_cliente
   * @generated
   */
  public java.lang.Long getCodigo_cliente(){
    return this.codigo_cliente;
  }
  
  /**
   * Define codigo_cliente
   * @param codigo_cliente codigo_cliente
   * @generated
   */
  public Pedidos setCodigo_cliente(java.lang.Long codigo_cliente){
    this.codigo_cliente = codigo_cliente;
    return this;
  }
  
  /**
   * Obtém datada_cadastro
   * return datada_cadastro
   * @generated
   */
  public java.util.Date getDatada_cadastro(){
    return this.datada_cadastro;
  }
  
  /**
   * Define datada_cadastro
   * @param datada_cadastro datada_cadastro
   * @generated
   */
  public Pedidos setDatada_cadastro(java.util.Date datada_cadastro){
	if(datada_cadastro == null) {
		this.datada_cadastro = new Date();
	}else {
		this.datada_cadastro = datada_cadastro;	
	}
    return this;
  }
  
  /**
   * Obtém nome
   * return nome
   * @generated
   */
  public java.lang.String getNome(){
    return this.nome;
  }
  
  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Pedidos setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém numero_controle
   * return numero_controle
   * @generated
   */
  public java.lang.Long getNumero_controle(){
    return this.numero_controle;
  }
  
  /**
   * Define numero_controle
   * @param numero_controle numero_controle
   * @generated
   */
  public Pedidos setNumero_controle(java.lang.Long numero_controle){
    this.numero_controle = numero_controle;
    return this;
  }
  
  /**
   * Obtém quantidade
   * return quantidade
   * @generated
   */
  public java.lang.Integer getQuantidade(){
    return this.quantidade;
  }
  
  /**
   * Define quantidade
   * @param quantidade quantidade
   * @generated
   */
  public Pedidos setQuantidade(java.lang.Integer quantidade){
	if(quantidade == null) {
		this.quantidade = 1;
	}else {
		this.quantidade = quantidade;	
	}  
    return this;
  }
  
  /**
   * Obtém valor
   * return valor
   * @generated
   */
  public double getValor(){
    return this.valor;
  }
  
  /**
   * Define valor
   * @param d valor
   * @generated
   */
  public Pedidos setValor(double d){
    this.valor = d;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pedidos object = (Pedidos)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
}