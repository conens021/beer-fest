package com.abstractmedia.beerfest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BeerCommandLineRunner implements CommandLineRunner{

	
	@Autowired
	private BeerRepository beerRepository;
	
	@Override
	public void run(String... args) throws Exception {
		List<Beer> beers = new ArrayList<>();
	
		beers.add(new Beer(1,"Jelen","Svetlo",4.2f));
		beers.add(new Beer(2,"Lav","Svetlo",4.2f));
		beers.add(new Beer(3,"Badwaiser","Svetlo",4.2f));
		beers.add(new Beer(4,"Tuborg","Svetlo",4.2f));
		beers.add(new Beer(5,"Niksicko","Svetlo",4.2f));
		
		
		//beers.forEach(System.out :: println);
		
		beerRepository.saveAll(beers);
		
		
		//beerRepository.findAll().forEach(System.out :: println);
	}

}
