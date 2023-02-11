# Banco01
Criação da Classe Banco (Atividade curso Java - Módulo 01 (Parte 02) 

## Progresso
O projeto continua incompleto, porém com bastante progresso. Foi implementada a `Classe Conta` com os Métodos Personalizados(`toString`, `depositar`, `sacar` e `transferir`) e com seus respectivos Métodos Especiais (`Constructor`, `Getters` e `Setters`). A `Classe Main AgenciaBancaria` foi criada com o intuito de servir como interface para acessar os atributos da `Classe Conta`. Além disso foi criada a `Classe Utils` com a funcionalidade de tratar os valores `Double` e transformá-los em string seguindo o padrão `R$ #,##0.00`. O conceito de listas de Array foi usado, o que tornou possível o cadastro e armazenamento de outras contas. Para quem ficar curioso, [link](https://www.delftstack.com/pt/howto/java/random-alphanumeric-string-in-java/#:~:text=Gere%20string%20alfanum%C3%A9rica%20aleat%C3%B3ria%20em%20Java%20usando%20o,caracteres%20e%20d%C3%ADgitos%20da%20string%20que%20criamos%20anteriormente.) da `Classe GeradorSenha`.

## Pendências

* Conta Poupança além dos métodos herdados terá o método `resgatar`
que transfere valores da Poupança para ContaCorrente;

* A Poupança não aceitará saques e depósitos diretamente, para
depositar ou sacar dinheiro da ContaPoupança será utilizado os métodos
`aplicar` e `resgatar` respectivamente.

## Implementações Futuras

* Implementar a Classe Banco com [JoptionPane](https://www.youtube.com/watch?v=6wo9vvlIhRo&ab_channel=Zécodes)

## Projeto Atual

* [Classe Contas](https://github.com/Edivaldo16/Banco/blob/main/Contas.java)
* [Classe ContaPoupanca](https://github.com/Edivaldo16/Banco/blob/main/ContaPoupanca.java)
* [Classe ContaCorrente](https://github.com/Edivaldo16/Banco/blob/main/ContaCorrente.java)
* [Classe Cliente](https://github.com/Edivaldo16/Banco/blob/main/Cliente.java)
* [Classe GeradorSenha](https://github.com/Edivaldo16/Banco/blob/main/GeradorSenha.java)
* [Interface CaixaEletronico](https://github.com/Edivaldo16/Banco/blob/main/CaixaEletronico.java)
* [Classe Main Banco](https://github.com/Edivaldo16/Banco/blob/main/Teste.java)

## Agradecimentos

Essas implemtações não seriam possíveis se não fosse pelo professor Francilvan, monitora de Java 01 Danny, ao grande mestre [Guanabara](https://www.youtube.com/watch?v=KlIL63MeyMY&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&ab_channel=CursoemVídeo) e Zé Codes(links [1](https://www.youtube.com/watch?v=AExKQiCqwGs&ab_channel=Zécodes) e [2](https://www.youtube.com/watch?v=6wo9vvlIhRo&ab_channel=Zécodes)). Este último, se não fosse pela sua implementação, eu não teria conseguido chegar até aqui. 
