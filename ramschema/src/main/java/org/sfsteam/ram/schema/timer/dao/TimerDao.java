package org.sfsteam.ram.schema.timer.dao;

import org.sfsteam.ram.schema.timer.model.Timer;

public interface TimerDao {
	void save(Timer timer);
	void update(Timer timer);
	void delete(Timer timer);

}
