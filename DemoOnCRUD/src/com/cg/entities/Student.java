//Entity Class
package com.cg.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
//INFORMING TO THE PROGRAM ABOUT THE DATABASE TABLE
@Entity
@Table(name="student")
public class Student implements Serializable {
private static final long serialVersionUID = 1L;
@Id
private int StudentId;
private String name;
public int getStudentId() {
return StudentId;
}
public void setStudentId(int id) {
this.StudentId = StudentId;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}

@Override
public String toString()
{
	return "Student [StudentId=" + StudentId + ", name=" + name +"]";
	
}

}

