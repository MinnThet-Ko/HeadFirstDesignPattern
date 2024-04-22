package com.chapter2.interfaces;

public interface Subject {
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void noitfyObservers();
}
