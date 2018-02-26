package app.api.entities;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


@Entity
@Table(name = "\"CLIENTES\"")
@XmlRootElement
public class Clientes implements Serializable {

  private static final long serialVersionUID = 1L;
  
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nome;
  
  @Column(name = "sobrenome", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String sobrenome;
  
  public Clientes(){
  }

 
  public java.lang.String getId(){
    return this.id;
  }
  
  public Clientes setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  public java.lang.String getNome(){
    return this.nome;
  }
  
  public Clientes setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  public java.lang.String getSobrenome(){
    return this.sobrenome;
  }
  
  public Clientes setSobrenome(java.lang.String sobrenome){
    this.sobrenome = sobrenome;
    return this;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Clientes object = (Clientes)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }
  
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
}
