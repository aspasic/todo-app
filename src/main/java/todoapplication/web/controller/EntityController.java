package todoapplication.web.controller;
//package com.ftninformatika.jwd.modul3.test.web.controller;
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@RequestMapping(value = "/api/entity")
//@Validated
//public class EntityController {
//	
//	@Autowired
//	private EntityService service;
//	
//	@Autowired
//	private EntityToEntityDto toDto;
//	
//	@Autowired
//	private EntityDtoToEntity toEntity;
//	
//	@PreAuthorize("hasAnyRole('ROLE_KORISNIK', 'ROLE_ADMIN')")
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
//	@PreAuthorize("hasRole('ROLE_KORISNIK')")
//	@GetMapping
//	public ResponseEntity<List<EntityDTO>> getAll(
//					@RequestParam(required = false) Long countryId,
//					@RequestParam(required = false) Integer minMedals,
//					@RequestParam(required = false) Integer maxMedals,
//					@RequestParam(value = "pageNo", defaultValue ="0") Integer pageNo) {
//	
//	Page<Entity> page = service.find(countryId, minMedals, maxMedals, pageNo);
//	
//	HttpHeaders headers = new HttpHeaders();
//	headers.add("Total-Pages", Integer.toString(page.getTotalPages()));
//	
//	return new ResponseEntity<List<>>(toDto.convert(page.getContent()), headers, HttpStatus.OK);
//	}
//	
//	@GetMapping("/{id}")
//    public ResponseEntity<EntityDTO> getOne(@PathVariable Long id){
//        Entity e = service.findOneById(id);
//
//        if(e != null) {
//            return new ResponseEntity<>(toDto.convert(e), HttpStatus.OK);
//        }else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//	
//	@DeleteMapping("/{id}")
//    public ResponseEntity<Void> delete(@PathVariable Long id){
//		Entity e = service.delete(id);
//
//        if(e != null) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//	
//	@PutMapping(value = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<EntityDTO> update(@PathVariable Long id, @Valid @RequestBody EntityDTO dto){
//
//        if(!id.equals(dto.getId())) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//        Entity e = toEntity.convert(dto);
//        Entity saved = service.update(e);
//
//        return new ResponseEntity<>(toDto.convert(saved),HttpStatus.OK);
//    }
//	
//	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<EntityDTO> create(@Valid @RequestBody EntityDTO dto) {
//		Entity e = toEntity.convert(dto);
//		Entity saved = service.save(e);
//		
//		return new ResponseEntity<>(toDto.convert(saved), HttpStatus.CREATED);
//	}
//	
//}
