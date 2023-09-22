import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefoodapinicoly.modelo.produto.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoRequest {

   private String descricao;

   private String  titulo;

   private String codigoproduto;

   private String valorUnitario;

   private String foneFixo;

      private String foneFixo;


   public Produto build() {

       return Produto.builder()
               .descricao(descricao)
               .titulo(titulo)
               .codigoproduto(codigoproduto)
               .valorUnitario(valorUnitario)
               .foneFixo(foneFixo)
               .build();
   }
}