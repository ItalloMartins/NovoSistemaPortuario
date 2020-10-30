package com.nsp.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nsp.model.ModelNavio;
import com.nsp.repository.NavioRepository;

@Controller
public class NavioController {
	
	private final NavioRepository navioRepository;
	
	
	public NavioController(NavioRepository navioRepository) {
		super();
		this.navioRepository = navioRepository;
	}
	
	@GetMapping("/")
	public String mostraNavio(Model model) {
		model.addAttribute("model_navio", navioRepository.findAll());
		return "index";
	}

	@GetMapping("/signup")
    public String showSignUpForm(ModelNavio modelNavio) {
        return "add-user";
    }
	
	@PostMapping("/adduser")
	public String addNavio(@Valid ModelNavio modelNavio, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-user";
		}
		
		navioRepository.save(modelNavio);
		model.addAttribute("model_navio", navioRepository.findAll());
		return "index";
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateForm(@PathVariable("id") long id, Model model ) {
		ModelNavio modelNavio = navioRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Inválido"));
		model.addAttribute("model_navio", modelNavio);
		return "update-user";
	}
	
	@PostMapping("/update/{id}")
	public String updateUser(@PathVariable("id") long id, @Valid ModelNavio modelNavio, BindingResult result, Model model) {
		if(result.hasErrors()) {
			modelNavio.setId(id);
			return "update-user";
		}
		
		navioRepository.save(modelNavio);
		model.addAttribute("model_navio", navioRepository.findAll());
		return "redirect:/index";
	}
}
