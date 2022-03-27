package Teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import metodos.Metodos;

public class BuscarCepCorreios {

	Metodos metodos = new Metodos();

	@Test

	public void testBuscarCep() {

		System.out.println("Teste iniciado com sucesso");

		By pesquisaCep = By.id("relaxation");

		metodos.abrirNavegador();
		metodos.preencher(pesquisaCep, "06544-300");
		metodos.submit(pesquisaCep);
		metodos.mudarAba();
		metodos.fecharNavegador();
	}

}
