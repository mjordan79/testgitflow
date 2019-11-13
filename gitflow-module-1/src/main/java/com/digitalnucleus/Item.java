package com.digitalnucleus;

public class Item<T> {

	private T value;

	public Item(T item) {
		this.value = item;
	}

	public T getItem() {
		return value;
	}

	public void setItem(T item) {
		this.value = item;
	}
	
}
