package com.fcamara.FIFO;


import java.util.LinkedList;
import java.util.Queue;

public class UserQueue {
	
	private Queue<User> fila = new LinkedList<>();
	
	
	public void removeUser(User user, Platform platform) {
		fila.remove(user);
	}
	
	public void addUser(User user, Platform platform) {
		fila.add(user);
		this.tryInGame(user, platform);
	}
	
	public void tryInGame(User user, Platform platform) {
		if (fila.size() > platform.minLimit && Platform.inGame.size() < platform.maxLimit){
			Platform.inGame.add(user);
			this.removeUser(user, platform);
		}
	}

}
