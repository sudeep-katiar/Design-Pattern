package com.blblz.behavioraldesignpattern.mediatortest;

import com.blblz.behavioraldesignpattern.mediator.ChatMediator;
import com.blblz.behavioraldesignpattern.mediator.ChatMediatorImpl;
import com.blblz.behavioraldesignpattern.mediator.User;
import com.blblz.behavioraldesignpattern.mediator.UserImpl;

public class ChatClient {
	public static void main(String[] args) {

		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Pankaj");
		User user2 = new UserImpl(mediator, "Lisa");
		User user3 = new UserImpl(mediator, "Saurabh");
		User user4 = new UserImpl(mediator, "David");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);

		user1.send("Hi All");
	}

}
