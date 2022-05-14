package todoapplication.web.dto;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

public class ProjectDTO {

	Long id;
	
	@NotBlank
	@NotNull
	String name;
	
	Long projectOwnerId;
	String projectOwnerUsername;

	public ProjectDTO() {
		super();
	}

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

	public String getProjectOwnerUsername() {
		return projectOwnerUsername;
	}

	public void setProjectOwnerUsername(String projectOwnerUsername) {
		this.projectOwnerUsername = projectOwnerUsername;
	}

	public Long getProjectOwnerId() {
		return projectOwnerId;
	}

	public void setProjectOwnerId(Long projectOwnerId) {
		this.projectOwnerId = projectOwnerId;
	}
	
}
