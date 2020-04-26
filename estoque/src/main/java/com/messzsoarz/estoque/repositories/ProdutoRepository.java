package com.messzsoarz.estoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.messzsoarz.estoque.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
