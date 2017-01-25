package org.csiro.igsn.entity.postgres;

// Generated 09/01/2017 4:40:37 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CvIdentifierType generated by hbm2java
 */
@Entity
@Table(name = "cv_identifier_type")
@NamedQueries({
	@NamedQuery(
			name="CvIdentifierType.listAll",
		    query="SELECT cit FROM CvIdentifierType cit"
	)
})
public class CvIdentifierType implements java.io.Serializable {

	private int cvIdentifierTypeId;
	private String identifierType;
	

	public CvIdentifierType() {
	}

	public CvIdentifierType(int cvIdentifierTypeId) {
		this.cvIdentifierTypeId = cvIdentifierTypeId;
	}

	public CvIdentifierType(int cvIdentifierTypeId, String identifierType) {
		this.cvIdentifierTypeId = cvIdentifierTypeId;
		this.identifierType = identifierType;
		
	}

	@Id
	@Column(name = "cv_identifier_type_id", unique = true, nullable = false)
	public int getCvIdentifierTypeId() {
		return this.cvIdentifierTypeId;
	}

	public void setCvIdentifierTypeId(int cvIdentifierTypeId) {
		this.cvIdentifierTypeId = cvIdentifierTypeId;
	}

	@Column(name = "identifier_type")
	public String getIdentifierType() {
		return this.identifierType;
	}

	public void setIdentifierType(String identifierType) {
		this.identifierType = identifierType;
	}

}