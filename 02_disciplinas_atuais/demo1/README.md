# Meu Study Hub TI

Hub acadêmico para organizar conteúdos da formação em Tecnologia da Informação,
incluindo apresentação pessoal, disciplinas, projetos e certificados. O
repositório também contém uma API REST simples de biblioteca, desenvolvida com
Spring Boot, para fins de estudo.

## Conteúdo do repositório

- `01_apresentacao_e_perfil/` — biografia e apresentação acadêmica.
- `02_disciplinas_atuais/` — disciplinas em andamento, atividades, entregas e
  anotações.
- `03_projetos_e_certificados/` — portfólio de projetos e certificados.
- `src/main/java/com/suaapi/` — aplicação Spring Boot e API de livros.
- `src/test/` — testes automatizados da aplicação.

## Tecnologias

- Java 21
- Spring Boot 4.1.1
- Spring Web MVC
- Maven

## Como executar

### Pré-requisitos

Instale o Java 21 ou superior. O projeto inclui o Maven Wrapper, portanto não é
necessário instalar o Maven separadamente.

### Iniciar a aplicação

No Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

No Linux ou macOS:

```bash
./mvnw spring-boot:run
```

A aplicação será iniciada em `http://localhost:8080`.

### Executar os testes

Windows:

```powershell
.\mvnw.cmd test
```

Linux ou macOS:

```bash
./mvnw test
```

## API de livros

A API disponibiliza o recurso `/livros`. Os dados são mantidos em memória e
começam com dois livros de exemplo; eles são perdidos quando a aplicação é
reiniciada.

### Listar livros

```http
GET http://localhost:8080/livros
```

Exemplo:

```bash
curl http://localhost:8080/livros
```

### Cadastrar um livro

```http
POST http://localhost:8080/livros
Content-Type: application/json
```

Corpo da requisição:

```json
{
  "titulo": "Vidas Secas",
  "autor": "Graciliano Ramos",
  "anoPublicacao": 1938
}
```

Exemplo:

```bash
curl -X POST http://localhost:8080/livros ^
  -H "Content-Type: application/json" ^
  -d "{\"titulo\":\"Vidas Secas\",\"autor\":\"Graciliano Ramos\",\"anoPublicacao\":1938}"
```

A resposta retorna o livro cadastrado com o `id` gerado pela aplicação e status
HTTP `201 Created`.

## Modelo `Livro`

Cada livro possui os seguintes campos:

| Campo | Tipo | Descrição |
|---|---|---|
| `id` | `Integer` | Identificador gerado pela API |
| `titulo` | `String` | Título da obra |
| `autor` | `String` | Autor da obra |
| `anoPublicacao` | `int` | Ano de publicação |

## Licença

Projeto acadêmico para estudos e portfólio pessoal.
