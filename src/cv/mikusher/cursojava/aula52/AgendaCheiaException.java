/*
 * Copyright (C) 2017 Luis Tavares
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */





package cv.mikusher.cursojava.aula52;





/**
 *
 * @author Luis Tavares
 */
public class AgendaCheiaException extends Exception {

    @Override
    public String getMessage() {

        return "Agenda ja esta cheia";
    }

}
