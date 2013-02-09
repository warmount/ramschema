package org.sfsteam.ram.schema.timer.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="t_timer",catalog = "ramschema", uniqueConstraints = {
		@UniqueConstraint(columnNames = "timer_id") })
public class Timer implements Serializable {

}
