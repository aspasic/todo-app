package todoapplication.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Label {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@ManyToOne
	private Users user;
	
	@ManyToMany(mappedBy = "taskLabels")
	private List<Task> labelTasks;
	
	@ManyToMany(mappedBy = "subtaskLabels")
	private List<Subtask> labelSubtasks;

	public Label() {
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

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public List<Task> getLabelTasks() {
		return labelTasks;
	}

	public void setLabelTasks(List<Task> labelTasks) {
		this.labelTasks = labelTasks;
	}

	public List<Subtask> getLabelSubtasks() {
		return labelSubtasks;
	}

	public void setLabelSubtasks(List<Subtask> labelSubtasks) {
		this.labelSubtasks = labelSubtasks;
	}

	@Override
	public String toString() {
		return "Label [id=" + id + ", name=" + name + ", user=" + user + ", labelTasks=" + labelTasks
				+ ", labelSubtasks=" + labelSubtasks + "]";
	}

	
	
	
}
