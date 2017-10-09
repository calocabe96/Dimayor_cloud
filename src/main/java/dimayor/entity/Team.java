package dimayor.entity;
// Generated 8/10/2017 05:46:11 PM by Hibernate Tools 5.2.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Team generated by hbm2java
 */
@Entity
//@Table(name = "team", schema = "public")
public class Team implements java.io.Serializable {

	private String id;
	private String name;
	private Date date;
	private String title;

	public Team() {
	}

	public Team(String id) {
		this.id = id;
	}

	public Team(String id, String name, Date date, String title) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.title = title;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", length = 13)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "title")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}