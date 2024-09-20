# Promad
Utilizando os Spring Boot e Postgresql para microsserviços. Requisições Post, Get, Delete, Put com Postman. Adicional com Junit e Liquibase com CLI.

Iniciando os parametros para o projeto sexta-feira dia 20-09-2011 ás 11:18h.

# Objetivo
1. Como usuário preciso salvar meus números de processos no sistema, quero poder
enviar estes números através de uma requisição POST.
- Obs : Os números de processos devem ser únicos
2. Como usuário quero receber um erro ao tentar cadastrar um processo que já foi
cadastrado anteriormente.
3. Como usuário quero poder consultar os números de processos que salvei.
4. Como usuário quero poder excluir um número de processo que salvei.
5. Como usuário quero poder adicionar um Réu a um processo que já cadastrei
anteriormente.

# Arquitetura e stack
* VSCode: Editor de código com plugins de suporte a Spring e Java.
* JDK 17 ou superior: Para rodar projetos Spring Boot.
* PostgreSQL: Banco de dados relacional.
* Maven: Ferramenta de automação de build para gerenciar dependências.
* Liquibase CLI: Para gerenciar migrações de banco de dados. 

# Instalação e configuração
* Extensões VSCode - Java Extension Pack
* Instalação Java - https://www.openlogic.com/openjdk-downloads?field_java_parent_version_target_id=406&field_operating_system_target_id=436&field_architecture_target_id=All&field_java_package_target_id=All
* Abrir Configurações do Sistema > Configurações Avançadas do Sistema > Variáveis de Ambiente.
Encontre a variável Path em "Variáveis do Sistema" e adicione o caminho da pasta binária do JDK.
* No terminal do VSCode - 
sudo apt install mave depois sudo apt-get update
* Crie o projeto com CLI - mvn archetype:generate -DgroupId=com.example -DartifactId=processos-microservice -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

# Execução
* mvn spring-boot:run
* mvn liquibase:update

