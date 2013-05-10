/**
 * Project: analysis.biz
 * 
 * File Created at May 9, 2013
 * $Id$Corporation
 * 
 * Copyright 2013-2015 Colomob.com Corporation Limited.
 * All rights reserved.
 */
package com.colomob.immortal.foreign.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colomob.immortal.foreign.model.RegisterEntity;
import com.colomob.immortal.foreign.persistence.RegisterMapper;
import com.colomob.immortal.foreign.service.RegisterService;

/**
 * @author baowp
 * 
 */
@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterMapper registerMapper;

	public int insert(RegisterEntity register) {
		return registerMapper.insert(register);
	}

}
