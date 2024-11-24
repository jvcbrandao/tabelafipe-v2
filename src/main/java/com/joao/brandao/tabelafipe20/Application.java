package com.joao.brandao.tabelafipe20;

import Model.MarcasVeiculos;
import Model.ModelosResposta;
import Model.ModelosVeiculos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		InformacoesTextuais informacoesTextuais = new InformacoesTextuais();
		RequisicaoAPI requisicaoAPI = new RequisicaoAPI();
		MarcasVeiculosService marcasVeiculosService = new MarcasVeiculosService();
		SpringApplication.run(Application.class, args);
		List<MarcasVeiculos> listaMarcas = new ArrayList<>();
		List<ModelosResposta> listaModelos = new ArrayList<>();
		ModelosVeiculosService modelosVeiculos = new ModelosVeiculosService();

		var veiculoEscolhido = informacoesTextuais.menuInicial();

		var endereco = "https://parallelum.com.br/fipe/api/v1/" + veiculoEscolhido + "/marcas";

		var json = requisicaoAPI.conectarApi(endereco);

		listaMarcas = marcasVeiculosService.parseMarcasVeiculos(json);

		listaMarcas.stream().forEach(System.out::println);

		var marcaEscolhida = informacoesTextuais.selecionarMarca();

		endereco = endereco + "/" + marcaEscolhida + "/modelos";

		json = requisicaoAPI.conectarApi(endereco);

		List<ModelosResposta.Modelo> listaDeModelos = new ArrayList<>();

		listaDeModelos =  modelosVeiculos.parseModelosVeiculos(json);

		listaDeModelos.stream().forEach(System.out::println);

		var trechoModelo = informacoesTextuais.filtrarModelos();
		System.out.println(trechoModelo);

		listaDeModelos.stream()
				.filter(modelo -> modelo.nome().toLowerCase().contains(trechoModelo.toLowerCase()))
				.forEach(modelo -> {
					System.out.println( "O código é: " + modelo.codigo() + " o nome é: " + modelo.nome());
				});

		var modeloEscolhido = informacoesTextuais.definirModelo();;

		endereco = endereco + "/" + modeloEscolhido + "/anos";

		json = requisicaoAPI.conectarApi(endereco);

		marcasVeiculosService.parseMarcasVeiculos(json);

		listaMarcas = marcasVeiculosService.parseMarcasVeiculos(json);

		listaMarcas.stream().forEach(System.out::println);

	}

}
