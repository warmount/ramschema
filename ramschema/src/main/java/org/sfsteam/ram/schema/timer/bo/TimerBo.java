package org.sfsteam.ram.schema.timer.bo;

import org.sfsteam.ram.schema.timer.model.Timer;

public interface TimerBo {
	void save(Timer timer);
	void update(Timer timer);
	void delete(Timer timer);


}
