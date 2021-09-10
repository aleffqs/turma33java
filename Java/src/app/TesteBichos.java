package app;

import entities.Cachorro;
import entities.Preguica;
import entities.Cavalo;


public class TesteBichos {

	public static void main(String[] args) {
		
		
		Cachorro dog1 = new Cachorro("CARAMELO",5);
		Cavalo panga1 = new Cavalo("PÉ-DE-PANO",8);
		Preguica bicho1 = new Preguica ("THE FLASH",6);
		
		panga1.emitirSom();
		panga1.emDuasPatas();
		
		
		
		/*
		System.out.println(panga1.toString());
		panga1.emitirSom();
		*/
		

	}

}