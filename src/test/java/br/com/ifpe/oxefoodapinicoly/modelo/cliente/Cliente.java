package br.com.ifpe.oxefoodapinicoly.modelo.cliente;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.ifpe.oxefoodapinicoly.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Cliente")
@Where(clause = "habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor



public class Cliente extends EntidadeAuditavel  {

   
 
   @Column
   private String nome;

   
    @Column
   private LocalDate dataNascimento;

    @Column
   private String cpf;

    @Column
   private String foneCelular;

    @Column
   private String foneFixo;

}
