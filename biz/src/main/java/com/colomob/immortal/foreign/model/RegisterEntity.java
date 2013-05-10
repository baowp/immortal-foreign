/**
 * Project: analysis.biz
 * 
 * File Created at May 9, 2013
 * $Id$Corporation
 * 
 * Copyright 2013-2015 Colomob.com Corporation Limited.
 * All rights reserved.
 */
package com.colomob.immortal.foreign.model;

import java.util.Date;

/**
 * @author baowp
 * 
 */
public class RegisterEntity {

	private Date cstCreate;
	private Date cstModified;
	private Long id;
	private String userid;
	private String username;
	private String udid;
	private String guestId;
	private String channelAccountId;
	private String regChannel;
	private String email;
	private String mobile;
	private String regClientType;
	private int registerType;
	private int accountType;
	private int status;

	public Date getCstCreate() {
		return cstCreate;
	}

	public void setCstCreate(Date cstCreate) {
		this.cstCreate = cstCreate;
	}

	public Date getCstModified() {
		return cstModified;
	}

	public void setCstModified(Date cstModified) {
		this.cstModified = cstModified;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUdid() {
		return udid;
	}

	public void setUdid(String udid) {
		this.udid = udid;
	}

	public String getGuestId() {
		return guestId;
	}

	public void setGuestId(String guestId) {
		this.guestId = guestId;
	}

	public String getChannelAccountId() {
		return channelAccountId;
	}

	public void setChannelAccountId(String channelAccountId) {
		this.channelAccountId = channelAccountId;
	}

	public String getRegChannel() {
		return regChannel;
	}

	public void setRegChannel(String regChannel) {
		this.regChannel = regChannel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRegClientType() {
		return regClientType;
	}

	public void setRegClientType(String regClientType) {
		this.regClientType = regClientType;
	}

	public int getRegisterType() {
		return registerType;
	}

	public void setRegisterType(int registerType) {
		this.registerType = registerType;
	}

	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
