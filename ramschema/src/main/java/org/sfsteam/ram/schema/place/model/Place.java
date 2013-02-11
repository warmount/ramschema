package org.sfsteam.ram.schema.place.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.sfsteam.ram.schema.areatype.model.AreaType;
import org.sfsteam.ram.schema.cellarea.model.CellArea;
import org.sfsteam.ram.schema.gpsarea.model.GPSArea;
import org.sfsteam.ram.schema.wfarea.model.WFArea;

@Entity
@Table(name = "t_place", catalog = "ramschema", uniqueConstraints = { @UniqueConstraint(columnNames = "place_id") })
public class Place implements Serializable {

	private Long id;
	private String name;
	private String text;
	private Date uptDate;
	private Place place2place;
	private WFArea place2wf;
	private CellArea place2cell;
	private GPSArea place2gps;
	private AreaType areaType;

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

	@ManyToMany
	@JoinColumn(name = "place2place")
	public Place getPlace2place() {
		return place2place;
	}

	public void setPlace2place(Place place2place) {
		this.place2place = place2place;
	}

	@ManyToOne
	@JoinColumn(name = "place2wf")
	public WFArea getPlace2wf() {
		return place2wf;
	}

	public void setPlace2wf(WFArea place2wf) {
		this.place2wf = place2wf;
	}

}
