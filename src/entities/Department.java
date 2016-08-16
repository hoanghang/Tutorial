package entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "DEPARTMENT", 
	uniqueConstraints = {@UniqueConstraint(columnNames={"DEPT_NO"})})
public class Department {
	private Integer deptId;
	private String deptNo;
	private String deptName;
}
