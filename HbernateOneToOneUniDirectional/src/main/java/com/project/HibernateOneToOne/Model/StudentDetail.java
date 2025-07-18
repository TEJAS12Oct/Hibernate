package com.project.HibernateOneToOne.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_detail")
public class StudentDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "college")
	private String college;

	@Column(name = "no_of_problems_solved")
	private int noOfProblemsSolved;

	public StudentDetail() {
	}

	public StudentDetail(String college, int noOfProblemsSolved) {
		this.college = college;
		this.noOfProblemsSolved = noOfProblemsSolved;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getNoOfProblemsSolved() {
		return noOfProblemsSolved;
	}

	public void setNoOfProblemsSolved(int noOfProblemsSolved) {
		this.noOfProblemsSolved = noOfProblemsSolved;
	}

	@Override
	public String toString() {
		return "StudentDetail{" + "id=" + id + ", college='" + college + '\'' + ", noOfProblemsSolved="
				+ noOfProblemsSolved + '}';
	}
}