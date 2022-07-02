package com.stringmanipulation;

final class OwnImmutableClass {

	private final String name;
	private final String address;
	
	public OwnImmutableClass(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	
	
}
