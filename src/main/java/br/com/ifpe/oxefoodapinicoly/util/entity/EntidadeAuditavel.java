package br.com.ifpe.oxefoodapinicoly.util.entity;


    import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


@MappedSuperclass
public abstract class EntidadeAuditavel extends EntidadeNegocio {
    
    @JsonIgnore
   @Version

    private Long versao;

 @JsonIgnore
   @CreatedDate

    private LocalDate dataCriacao;

   

    private LocalDate dataUltimaModificacao;

   

    private Long criadoPor; // Id do usuário que o criou

 @JsonIgnore
   @Column
    private Long ultimaModificacaoPor; // Id do usuário que fez a última alteração
   
}

    

