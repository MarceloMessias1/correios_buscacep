package metodos;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import Navegadore.Navegadores;

public class Metodos extends Navegadores {

	/**
	 * @author Marcelo Messias
	 * @param elemento
	 * @param texto
	 */
	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	/**
	 * @author Marcelo Messias
	 * @param elemento
	 */
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}

	public void mudarAba() {

		String abaPrincipal = driver.getWindowHandle();
		Set<String> todasAbas = driver.getWindowHandles();
		Iterator<String> iterator = todasAbas.iterator();

		while (iterator.hasNext()) {
			String abaFilha = iterator.next();
			if (!abaPrincipal.equalsIgnoreCase(abaFilha)) {
				driver.switchTo().window(abaFilha);
				System.out.println("Aba filha é " + driver.getTitle());
			}

		}
	}

}
