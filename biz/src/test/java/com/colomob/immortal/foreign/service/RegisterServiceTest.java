/**
 * Project: analysis.biz
 * 
 * File Created at May 9, 2013
 * $Id$Corporation
 * 
 * Copyright 2013-2015 Colomob.com Corporation Limited.
 * All rights reserved.
 */
package com.colomob.immortal.foreign.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.colomob.immortal.foreign.model.RegisterEntity;
import com.colomob.immortal.foreign.service.RegisterService;

/**
 * @author baowp
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring/spring-context.xml")
public class RegisterServiceTest extends
		AbstractTransactionalJUnit4SpringContextTests {
	@Autowired
	private RegisterService registerService;

	@Test
	public void testInsert() {
		RegisterEntity register = getRegister();
		int flag = registerService.insert(register);
		Assert.assertEquals(flag, 1);
		Assert.assertTrue(register.getId() > 0);
	}

	private RegisterEntity getRegister() {
		RegisterEntity register = new RegisterEntity();
		register.setUserid("userid");
		register.setUsername("username");
		register.setUdid("udid");
		register.setGuestId("guestId");
		register.setChannelAccountId("channelAccountId");
		register.setRegChannel("regChannel");
		register.setEmail("a@a.a");
		register.setMobile("18612345678");
		register.setRegClientType("regClientType");
		register.setRegisterType(1);
		register.setAccountType(2);
		register.setStatus(0);
		return register;
	}
}
