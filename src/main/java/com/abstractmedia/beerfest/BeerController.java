package com.abstractmedia.beerfest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class BeerController {
	
	
	@Autowired
	private BeerRepository beerRepository;

	@RequestMapping("/find-all")
	public ResponseEntity<List<Beer>> getAll(){
		List<Beer> beers = beerRepository.findAll();
		beers.forEach(System.out::println);
		return new ResponseEntity<List<Beer>>(beers,HttpStatus.OK);
	}

}
