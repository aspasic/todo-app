package todoapplication.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import todoapplication.model.Project;
import todoapplication.web.dto.ProjectDTO;

@Component
public class ProjectToProjectDto implements Converter<Project, ProjectDTO> {
	
	@Override
	public ProjectDTO convert(Project source) {
		ProjectDTO projectDTO = new ProjectDTO();
		
		projectDTO.setId(source.getId());
		projectDTO.setName(source.getName());
		projectDTO.setProjectOwnerUsername(source.getProjectOwner().getUsername());
		projectDTO.setProjectOwnerId(source.getProjectOwner().getId());
		
		return projectDTO;
	}
	
	public List<ProjectDTO> convert(List<Project> projects) {
		List<ProjectDTO> projectDTOs = new ArrayList<>();
		
		for(Project p : projects) {
			ProjectDTO dto = convert(p);
			projectDTOs.add(dto);
		}
		
		return projectDTOs;
	}

}
