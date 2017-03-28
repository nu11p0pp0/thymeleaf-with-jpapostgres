package com.example.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the project_info database table.
 * 
 */
@Entity
@Table(name="project_info")
@NamedQuery(name="ProjectInfo.findAll", query="SELECT p FROM ProjectInfo p")
public class ProjectInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	@Column(name="id")
	private ProjectInfoPK id;

	@Column(name="name")
	private String name;

	public ProjectInfo() {
	}

	public ProjectInfoPK getId() {
		return this.id;
	}

	public void setId(ProjectInfoPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}