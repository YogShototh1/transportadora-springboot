API Logística - Transportadora Spring Boot
Este projeto é uma API desenvolvida com Spring Boot para gerenciar os processos de uma transportadora, incluindo cadastro de clientes, cidades, e pedidos.

Sobre o Projeto
A API Logística foi criada para facilitar o controle das operações de uma transportadora, oferecendo funcionalidades para cadastro e gerenciamento dos principais elementos envolvidos no processo de entrega.

Funcionalidades
Cadastro e gerenciamento de clientes.

Cadastro e gerenciamento de cidades.

Cadastro e gerenciamento de pedidos.

Tecnologias Utilizadas
Java 17

Spring Boot 3

Spring Data JPA

Banco de dados MySQL

Maven para gerenciamento de dependências

Como Executar o Projeto

Você pode testar e consumir as APIs desta aplicação utilizando o Postman ou qualquer outro cliente de API similar (como Insomnia, Paw, HTTPie, etc.).
Basta fazer requisições HTTP para os endpoints disponíveis, usando os métodos adequados (GET, POST, DELETE, etc.).

Pré-requisitos
Java 17 ou superior instalado
Maven instalado

Passos para rodar a aplicação

Faça o clone do repositório:
git clone https://github.com/YogShototh1/transportadora-springboot.git

Entre na pasta da API:
cd transportadora-springboot/api-logistica

Execute o projeto usando Maven:
mvn spring-boot:run

A API estará disponível em http://localhost:8080/clientes, http://localhost:8080/cidades e http://localhost:8080/pedidos.

Como Usar a aplicação

GET:
http://localhost:8080/clientes
http://localhost:8080/cidades
http://localhost:8080/pedidos
retorna lista com todos os itens da categoria.

http://localhost:8080/clientes/IdDoCliente
http://localhost:8080/cidades/IdDaCidade
http://localhost:8080/pedidos/IdDoPedido
retorna o item especifico da categoria.

POST:
http://localhost:8080/clientes
{
  "nome": "NomeDoCliente", 
  "email": "EmailDoCliente", 
  "telefone": "TelefoneDoCliente", 
  "cidade": {
    "id": IdDaCidadeDoCliente 
  }
}

http://localhost:8080/cidades
{
  "nome": "NomeDaCidade", 
  "estado": "SiglaDoEstado2Letras" 
}

http://localhost:8080/pedidos
{
  "cliente": {
    "id": IdDoClienteDoPedido 
  },
  "data": "DataDoPedidoFormatoYYYY-MM-DD", 
  "valorTotal": ValorDoPedido
}
Faz uma inclusão na categoria.

DELETE:
http://localhost:8080/clientes/IdDoCliente
http://localhost:8080/cidades/IdDaCidade
http://localhost:8080/pedidos/IdDoPedido
Deleta o item especifico da categoria.
