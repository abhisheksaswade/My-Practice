package com.app.pojos;

import jakarta.persistence.*;

@MappedSuperclass
public class BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	

	public BaseEntity() {
		super();
	}



	public BaseEntity(Long id) {
		super();
		Id = id;
	}



	public Long getId() {
		return Id;
	}



	public void setId(Long id) {
		Id = id;
	}



	@Override
	public String toString() {
		return "BaseEntity [Id=" + Id + "]";
	}
	
	
	
}
