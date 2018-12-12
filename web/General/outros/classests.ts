class Robot{
    public _nome: string;
    public _apelido: string;
    private _idade: number;

    public informacao():string{
        if (this.getIdade!==undefined) {
            return "Meus dados: " + this._nome+" "+this._apelido+" Idade "+this._idade;            
        }
        return "Meus dados: " + this._nome+" "+this._apelido;
    }

	public getIdade(): number {
		return this._idade;
	}

	public setIdade(value: number) {
		this._idade = value;
	}
    

}

let miDados = new Robot();
miDados._nome = "Luis";
miDados._apelido = "Amilcar";
miDados.setIdade(29);

//apresentar as informações
console.log(miDados.informacao());