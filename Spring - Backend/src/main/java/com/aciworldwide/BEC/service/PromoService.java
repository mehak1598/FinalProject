package com.aciworldwide.BEC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aciworldwide.BEC.model.Promo;
import com.aciworldwide.BEC.repository.PromoRepository;

@Service
public class PromoService {
	
	@Autowired
	private PromoRepository repository;
	
	public List<Promo> getPromos()
	{
		return repository.findAll();
	}

	public Promo savePromo(Promo promo)
	{
		return repository.save(promo);

	}

}
