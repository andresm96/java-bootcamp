package com.Model;

import com.Model.StatePool.Status;

public class PlayState extends AbstractState {

	@Override
	public void play() {
		System.out.println("Playing. . .");
		System.out.println("Song is already playing");

	}

	@Override
	public void pause() {
		System.out.println(String.format("Song " + player.getCurrent() + " is paused - " + player.getSong()));
		player.setState(pool.getState(Status.PAUSED));

	}

	@Override
	public void stop() {
		System.out.println("Songs are stopped");
		player.setCurrent(0);
		player.setState(pool.getState(Status.STOPPED));

	}

}
