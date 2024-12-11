# Pedra, Papel e Tesoura

[IMAGEM DO MENU]

O projeto **Pedra, Papel e Tesoura** foi desenvolvido como um exercício de fixação dos conceitos de Spring MVC, como interface de usuário em HTML e CSS!
## Índice

- [Instalação](#instalação)
- [Como Jogar](#como-jogar)
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-usadas)


## Instalação
Para rodar este projeto localmente, baixe o repositório:

1. Clone o repositório ou baixe:
   ```sh
   git clone https://github.com/gabsato/pedra-papel-tesoura.git

2. Acessando o banco H2-console:
   ```sh
    http://localhost:8080/h2-console
    ```
Para acessar, o JDBC URL é:
  ```sh
      jdbc:h2:mem:testdb
   ```
   

## Como jogar
- Abra o navegador e acesse http://localhost:8080.
- Escolha entre Pedra, Papel ou Tesoura clicando em um dos botões.
- Veja o resultado e a pontuação acumulada.

A interface apresentará três opções a ser escolhido, ao clicar em uma delas, será redirecionado para uma página que mostrará os resultados, podendo repetir as jogadas com o botão de "Voltar" e também usar o botão de "Resetar a pontuação", caso queira zerar a pontuação.

## Funcionalidades
- Contabilizar as vitórias, derrotas e empates.
- Mostrar os resultados.
- Botão de resetar a pontuação

## Tecnologias usadas
- Java
- Spring Boot (Spring Boot DevTools, Spring Data JDBC, H2 Database, Thymeleaf, Spring Web)
- HTML/CSS
