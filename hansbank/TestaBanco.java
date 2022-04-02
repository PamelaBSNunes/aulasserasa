package hansbank;

import java.time.LocalDate;
import java.util.Locale;

public class TestaBanco {
	
	public static void main(String[] args) {
		
//		Pessoa pessoaNumero1 = new Pessoa(); // instancia = criar uma cópia
//		pessoaNumero1.nome = "Jose das Couves";
//		pessoaNumero1.profissao = "Agricultor";
//		pessoaNumero1.cpf = "643.829.641-48";
//		
//		System.out.println("Nome: " + pessoaNumero1.nome);
//		System.out.println("Profissão: " + pessoaNumero1.profissao);
//		System.out.println("CPF: " + pessoaNumero1.cpf);
//		
//		Pessoa pessoaNova = new Pessoa();
//		pessoaNova.setNome("Jose das Couves");
//		System.out.println(pessoaNova.getNome());
//		
//		Pessoa pessoaComConstrutor1 = new Pessoa("Jose dos Tomates", "259.800.966-55", "123.456-78");
//		
//		System.out.println("Nome: " + pessoaComConstrutor1.getNome());
//		System.out.println("CPF: " + pessoaComConstrutor1.getCpf());
//		System.out.println("RG: " + pessoaComConstrutor1.getRg());
//		
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
	//	conta1.setSaldo(1000000.50); >> não se deve alterar diretamente essa informação. Ela apenas pode ser exibida.
		conta1.setTitular("Pâmela Beatriz");
		
		conta1.depositar(10000.0);
		
		
		System.out.println("Agência: " + conta1.getAgencia());
		System.out.println("Conta: " + conta1.getNumeroConta());
		System.out.println("Titular: " + conta1.getTitular());
		System.out.printf("Saldo atual: R$ %.2f\n", conta1.getSaldo());
		
		if (conta1.sacar(20.0)) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Saldo insuficiênte, verifique o valor em conta");
		}
		

		System.out.printf("Saldo depois do saque: R$ %.2f\n", conta1.getSaldo());
		
		Conta conta2 = new Conta();
		conta2.setAgencia(5582);
		conta2.setNumeroConta(2234);
		
		conta1.transferir(1000.0, conta2);
		System.out.printf("Saldo atual conta1: R$ %.2f \n" , conta1.getSaldo());
		System.out.printf("Saldo atual conta2: R$ %.2f \n" , conta2.getSaldo());
		
//		Locale.setDefault(new Locale("pt", "BR")); // serve para impressão de data e moeda de acordo com o país
//		Funcionario funcionario = new Funcionario("Isla Cristina", "001.122.348-92", "87759", 2500.0, LocalDate.now());
//		
//		System.out.println(funcionario.toString());
		
		
		
	}

}
