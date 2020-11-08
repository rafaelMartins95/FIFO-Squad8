package com.fcamara.FIFO;

import java.util.ArrayList;
import java.util.List;

public class Platform {
	private String name;
	protected Integer minLimit;
	protected Integer maxLimit;
	protected UserQueue platfila;
	protected static List<User> inGame = new ArrayList<>();
	
	public Platform(String name, Integer minLimit, Integer maxLimit) {
		super();
		this.name = name;
		this.minLimit = minLimit;
		this.maxLimit = maxLimit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMinLimit() {
		return minLimit;
	}

	public void setMinLimit(Integer minLimit) {
		this.minLimit = minLimit;
	}

	public Integer getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(Integer maxLimit) {
		this.maxLimit = maxLimit;
	}
}
