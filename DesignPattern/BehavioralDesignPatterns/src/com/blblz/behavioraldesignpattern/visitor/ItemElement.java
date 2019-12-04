package com.blblz.behavioraldesignpattern.visitor;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);

}
