package com.example.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the project_info database table.
 * 
 */
@Embeddable
public class ProjectInfoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="seq")
	private Long seq;

	@Column(name="editno")
	private Long editno;

	public ProjectInfoPK() {
	}
	public Long getSeq() {
		return this.seq;
	}
	public void setSeq(Long seq) {
		this.seq = seq;
	}
	public Long getEditno() {
		return this.editno;
	}
	public void setEditno(Long editno) {
		this.editno = editno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProjectInfoPK)) {
			return false;
		}
		ProjectInfoPK castOther = (ProjectInfoPK)other;
		return 
			this.seq.equals(castOther.seq)
			&& this.editno.equals(castOther.editno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.seq.hashCode();
		hash = hash * prime + this.editno.hashCode();
		
		return hash;
	}
}