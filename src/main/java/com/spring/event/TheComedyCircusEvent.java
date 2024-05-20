package com.spring.event;

public class TheComedyCircusEvent {

	private String EpisodeNumber;

	public String getEpisodeNumber() {
		return EpisodeNumber;
	}

	public void setEpisodeNumber(String episodeNumber) {
		EpisodeNumber = episodeNumber;
	}

	public TheComedyCircusEvent(String episodeNumber) {
		super();
		EpisodeNumber = episodeNumber;
	}
	
}
