package org.sfsteam.ram.schema.area.bo.impl;

import org.sfsteam.ram.schema.area.bo.WFAreaBo;
import org.sfsteam.ram.schema.area.dao.WFAreaDao;
import org.sfsteam.ram.schema.area.model.WFArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("wfAreaBo")
public class WFAreaImpl implements WFAreaBo {

	@Autowired
	WFAreaDao wfAreaDao;

	public void save(WFArea wf) {
		wfAreaDao.save(wf);
	}

	public void update(WFArea wf) {
		wfAreaDao.update(wf);
	}

	public void delete(WFArea wf) {
		wfAreaDao.update(wf);
	}

}
