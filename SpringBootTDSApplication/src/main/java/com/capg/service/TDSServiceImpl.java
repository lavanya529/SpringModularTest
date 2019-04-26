package com.capg.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.capg.dao.TDSDao;
import com.capg.model.TDSMaster;

@Component("tds")
@Service
@Transactional
public class TDSServiceImpl implements TDSService{

	@Autowired
	TDSDao tdsdao;
	
	
	@Override
	public TDSMaster getByID(int id) {
		
		return tdsdao.getByID(id);
		
	}

}
