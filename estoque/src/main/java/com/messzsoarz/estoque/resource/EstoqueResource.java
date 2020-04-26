package com.messzsoarz.estoque.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.messzsoarz.estoque.models.ItemEstoque;
import com.messzsoarz.estoque.repositories.ItemEstoqueRepository;

@RestController
@RequestMapping("/estoque")
public class EstoqueResource {
	
	@Autowired
	private ItemEstoqueRepository repo;
	
	@GetMapping("/{id}")
	public ItemEstoque getItemEstoque (@RequestParam long id) {
		return repo.getOne(id);
	}

	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<ItemEstoque> getEstoque () {
		Iterable<ItemEstoque> estoque = repo.findAll();
		return estoque;
	}
	
	@PostMapping("/save")
	public ItemEstoque saveEstoque (@RequestBody @Valid ItemEstoque entity) {
		return repo.save(entity);
	}
	
	@DeleteMapping("/delete/{id}")
	public ItemEstoque deleteEstoque (@RequestParam long id) {
		ItemEstoque item = this.getItemEstoque(id);
		repo.delete(item);
		return item;
	}
}








