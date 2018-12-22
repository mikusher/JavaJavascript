/*
 * Copyright (C) 2017 Miky Mikusher
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */





package cv.mikusher.k19.orientacao_a_objecto.escola;





/**
 *
 * @author Luis Amilcar D. N. Tavares
 * @nickname Miky Mikusher
 */

public class Turmas {

    int    periodo;
    int    serie;
    String sigla;
    String tipoDeEnsino;

    
    
    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTipoDeEnsino() {
        return tipoDeEnsino;
    }

    public void setTipoDeEnsino(String tipoDeEnsino) {
        this.tipoDeEnsino = tipoDeEnsino;
    }
    
    
    
}
