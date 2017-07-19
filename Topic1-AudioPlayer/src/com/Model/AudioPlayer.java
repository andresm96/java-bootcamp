package com.Model;

import java.util.ArrayList;
import java.util.List;

public class AudioPlayer {

	private Integer currentSong;
	private List<Song> songs;
	private AbstractState currentState;

	public AbstractState getState() {
		return currentState;
	}

	public void setState(AbstractState state) {
		currentState = state;
	}

	private void add(Song song) {
		songs.add(song);
	}

	public void add(PlayList playList) {
		songs = playList.getSongs();
	}

	public void remove(Song song) {
		songs.remove(song);
	}

	public void clear() {
		songs.clear();
	}

	public Song getSong() {
		return songs.get(currentSong);
	}

	public Integer getCurrent() {
		return currentSong;
	}

	public void setCurrent(Integer position) {
		currentSong = position;
	}

	protected void increaseCurrent() {
		currentSong++;
		if (currentSong >= songs.size())
			currentSong -= songs.size();
	}

	protected void decreaseCurrent() {
		currentSong--;
		if (currentSong < 0)
			currentSong += songs.size();
	}

	public AudioPlayer() {
		songs = new ArrayList<Song>();
		this.currentSong = 0;
		this.currentState = new StopState();
		currentState.setPlayer(this);
	}

	public void pressPlay() {
		currentState.play();
	}

	public void pressPause() {
		currentState.pause();
	}

	public void pressFWD() {
		currentState.forward();
	}

	public void pressREW() {
		currentState.rewind();
	}

	public void pressStop() {
		currentState.stop();
	}
}
