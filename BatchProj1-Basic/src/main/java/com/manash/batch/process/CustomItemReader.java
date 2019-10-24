package com.manash.batch.process;

import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class CustomItemReader implements ItemReader<String> {

	private List<String> bookName;
	private int count = 0;

	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("Item Reader read(-) method called");
		if (count < bookName.size()) {
			return bookName.get(count++);
		} else
			return null;
	}

	public List<String> getBookName() {
		return bookName;
	}

	public void setBookName(List<String> bookName) {
		this.bookName = bookName;
	}

}
