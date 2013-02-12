package org.sfsteam.ram.schema.area.model;

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
@Table(name = "t_cellarea", catalog = "ramschema", uniqueConstraints = { @UniqueConstraint(columnNames = "cellarea_id") })
public class CellArea implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6979770285908557249L;
	private Long id;
	private String cellid;
	private Set<Place> places;
	
	@Id
	@Column(name = "cellarea_id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "cellarea_cellid", nullable = false, length = 50)
	public String getCellid() {
		return cellid;
	}
	public void setCellid(String cellid) {
		this.cellid = cellid;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "place2cell")
	public Set<Place> getPlaces() {
		return places;
	}
	public void setPlaces(Set<Place> places) {
		this.places = places;
	}

}
