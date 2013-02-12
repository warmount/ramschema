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
@Table(name = "t_gpsarea", catalog = "ramschema", uniqueConstraints = { @UniqueConstraint(columnNames = "gpsarea_id") })
public class GPSArea implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7802047556124848281L;
	private Long id;
	private String longitude;
	private String latitude;
	private String altitude;
	private Set<Place> places;
	
	@Id
	@Column(name = "gpsarea_id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "gpsarea_longitude", nullable = false, length = 50)
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	@Column(name = "gpsarea_latitude", nullable = false, length = 50)
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	@Column(name = "gpsarea_altitude", length = 50)
	public String getAltitude() {
		return altitude;
	}
	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "place2gps")
	public Set<Place> getPlaces() {
		return places;
	}
	public void setPlaces(Set<Place> places) {
		this.places = places;
	}

}
