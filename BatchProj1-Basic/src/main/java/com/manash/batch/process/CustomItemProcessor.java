package com.manash.batch.process;

import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<String, String> {

	@Override
	public String process(String bookName) throws Exception {
		System.out.println("CustomItemProcessor process(-) method called.");
		String bookWithAuthor="Book Name-"+bookName+" Author Name:-";
		if("Core Java".equalsIgnoreCase(bookName)) {
			bookWithAuthor+=" HariKrishna Sir";
		}
		else if("Spring".equalsIgnoreCase(bookName)) {
			bookWithAuthor+=" Nataraz Sir";
		}
		else if("Rest".equalsIgnoreCase(bookName)) {
			bookWithAuthor+=" Ashok Sir";
		}
		else if("Python".equalsIgnoreCase(bookName)) {
			bookWithAuthor+=" Samba Sir";
		}
		else
			bookWithAuthor+=" Murli Sir";
		
		return bookWithAuthor;
	}

}
