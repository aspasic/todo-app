package todoapplication.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import todoapplication.model.Project;
import todoapplication.service.ProjectService;
import todoapplication.support.ProjectDtoToProject;
import todoapplication.support.ProjectToProjectDto;
import todoapplication.web.dto.ProjectDTO;


@RestController
@RequestMapping(value = "/api/projects")
@Validated
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private ProjectToProjectDto toProjectDto;
	
	@Autowired
	private ProjectDtoToProject toProject;
	
//	@PreAuthorize("hasAnyRole('ROLE_KORISNIK', 'ROLE_ADMIN')")
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
//	@PreAuthorize("hasRole('ROLE_KORISNIK')")
	@GetMapping
	public ResponseEntity<List<ProjectDTO>> getAll(
					@RequestParam(required = true) Long id) {
	
	System.out.println(" KLASA IDJA JE " + id.getClass());	
	
	List<Project> projects = projectService.findByProjectOwner(id);
	
	System.out.println("SIZE " + projects.size());	
	
	return new ResponseEntity<>(toProjectDto.convert(projects), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<ProjectDTO> getOne(@PathVariable Long id){
        Project p = projectService.findOneById(id);

        if(p != null) {
            return new ResponseEntity<>(toProjectDto.convert(p), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
	@DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
		Project p = projectService.delete(id);

        if(p != null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
	@PutMapping(value = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProjectDTO> update(@PathVariable Long id, @Valid @RequestBody ProjectDTO dto){

        if(!id.equals(dto.getId())) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Project p = toProject.convert(dto);
        Project saved = projectService.update(p);

        return new ResponseEntity<>(toProjectDto.convert(saved),HttpStatus.OK);
    }
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProjectDTO> create(@Valid @RequestBody ProjectDTO dto) {
		Project p = toProject.convert(dto);
		Project saved = projectService.save(p);
		
		return new ResponseEntity<>(toProjectDto.convert(saved), HttpStatus.CREATED);
	}
	
}
