package com.capg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.capg.model.TDSMaster;

@Repository
@Component("dao")
@ComponentScan("com")
public class TDSDaoImpl implements TDSDao{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public TDSMaster getByID(int id) {
		
		TDSMaster tdsmaster = entityManager.find(TDSMaster.class, id);
		return tdsmaster;
		
	}

}
