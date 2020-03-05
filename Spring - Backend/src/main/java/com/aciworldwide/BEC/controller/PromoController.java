package com.aciworldwide.BEC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aciworldwide.BEC.model.Promo;
import com.aciworldwide.BEC.service.PromoService;

@RestController
@RequestMapping("/promos")
@CrossOrigin(origins="http://localhost:4200")
public class PromoController {
	
	@Autowired
	private PromoService promoService;

	@GetMapping("/all")
	public List<Promo> getPromos()
	{
		return promoService.getPromos();
	}

	@PostMapping("/add")
	public Promo savePromo(@RequestBody Promo promo){
		System.out.println(promo);
		return promoService.savePromo(promo);

	}

}
