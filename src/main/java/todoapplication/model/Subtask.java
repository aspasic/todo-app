package todoapplication.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Subtask {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@ManyToOne
	private Project project;
	
	@Column
	private String description;
	
	@Column
	private LocalDate dueDate;
	
	@Column
	private LocalTime dueTime;
	
	@Column
	private Boolean completed;
	
	@ManyToMany
	@JoinTable(
			  name = "subtask_label", 
			  joinColumns = @JoinColumn(name = "subtask_id"), 
			  inverseJoinColumns = @JoinColumn(name = "label_id"))
	private List<Label> subtaskLabels;
	
	@ManyToOne
	private Task task;

	public Subtask() {
		super();
		// TODO Auto-generated constructor stub
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

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalTime getDueTime() {
		return dueTime;
	}

	public void setDueTime(LocalTime dueTime) {
		this.dueTime = dueTime;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public List<Label> getLabels() {
		return subtaskLabels;
	}

	public void setLabels(List<Label> labels) {
		this.subtaskLabels = labels;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((completed == null) ? 0 : completed.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
		result = prime * result + ((dueTime == null) ? 0 : dueTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((subtaskLabels == null) ? 0 : subtaskLabels.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((project == null) ? 0 : project.hashCode());
		result = prime * result + ((task == null) ? 0 : task.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subtask other = (Subtask) obj;
		if (completed == null) {
			if (other.completed != null)
				return false;
		} else if (!completed.equals(other.completed))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		if (dueTime == null) {
			if (other.dueTime != null)
				return false;
		} else if (!dueTime.equals(other.dueTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (subtaskLabels == null) {
			if (other.subtaskLabels != null)
				return false;
		} else if (!subtaskLabels.equals(other.subtaskLabels))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (project == null) {
			if (other.project != null)
				return false;
		} else if (!project.equals(other.project))
			return false;
		if (task == null) {
			if (other.task != null)
				return false;
		} else if (!task.equals(other.task))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Subtask [id=" + id + ", name=" + name + ", project=" + project + ", description=" + description
				+ ", dueDate=" + dueDate + ", dueTime=" + dueTime + ", completed=" + completed + ", labels=" + subtaskLabels
				+ ", task=" + task + "]";
	}
	
	
}
