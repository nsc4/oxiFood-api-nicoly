package br.com.ifpe.oxefoodapinicoly.modelo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import org.hibernate.annotations.Where;
//import org.springframework.data.annotation.CreatedDate;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.ifpe.oxefoodapinicoly.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Produto")
@Where(clause = "habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor



public class Produto extends EntidadeAuditavel  {

   
   @Id
   @Column
   private String titulo;

   @Column
   private String  descricao;
   
   @Column
   private String    codigoproduto;


    @Column
   private String MinutosMaximos;
  @Column
   private String MinutosMinimos;

      @Column
   private String valorUnitario;

}

