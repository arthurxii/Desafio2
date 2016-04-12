package br.unipe.mlpiii.pwc.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import unipe.br.mlpiii.pwc.modelo.Item;

public class Principal {

	public static void main(String[] args) {
		Item i1	=	new	Item();
		i1.setCodigo(1);
		i1.setDescricao("Espada");
		
		Item i2	=	new	Item();
		i2.setCodigo(2);
		i2.setDescricao("Escudo");
		
		Item i3	=	new	Item();
		i3.setCodigo(3);
		i3.setDescricao("Mace");
		
		List<Item> itens = new ArrayList<Item>();
		itens.add(i1);
		itens.add(i2);
		itens.add(i3);
		
		Collections.sort(itens);
		System.out.println(itens);
		Collections.reverse(itens);
		System.out.println(itens);
		
		
		
	}
}
