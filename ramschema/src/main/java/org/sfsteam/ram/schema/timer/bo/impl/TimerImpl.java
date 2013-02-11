package org.sfsteam.ram.schema.timer.bo.impl;

import org.sfsteam.ram.schema.timer.bo.TimerBo;
import org.sfsteam.ram.schema.timer.dao.TimerDao;
import org.sfsteam.ram.schema.timer.model.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("timerBo")
public class TimerImpl implements TimerBo {

	@Autowired
	TimerDao timerDao;

	public void save(Timer timer) {
		timerDao.save(timer);
	}

	public void update(Timer timer) {
		timerDao.update(timer);
	}

	public void delete(Timer timer) {
		timerDao.delete(timer);
	}

}
