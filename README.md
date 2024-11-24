# Tabela Fipe 2.0

Este projeto é uma aplicação Java que consome a API da Tabela Fipe, permitindo ao usuário consultar o preço médio de veículos com base em suas características, como marca, modelo e ano. Ele foi desenvolvido com o objetivo de praticar conceitos avançados de back-end utilizando Spring Boot e integração com APIs externas.

---

## 📋 Funcionalidades

1. **Menu interativo:** O usuário é guiado por etapas para realizar consultas.  
2. **Consulta de marcas:** A aplicação exibe as marcas disponíveis de veículos (carros, motos ou caminhões).  
3. **Filtragem de modelos:** Permite ao usuário pesquisar modelos com base em palavras-chave.  
4. **Consulta de anos:** Exibe os anos disponíveis para o modelo selecionado.  
5. **Detalhes do veículo:** Mostra informações como preço, marca, modelo, ano e tipo de combustível.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 17  
- **Framework:** Spring Boot  
- **Bibliotecas:**
  - Jackson para manipulação de JSON.
  - Spring Boot Starter para a estrutura do projeto.
- **API Externa:** [API Tabela Fipe](https://parallelum.com.br/fipe/api/v1).  
- **Ferramentas:** Maven para gerenciamento de dependências.

---

## 🚀 Como Executar o Projeto

1. **Clonar o repositório:**
   ```bash
   git clone https://github.com/jvcbrandao/tabelafipe-v2.git
   cd tabelafipe-v2
Configurar o ambiente: Certifique-se de ter o Java 17 ou superior instalado.

Executar a aplicação:
mvn spring-boot:run
Interagir com o programa: Após executar, o programa exibirá menus no terminal para que você escolha as opções desejadas.

🌟 Exemplos de Uso
Selecionar Tipo de Veículo: Escolha entre carros, motos ou caminhões.
Buscar Marcas: Veja todas as marcas disponíveis para o tipo selecionado.
Filtrar Modelos: Procure modelos por palavras-chave (ex.: "civic").
Consultar Valor: Obtenha o preço médio e detalhes de um veículo específico.
🔗 Estrutura de Código
Pacote Model: Contém as classes representando os dados retornados pela API, como MarcasVeiculos e ModelosResposta.
Pacote Service: Responsável por processar dados, como MarcasVeiculosService e TabelaFipeService.
Classe RequisicaoAPI: Centraliza a conexão com a API externa.
Classe Application: Ponto de entrada do programa.

🤝 Contribuições
Sinta-se à vontade para abrir issues ou enviar pull requests com melhorias ou correções. Este projeto foi desenvolvido para fins educacionais, mas novas ideias são sempre bem-vindas!

🧑‍💻 Autor
João Brandão
Apaixonado por desenvolvimento de software e sempre buscando aprender mais!
