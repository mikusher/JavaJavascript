/*
 * Copyright (C) 2017 Miky Mikusher
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */

package cv.mikusher.media;

import java.net.URL;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 *
 * @author Miky Mikusher
 */
public class Main extends Application {

	public static void main(String[] args) {

		launch(args);
	}

	public void start(Stage primaryStage) {

		final URL resource = musicToPlay();

		final Media media = new Media(resource.toString());
		final MediaPlayer mediaPlayer = new MediaPlayer(media);
		// mediaPlayer.play();
		mediaPlayer.setAutoPlay(true);
		mediaPlayer.setOnError(new Runnable() {

			@Override
			public void run() {

				System.out.println("Media error occurred: " + mediaPlayer.getError());
			}
		});

		primaryStage.setTitle("Music Player");
		primaryStage.setWidth(300);
		primaryStage.setHeight(200);
		primaryStage.show();
	}

	private URL musicToPlay() {

		try {

			String musicName;

			// musicName = "GodFather";
			// musicName = "Projota_CartaAosMeus";

			String[] listaM = listaMusica();
			for (String myMusic : listaM) {
				musicName = listaM[myMusic.indexOf(myMusic)];
				final URL resource = getClass().getResource(musicName + ".mp3");
				return resource;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String[] listaMusica() {

		return new String[] { "music\\GodFather", "music\\Projota_CartaM", "music\\GodFather",
				"music\\Projota_CartaM" };

	}
}