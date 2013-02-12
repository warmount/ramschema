package org.sfsteam.ram.schema.place.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.sfsteam.ram.schema.area.model.CellArea;
import org.sfsteam.ram.schema.area.model.GPSArea;
import org.sfsteam.ram.schema.area.model.WFArea;
import org.sfsteam.ram.schema.areatype.model.AreaType;
import org.sfsteam.ram.schema.note.model.Note;

@Entity
@Table(name = "t_place", catalog = "ramschema", uniqueConstraints = { @UniqueConstraint(columnNames = "place_id") })
public class Place implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7355956720133594757L;
	private Long id;
	private String name;
	private String text;
	private Date uptDate;
	private WFArea place2wf;
	private CellArea place2cell;
	private GPSArea place2gps;
	private AreaType place2type;
	private Set<Note> notes;

	@Id
	@Column(name = "place_id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "place_name", nullable = false, length = 50)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "place_text", length = 200)
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "place_uptdate", nullable = false)
	public Date getUptDate() {
		return uptDate;
	}

	public void setUptDate(Date uptDate) {
		this.uptDate = uptDate;
	}

	@ManyToOne
	@JoinColumn(name = "place2wf")
	public WFArea getPlace2wf() {
		return place2wf;
	}

	public void setPlace2wf(WFArea place2wf) {
		this.place2wf = place2wf;
	}

	@ManyToOne
	@JoinColumn(name = "place2cell")
	public CellArea getPlace2cell() {
		return place2cell;
	}

	public void setPlace2cell(CellArea place2cell) {
		this.place2cell = place2cell;
	}

	@ManyToOne
	@JoinColumn(name = "place2gps")
	public GPSArea getPlace2gps() {
		return place2gps;
	}

	public void setPlace2gps(GPSArea place2gps) {
		this.place2gps = place2gps;
	}

	@ManyToOne
	@JoinColumn(name = "place2type")
	public AreaType getPlace2type() {
		return place2type;
	}

	public void setPlace2type(AreaType place2type) {
		this.place2type = place2type;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "note2place")
	public Set<Note> getNotes() {
		return notes;
	}

	public void setNotes(Set<Note> notes) {
		this.notes = notes;
	}

}
