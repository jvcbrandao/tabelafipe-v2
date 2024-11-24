package com.joao.brandao.tabelafipe20;

import java.util.Scanner;

public class InformacoesTextuais {
    Scanner scanner = new Scanner(System.in);

    public String menuInicial(){

        System.out.println("""
				Informe a opção desejada
				
				Carro
				
				Caminhão
				
				Moto			
				
				
				""");
        var veiculoEscolhido = scanner.nextLine();


        if (veiculoEscolhido.toLowerCase().contains("car")){
           return veiculoEscolhido="carros";
        } else if (veiculoEscolhido.toLowerCase().contains("mot")) {
            return veiculoEscolhido="motos";
        }
        else if(veiculoEscolhido.toLowerCase().contains("cami")) {
            return veiculoEscolhido="caminhoes";
        }
        else{
            return "Você não informou um dado válido, o programa foi encerrado";
        }

    }


    public String selecionarMarca(){

        System.out.println("Informe o código da marca que deseja: ");
        var marcaEscolhida = scanner.nextLine();

        return  marcaEscolhida;
    }

    public String filtrarModelos(){

        System.out.println("Informe uma parte do nome do modelo para pesquisar: ");
        var trechoModelo = scanner.nextLine();

        return trechoModelo;

    }

    public String definirModelo(){

        System.out.println("Informe o código do modelo que deseja: ");
        var modeloEscolhido = scanner.nextLine();

        return  modeloEscolhido;
    }

}
