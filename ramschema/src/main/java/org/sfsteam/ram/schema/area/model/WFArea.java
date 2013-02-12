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
@Table(name = "t_wfarea", catalog = "ramschema", uniqueConstraints = { @UniqueConstraint(columnNames = "wfarea_id") })
public class WFArea implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8143572812327948249L;
	private Long id;
	private String ssid;
	private String mac;
	private Set<Place> places;
	
	@Id
	@Column(name = "wfarea_id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "wfarea_ssid", nullable = false, length = 50)
	public String getSsid() {
		return ssid;
	}
	public void setSsid(String ssid) {
		this.ssid = ssid;
	}
	@Column(name = "wfarea_mac", nullable = false, length = 100)
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "place2wf")
	public Set<Place> getPlaces() {
		return places;
	}
	public void setPlaces(Set<Place> places) {
		this.places = places;
	}

}
