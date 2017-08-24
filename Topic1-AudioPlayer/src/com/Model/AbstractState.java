package com.Model;

import com.Model.StatePool.Status;

public abstract class AbstractState {

	public static AudioPlayer player;
	public static StatePool pool = StatePool.getInstance();

	public void setPlayer(AudioPlayer audioPlayer) {
		player = audioPlayer;
	}

	public abstract void play();

	public abstract void pause();

	public abstract void stop();

	public void forward() {
		System.out.println("Forward >>");
        player.increaseCurrent();
        player.setState(pool.getState(Status.PAUSED));
        System.out.println("Paused.");
	}

	public void rewind() {
		System.out.println("Reward <<");
        player.decreaseCurrent();
        player.setState(pool.getState(Status.PAUSED));
        System.out.println("Paused.");
	}
	
}
