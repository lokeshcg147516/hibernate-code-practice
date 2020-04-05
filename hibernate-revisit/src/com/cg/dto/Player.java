package com.cg.dto;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "hbl_player")
public class Player {
	@Id
	@Column(name = "playerId")
	private int playerId;
	@Column
	private String firstName;
	@Column
	private String lastName;

	public List<String> getNickNames() {
		return nickNames;
	}

	public void setNickNames(List<String> nickNames) {
		this.nickNames = nickNames;
	}

	@Column
	private String country;

	@ElementCollection
	@CollectionTable(name = "Nicknames", joinColumns = @JoinColumn(name = "playerId"))
	@Column(name = "nickname")
	private List<String> nickNames;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", firstName=" + firstName + ", lastName=" + lastName + ", country="
				+ country + "]";
	}

	public Player(int playerId, String firstName, String lastName, String country, List<String> nickNames) {
		super();
		this.playerId = playerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.nickNames = nickNames;
	}

	public Player() {
		super();
	}

}
