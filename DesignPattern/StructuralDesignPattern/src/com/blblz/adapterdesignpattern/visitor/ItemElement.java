package com.blblz.adapterdesignpattern.visitor;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);

}
