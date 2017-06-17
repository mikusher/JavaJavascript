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

        String musicName;
        // musicName = "GodFather";
        musicName = "Projota_CartaAosMeus";

        final URL resource = getClass().getResource(musicName + ".mp3");

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

        primaryStage.setTitle("Audio Player");
        primaryStage.setWidth(200);
        primaryStage.setHeight(200);
        primaryStage.show();
    }
}