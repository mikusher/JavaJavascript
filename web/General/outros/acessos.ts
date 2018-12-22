class conversor{
    static PI: number = 3.1416;

    static radiano(graus: number){
        return "O radiona de "+graus+" é: "+ (graus*conversor.PI/180);
    }
}

console.log(conversor.PI);
console.log(conversor.radiano(25));