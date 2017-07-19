package com.Model;

import java.util.HashMap;
import java.util.Map;

public class StatePool {

	/*
	 * I made a pool of states to reuse them. FlyWeight pattern used.
	 */

	private static StatePool statePool = null;
	private Map<Status, AbstractState> pool;

	public enum Status {
		PLAYING, PAUSED, STOPPED
	}

	private StatePool() {

		pool = new HashMap<Status, AbstractState>();

	}

	public static StatePool getInstance() {
		if (statePool == null) {
			statePool = new StatePool();
		}
		return statePool;
	}

	public AbstractState getState(Status key) {

		if (pool.containsKey(key)) {
			return pool.get(key);
		} else {
			AbstractState someState;
			switch (key) {
			case PLAYING:
				someState = new PlayState();
				break;
			case PAUSED:
				someState = new PauseState();
				break;
			case STOPPED:
				someState = new StopState();
				break;
			default:
				someState = null;
			}
			pool.put(key, someState);
			return someState;

		}
	}
}
