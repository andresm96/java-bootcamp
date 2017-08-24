package com.Model;

import com.Model.StatePool.Status;

public class PauseState extends AbstractState {

	@Override
	public void play() {
		System.out.println("Playing. . .");
		System.out.println(String.format("Song " + player.getCurrent() + " is playing - " + player.getSong()));
		player.setState(pool.getState(Status.PLAYING));

	}

	@Override
	public void pause() {
		System.out.println("Song is already paused.");

	}

	@Override
	public void stop() {
		System.out.println("Songs are stopped.");
		player.setCurrent(0);
		player.setState(pool.getState(Status.STOPPED));

	}

}
