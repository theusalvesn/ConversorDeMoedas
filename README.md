# Conversor de Moedas em Java

## Descrição

Este projeto é um **Conversor de Moedas** desenvolvido em Java, que permite realizar conversões entre diversas moedas de forma dinâmica. As taxas de câmbio são obtidas em tempo real por meio de uma API, garantindo que os dados estejam sempre atualizados. O programa oferece uma interface textual (via console) e apresenta um menu com opções para conversões entre diferentes moedas.

## Funcionalidades

- Consulta de taxas de câmbio em tempo real usando uma API externa.
- Menu interativo com pelo menos 6 opções de conversão predefinidas.

## Tecnologias Utilizadas

- **Linguagem**: Java 8+
- **API de Taxas de Câmbio**: Exchangerate API (ou similar)
- **Bibliotecas**:
  - `HttpClient` para requisições HTTP
  - `Gson` para manipulação de JSON
- **Gerenciador de Dependências**: Maven ou Gradle

## Configuração e Execução

### 1. Configurar o Ambiente

- Certifique-se de que o JDK está instalado.
- Instale uma IDE (IntelliJ, Eclipse ou NetBeans).
- Configure o Maven ou Gradle, se necessário.

### 2. Clonar o Repositório

```bash
git clone https://github.com/seu-usuario/conversor-de-moedas.git
cd conversor-de-moedas
```

## Como Usar

1. Execute o programa.
2. Escolha uma das opções do menu exibido no console:
   - Opções predefinidas de conversão (BRL para BOB, BRL para USD, etc...)
3. Insira o valor a ser convertido.
4. O programa exibirá o resultado da conversão com base na taxa de câmbio mais recente.

## Exemplo de Saída
```
Bem-vindo ao Conversor de Moedas!
Escolha uma opção:
BRL para ARS
BRL para BOB
BRL para MXN
BRL para CLP
BRL para COP
BRL para USD

Opção: 1

Digite o valor em BRL: 100
Resultado: 100 BRL = 112 ARS
```


