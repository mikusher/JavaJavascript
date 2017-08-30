




package cv.mikusher.cursojava.aula43.exercicios.exec1;





public class Teste {

    public static void main(String[] args) {

        // Conta simples
        System.out.println("Conta Simples");
        ContaBancaria ct1 = new ContaBancaria("Luis Tavares", 124521, 5000);
        ContaBancaria ct2 = new ContaBancaria();
        ct2.setNomeCliente("Luis Amilcar");
        ct2.setNumeroConta(365236);
        ct2.setSaldo(5000);
        // operações
        System.out.println("Conta 1");
        System.out.println(ct1.toString());
        System.out.println();
        System.out.println("Conta 2");
        System.out.println(ct2.toString());
        ct1.sacar(500);
        ct2.sacar(5000);
        ct1.depositar(1.50);
        ct2.depositar(1.50);
        System.out.println();
        System.out.println("Conta 1 e 2");
        System.out.println(ct1.toString());
        System.out.println(ct2.toString());

        // Conta Poupanca
        System.out.println("Conta Poupança");
        ContaPoupanca ct3 = new ContaPoupanca();
        ct3.setNomeCliente("Luis Amilcar");
        ct3.setNumeroConta(365236);
        ct3.setSaldo(5000);
        // operações
        System.out.println();
        System.out.println("Conta 3");
        System.out.println(ct2.toString());
        ct3.sacar(5000);
        ct3.depositar(1.50);
        ct3.setDiaRendimento(30);
        System.out.println();
        System.out.println("Conta 3");
        if (ct3.calculaNovoSaldo(0.5)) {
            System.out.println("Novo rendimento aplicado - Saldo: " + ct3.getSaldo());
        } else {
            System.out.println("Não é dia de rendimento");
        }
        System.out.println(ct3.toString());

        // Conta Especial
        System.out.println("Conta Especial");
        ContaEspecial ct4 = new ContaEspecial();
        ct4.setNomeCliente("Luis Amilcar");
        ct4.setNumeroConta(365236);
        ct4.setSaldo(5000);
        // operações
        System.out.println();
        System.out.println("Conta 4");
        System.out.println(ct2.toString());
        ct4.setLimite(500);
        ct4.sacar(5000);
        ct4.depositar(1.50);
        System.out.println();
        System.out.println("Conta 4");
        System.out.println(ct4.toString());
    }

}
