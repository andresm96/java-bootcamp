package com.Model;

public class AudioPlayerDemo {

	public static void main(String[] args) {
		
		AudioPlayer player = new AudioPlayer();
		PlayList playList = new PlayList("Oasis/Blur/Arctic Monkeys");
		Song song = new Song("Morning Glory", "Oasis", "C:/user/morning_glory.mp3");
		playList.add(song);
		song = new Song("Supersonic", "Oasis", "C:/user/supersonic.mp3");
		playList.add(song);
		song = new Song("Song 2", "Blur", "C:/user/song2.mp3");
		playList.add(song);
		song = new Song("Fake Tales of SF", "Arctic Monkeys", "C:/user/fake_tales_SF.mp3");
		playList.add(song);
		
		player.add(playList);
		player.pressPlay();
		player.pressFWD();
		player.pressPlay();
		player.pressREW();
		player.pressPlay();
		player.pressPause();
		player.pressPause();
		player.pressStop();
	}
}
