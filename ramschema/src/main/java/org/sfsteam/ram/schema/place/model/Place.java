package org.sfsteam.ram.schema.place.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.sfsteam.ram.schema.area.model.Area;

@Entity
@Table(name="t_place",catalog = "ramschema", uniqueConstraints = {
		@UniqueConstraint(columnNames = "place_id") })
public class Place implements Serializable {
	
	private Long id;
	private String name;
	private String text;
	private Date uptDate;
	private Place place2place;
	private Area place2area;

}
