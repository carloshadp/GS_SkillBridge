# SkillBridge API - Plataforma de Upskilling/Reskilling para 2030

## O PROBLEMA: A Era da Requalificação Contínua
Cenário Global 2025-2030
Você está vivendo em um momento histórico de transformação profunda. O mercado de trabalho não está evoluindo gradualmente — está se transformando radicalmente.
-40% das tarefas humanas podem ser automatizadas nos próximos 5 anos
-60% das tarefas humanas podem ser automatizadas em 10 anos
Resultado: Desemprego estrutural em funções repetitivas

## Pensando nisso desenvolvemos o SkillBridge
O **SkillBridge** é uma plataforma backend que permite que profissionais se cadastrem, acessem trilhas de aprendizagem focadas em competências do futuro (tecnológicas e humanas), e se inscrevam nelas para requalificação profissional. A solução aborda a transformação do mercado de trabalho 2030+, onde IA, automação, análise de dados e habilidades interpessoais são essenciais.

## 🎓 Alinhamento com os Objetivos de Desenvolvimento Sustentável (ODS)

### ODS 4 - Educação de Qualidade
**Meta**: Garantir educação de qualidade e aprendizagem ao longo da vida

**Como o SkillBridge contribui:**
- Oferece trilhas de aprendizagem acessíveis e estruturadas
- Foca em competências valorizadas no mercado
- Democratiza acesso a cursos especializados

### ODS 8 - Trabalho Decente e Crescimento Econômico
**Meta**: Promover trabalho decente, crescimento econômico e redução do desemprego

**Como o SkillBridge contribui:**
- **Reduz desemprego**: Requalifica profissionais ameaçados pela automação
- **Promove crescimento profissional**: Permite progressão de carreira (JUNIOR → SENIOR)

### ODS 9 - Indústria, Inovação e Infraestrutura
**Meta**: Construir infraestruturas resilientes, promover inovação
**Como o SkillBridge contribui:**
- **Trilhas focadas em inovação**: IA, Cloud Computing, Automação
- **Infraestrutura de aprendizado**: API robusta, escalável, moderna

### ODS 10 - Redução das Desigualdades
**Meta**: Reduzir desigualdades dentro e entre países
**Como o SkillBridge contribui:**
- **Acesso democrático**: Qualquer pessoa pode se cadastrar e aprender
- **Reduz digital divide**: Oferece acesso a competências digitais essenciais


## 🚀 Como Executar

### Pré-requisitos

- **Java**: 21 ou superior (instalado e no PATH)
- **Maven**: 3.8+ (instalado e no PATH)
- **Git**: Para clonar o repositório

### Passo 1: Clonar o Repositório

```bash
git clone https://github.com/seu-usuario/skillbridge-api.git
cd skillbridge-api
```

### Passo 2: Compilar o Projeto

```bash
mvn clean install
```


### Passo 3: Executar a Aplicação

```bash
mvn spring-boot:run
```

### Passo 4: Verificar se Está Funcionando

Abra seu navegador e acesse:

```
http://localhost:3000/h2-console
```

**Configuração do Console H2:**
- **JDBC URL**: `jdbc:h2:mem:skillbridgedb`
- **User Name**: `sa`
- **Password**: (deixe vazio)

## 📡 Endpoints da API

### Base URL
```
http://localhost:3000
```

### 👤 Endpoints de USUARIO

#### 1. Listar Todos os Usuários
```http
GET /usuarios
```
#### 2. Buscar Usuário por ID
```http
GET /usuarios/{id}
```
**Exemplo:**
```http
GET /usuarios/1
```

#### 3. Criar Novo Usuário
```http
POST /usuarios
Content-Type: application/json
```
**Request Body:**
```json
{
  "nome": "Salatiel Marinho",
  "email": "salatiel_theBest@fiap.com.br",
  "areaAtuacao": "Professor de Java",
  "nivelCarreira": "SENIOR"
}
```

#### 4. Atualizar Usuário
```http
PUT /usuarios/{id}
Content-Type: application/json
```
**Request Body:**
```json
{
  "nome": "Salatiel Marinho",
  "email": "salatiel_theBest@fiap.com.br",
  "areaAtuacao": "Professor de DDD",
  "nivelCarreira": "ESPECIALISTA"
}
```
#### 5. Deletar Usuário
```http
DELETE /usuarios/{id}
```
### 📚 Endpoints de TRILHA

#### 1. Listar Todas as Trilhas
```http
GET /trilhas
```
#### 2. Buscar Trilha por ID
```http
GET /trilhas/{id}
```
#### 3. Criar Nova Trilha
```http
POST /trilhas
Content-Type: application/json
```
**Request Body:**
```json
{
  "nome": "Liderança em Ambientes Remotos",
  "descricao": "Desenvolva habilidades de liderança para equipes distribuídas",
  "nivel": "INTERMEDIARIO",
  "cargaHoraria": 25,
  "focoPrincipal": "Habilidades Humanas"
}
```

#### 4. Atualizar Trilha
```http
PUT /trilhas/{id}
Content-Type: application/json
```
**Request Body:**
```json
{
  "nome": "Liderança em Ambientes Presenciais",
  "descricao": "Desenvolva habilidades de liderança para equipes compactas",
  "nivel": "AVANCADO",
  "cargaHoraria": 25,
  "focoPrincipal": "Habilidades Comportamentais"
}
```
#### 5. Deletar Trilha
```http
DELETE /trilhas/{id}
```

## 🛠️ Testando com Postman/Insomnia

### Importar Collection

1. Copie os endpoints acima
2. No Postman/Insomnia, crie uma nova requisição
3. Cole a URL: `http://localhost:3000/usuarios`
4. Selecione o método HTTP (GET, POST, etc)

### Exemplo de Teste Completo

```
1. GET http://localhost:3000/usuarios
   → Listar usuários existentes

2. POST http://localhost:3000/usuarios
   Body: { "nome": "Teste", "email": "teste@email.com", ... }
   → Criar novo usuário

3. GET http://localhost:3000/usuarios/6
   → Verificar usuário criado

4. PUT http://localhost:3000/usuarios/6
   Body: { "nome": "Teste Atualizado", ... }
   → Atualizar usuário

5. DELETE http://localhost:3000/usuarios/6
   → Deletar usuário

6. GET http://localhost:3000/usuarios
   → Verificar que foi deletado
```

## 👥 Integrantes do Grupo

**Carlos Henrique Pinheiro** - RM558003

**Bruno Bastos** - RM550416

**Maurício Alves** - RM556214



**Desenvolvido com ❤️ para o Global Solution 2025 - O Futuro do Trabalho**

