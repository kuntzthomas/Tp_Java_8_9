package fr.pizzeria.ihm;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class MenuTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	@Rule
	public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

	private Menu menu;

	@Before
	public void setUp() throws Exception {

		Scanner scanner = new Scanner(System.in);
		this.menu = new Menu();

	}

	@Test
	public void TestMenu() {

	}

	@Test
	public void TestAfficher() {

		this.menu.afficher();

		String logConsole = systemOutRule.getLog();
		assertThat(logConsole).contains("***** Pizzeria Administration *****");
		assertThat(logConsole).contains("1. Liste des Pizzas");
		assertThat(logConsole).contains("2. Ajouter une nouvelle pizza");
		assertThat(logConsole).contains("3. Mettre à jour une pizza");
		assertThat(logConsole).contains("4. Supprimer une pizza");
		assertThat(logConsole).contains("99. Sortie.");

	}

}