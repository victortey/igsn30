package org.csiro.igsn.entity.postgres;

// Generated 09/01/2017 4:40:37 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ResourceTypes generated by hbm2java
 */
@Entity
@Table(name = "resource_types")
public class ResourceTypes implements java.io.Serializable {

	private int resourceTypeId;
	private CvResourceType cvResourceType;
	private Resources resources;

	public ResourceTypes() {
	}

	public ResourceTypes(int resourceTypeId) {
		this.resourceTypeId = resourceTypeId;
	}

	public ResourceTypes(int resourceTypeId, CvResourceType cvResourceType,
			Resources resources) {
		this.resourceTypeId = resourceTypeId;
		this.cvResourceType = cvResourceType;
		this.resources = resources;
	}

	@Id
	@Column(name = "resource_type_id", unique = true, nullable = false)
	public int getResourceTypeId() {
		return this.resourceTypeId;
	}

	public void setResourceTypeId(int resourceTypeId) {
		this.resourceTypeId = resourceTypeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "resource_type")
	public CvResourceType getCvResourceType() {
		return this.cvResourceType;
	}

	public void setCvResourceType(CvResourceType cvResourceType) {
		this.cvResourceType = cvResourceType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "resource_identifier")
	public Resources getResources() {
		return this.resources;
	}

	public void setResources(Resources resources) {
		this.resources = resources;
	}

}
