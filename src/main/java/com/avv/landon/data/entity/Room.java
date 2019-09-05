package com.avv.landon.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROOM")
public class Room {
    @Id
    @Column(name="ROOM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roomId;
    @Column(name="NAME")
    private String name;
    @Column(name="ROOM_NUMBER")
    private String roomNumber;
    @Column(name="BED_INFO")
    private String bedInfo;

    /**
	* Returns value of roomId
	* @return
	*/
	public long getRoomId() {
		return roomId;
	}

	/**
	* Sets new value of roomId
	* @param
	*/
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	/**
	* Returns value of name
	* @return
	*/
	public String getName() {
		return name;
	}

	/**
	* Sets new value of name
	* @param
	*/
	public void setName(String name) {
		this.name = name;
	}

	/**
	* Returns value of roomNumber
	* @return
	*/
	public String getRoomNumber() {
		return roomNumber;
	}

	/**
	* Sets new value of roomNumber
	* @param
	*/
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	/**
	* Returns value of bedInfo
	* @return
	*/
	public String getBedInfo() {
		return bedInfo;
	}

	/**
	* Sets new value of bedInfo
	* @param
	*/
	public void setBedInfo(String bedInfo) {
		this.bedInfo = bedInfo;
	}
}