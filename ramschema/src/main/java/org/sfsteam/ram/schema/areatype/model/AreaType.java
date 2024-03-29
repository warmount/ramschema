package org.sfsteam.ram.schema.areatype.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.sfsteam.ram.schema.place.model.Place;

@Entity
@Table(name = "t_areatype", catalog = "ramschema", uniqueConstraints = { @UniqueConstraint(columnNames = "areatype_id") })
public class AreaType implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7531504984944288615L;
	private Long id;
	private String name;
	private Set<Place> places;
	
	@Id
	@Column(name = "areatype_id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "areatype_name", nullable = false, length = 50)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "place2type")
	public Set<Place> getPlaces() {
		return places;
	}
	public void setPlaces(Set<Place> places) {
		this.places = places;
	}

}
