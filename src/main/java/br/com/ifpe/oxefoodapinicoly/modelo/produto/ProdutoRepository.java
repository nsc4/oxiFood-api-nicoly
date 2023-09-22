package br.com.ifpe.oxefoodapinicoly.modelo.produto;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifpe.oxefoodapinicoly.modelo.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    
}
