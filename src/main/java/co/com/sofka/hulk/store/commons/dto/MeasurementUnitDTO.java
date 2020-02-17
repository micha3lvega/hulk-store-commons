package co.com.sofka.hulk.store.commons.dto;

import java.io.Serializable;

public class MeasurementUnitDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MeasurementUnitDTO [id=" + id + ", name=" + name + "]";
	}

}
