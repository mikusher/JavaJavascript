/*
 * Copyright (C) 2017 latavares - 03/10/2017
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */





package cv.mikusher.diversidade;





public class Personalidade {

    private String nome;
    private String apelido;
    private String morada;
    private String identidade;
    private int    idade;
    private int    valor;





    public Personalidade() {

        super();
    }





    public Personalidade(String nome, String apelido, String morada, String identidade, int idade) {

        super();
        this.nome = nome;
        this.apelido = apelido;
        this.morada = morada;
        this.identidade = identidade;
        this.idade = idade;
    }





    public String getNome() {

        return nome;
    }





    public void setNome(String nome) {

        this.nome = nome;
    }





    public String getApelido() {

        return apelido;
    }





    public void setApelido(String apelido) {

        this.apelido = apelido;
    }





    public String getMorada() {

        return morada;
    }





    public void setMorada(String morada) {

        this.morada = morada;
    }





    public String getIdentidade() {

        return identidade;
    }





    public void setIdentidade(String identidade) {

        this.identidade = identidade;
    }





    public int getIdade() {

        return idade;
    }





    public void setIdade(int idade) {

        this.idade = idade;
    }





    public int getValor() {

        return valor;
    }





    public void setValor(int valor) {

        this.valor = valor;
    }





    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + ((apelido == null) ? 0 : apelido.hashCode());
        result = prime * result + idade;
        result = prime * result + ((identidade == null) ? 0 : identidade.hashCode());
        result = prime * result + ((morada == null) ? 0 : morada.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + valor;
        return result;
    }





    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Personalidade other = (Personalidade) obj;
        if (apelido == null) {
            if (other.apelido != null)
                return false;
        } else if (!apelido.equals(other.apelido))
            return false;
        if (idade != other.idade)
            return false;
        if (identidade == null) {
            if (other.identidade != null)
                return false;
        } else if (!identidade.equals(other.identidade))
            return false;
        if (morada == null) {
            if (other.morada != null)
                return false;
        } else if (!morada.equals(other.morada))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (valor != other.valor)
            return false;
        return true;
    }





    @Override
    public String toString() {

        return "Personalidade [Nome=" + nome + ", Apelido=" + apelido + ", Morada=" + morada + ", Identidade=" + identidade + ", Idade=" + idade + ", Valor=" + valor + "]";
    }

}
