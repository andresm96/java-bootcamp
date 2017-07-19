package com.Model;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	private String name;
	private List<Song> tracks;

	public PlayList(String name) {
		this.name = name;
		tracks = new ArrayList<Song>();
	}
	
	public void add(Song song){
		tracks.add(song);
	}
	
	public List<Song> getSongs(){
		return tracks;
	}

}
