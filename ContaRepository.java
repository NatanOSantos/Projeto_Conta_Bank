package conta_Bancaria.repository;

import conta_Bancaria.model.Conta;

public interface ContaRepository {
	
	//CRUD
	
	public void procurarPorNumero(int numero);
	public void listaTodas ();
	public void cadastrar (Conta conta);
	public void atualizar (Conta conta);
	public void deletar (int numero);

	//Métodos Bancários 
	
	public void sacar (int numero, float valor);
	public void depositar (int numero, float valor);
	public void transferir (int numeroOrigem, int numeroDestino, float valor);
	void listarTodas(); 
	
}


