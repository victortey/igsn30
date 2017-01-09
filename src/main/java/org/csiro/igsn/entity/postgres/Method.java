package org.csiro.igsn.entity.postgres;

// Generated 09/01/2017 4:40:37 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Method generated by hbm2java
 */
@Entity
@Table(name = "method")
public class Method implements java.io.Serializable {

	private int methodId;
	private String method;
	private String methodUri;
	private Set<Resources> resourceses = new HashSet<Resources>(0);

	public Method() {
	}

	public Method(int methodId) {
		this.methodId = methodId;
	}

	public Method(int methodId, String method, String methodUri,
			Set<Resources> resourceses) {
		this.methodId = methodId;
		this.method = method;
		this.methodUri = methodUri;
		this.resourceses = resourceses;
	}

	@Id
	@Column(name = "method_id", unique = true, nullable = false)
	public int getMethodId() {
		return this.methodId;
	}

	public void setMethodId(int methodId) {
		this.methodId = methodId;
	}

	@Column(name = "method")
	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	@Column(name = "method_uri")
	public String getMethodUri() {
		return this.methodUri;
	}

	public void setMethodUri(String methodUri) {
		this.methodUri = methodUri;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "method")
	public Set<Resources> getResourceses() {
		return this.resourceses;
	}

	public void setResourceses(Set<Resources> resourceses) {
		this.resourceses = resourceses;
	}

}
