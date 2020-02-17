package co.com.sofka.hulk.store.commons.dto;

import java.io.Serializable;
import java.util.Date;

public class ProductDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private MeasurementUnitDTO measurementUnit;

	private ProviderDTO provider;

	private String unitPrice;

	private Date createdAt;

	private Date updatedAt;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MeasurementUnitDTO getMeasurementUnit() {
		return measurementUnit;
	}

	public void setMeasurementUnit(MeasurementUnitDTO measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

	public ProviderDTO getProvider() {
		return provider;
	}

	public void setProvider(ProviderDTO provider) {
		this.provider = provider;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", measurementUnit=" + measurementUnit + ", provider="
				+ provider + ", unitPrice=" + unitPrice + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

}
