package com.capg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.model.TDSMaster;
import com.capg.service.TDSService;
import com.capg.uiexception.UserNotFoundException;

@RestController
@RequestMapping("/user")
public class TDSController {

	@Autowired
	TDSService tdsservice1;
	
	
	@GetMapping("/tds/{id}")
	public ResponseEntity getById(@PathVariable int id) {
		TDSMaster tdsmaster1=tdsservice1.getByID(id);
		if(tdsmaster1==null) {
			throw new UserNotFoundException("ID Not Found wrong ID :"+id);
		}
		else
			return new ResponseEntity(tdsmaster1,HttpStatus.OK);
	}
}
