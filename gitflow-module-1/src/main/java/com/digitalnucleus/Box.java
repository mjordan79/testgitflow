package com.digitalnucleus;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
	
	private List<Item<T>> items;

	public Box() {
		this.items = new ArrayList<>();;
	}

	public List<Item<T>> getItems() {
		return items;
	}

	public void setItems(List<Item<T>> items) {
		this.items = items;
	}
	
	public void addItem(Item<T> item) {
		this.items.add(item);
	}
	
	public Item<T> getItem(Integer position) {
		return this.items.get(position);
	}
	
}
