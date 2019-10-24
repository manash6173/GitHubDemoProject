package com.manash.batch.process;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class CustomItemWriter implements ItemWriter<String> {

	@Override
	public void write(List<? extends String> items) throws Exception {
		System.out.println("CustomeItemWritter writer(-) method called");
		System.out.println(items);
		
	}
}
