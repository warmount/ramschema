package org.sfsteam.ram.schema.note.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.sfsteam.ram.schema.place.model.Place;
import org.sfsteam.ram.schema.timer.model.Timer;

@Entity
@Table(name = "t_note", catalog = "ramschema", uniqueConstraints = { @UniqueConstraint(columnNames = "note_id") })
public class Note implements java.io.Serializable {

	private Long id;
	private String name;
	private String text;
	private Date uptDate;
	private Timer note2timer;
	private Place note2place;

	@Id
	@Column(name = "note_id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "note_name", nullable = false, length = 50)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "note_text", length = 200)
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "note_uptdate", nullable = false)
	public Date getUptDate() {
		return uptDate;
	}

	public void setUptDate(Date uptDate) {
		this.uptDate = uptDate;
	}

	@ManyToOne
	@JoinColumn(name = "note2timer")
	public Timer getNote2timer() {
		return note2timer;
	}

	public void setNote2timer(Timer note2timer) {
		this.note2timer = note2timer;
	}

	@ManyToOne
	@JoinColumn(name = "note2place")
	public Place getNote2place() {
		return note2place;
	}

	public void setNote2place(Place note2place) {
		this.note2place = note2place;
	}

}
