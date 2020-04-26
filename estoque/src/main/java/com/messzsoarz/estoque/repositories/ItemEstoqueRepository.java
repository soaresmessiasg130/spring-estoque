package com.messzsoarz.estoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.messzsoarz.estoque.models.ItemEstoque;

public interface ItemEstoqueRepository extends JpaRepository<ItemEstoque, Long>{

}
