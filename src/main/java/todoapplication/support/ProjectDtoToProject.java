package todoapplication.support;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import todoapplication.model.Project;
import todoapplication.model.User;
import todoapplication.service.TaskService;
import todoapplication.service.UsersService;
import todoapplication.web.dto.ProjectDTO;

@Component
public class ProjectDtoToProject implements Converter<ProjectDTO, Project> {
	
	@Autowired
	private UsersService userService;
	
	@Autowired
	private TaskService taskService;

	@Override
	public Project convert(ProjectDTO source) {
		Project project = new Project();
		
		project.setId(source.getId());
		project.setName(source.getName());
		project.setProjectOwner(userService.findbyUsername(source.getProjectOwnerUsername()).get());
		project.setTasks(taskService.findAllByProjectId(source.getId()));
		
		return project;
	}

}
