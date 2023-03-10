package org.example.helpers;

public class Person {

    private long id;
    private String address;
    private String name;
    private String lastName;
    
    public Person(){}
    
    public Person(long id, String name, String lastName, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return id;
    }
    
    public String getAddress() {
        return address;
    }

	public void setId(long id) {
		this.id = id;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", address=" + address + ", name=" + name + ", lastName=" + lastName + "]";
	}
    
	
}
