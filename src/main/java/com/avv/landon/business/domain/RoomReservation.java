package com.avv.landon.business.domain;

import java.util.Date;

public class RoomReservation {
    private long roomId;
    private long guestId;
    private String roomName;
    private String roomNumber;
    private String firstName;
    private String lastName;
    private Date date;

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
	* Returns value of guestId
	* @return
	*/
	public long getGuestId() {
		return guestId;
	}

	/**
	* Sets new value of guestId
	* @param
	*/
	public void setGuestId(long guestId) {
		this.guestId = guestId;
	}

	/**
	* Returns value of roomName
	* @return
	*/
	public String getRoomName() {
		return roomName;
	}

	/**
	* Sets new value of roomName
	* @param
	*/
	public void setRoomName(String roomName) {
		this.roomName = roomName;
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
	* Returns value of firstName
	* @return
	*/
	public String getFirstName() {
		return firstName;
	}

	/**
	* Sets new value of firstName
	* @param
	*/
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	* Returns value of lastName
	* @return
	*/
	public String getLastName() {
		return lastName;
	}

	/**
	* Sets new value of lastName
	* @param
	*/
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	* Returns value of date
	* @return
	*/
	public Date getDate() {
		return date;
	}

	/**
	* Sets new value of date
	* @param
	*/
	public void setDate(Date date) {
		this.date = date;
	}

}