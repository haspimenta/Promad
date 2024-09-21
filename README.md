# Promad
> **Utilizando os Spring Boot e Postgresql para microsserviços. Requisições Post, Get, Delete, Put com Postman. Adicional com Junit e Liquibase com CLI.**

`Iniciando os parametros para o projeto sexta-feira dia 20/09/2024 ás 11:18h.`

## Objetivo
1. Como usuário preciso salvar meus números de processos no sistema, quero poder
enviar estes números através de uma requisição POST.
- Obs : Os números de processos devem ser únicos
2. Como usuário quero receber um erro ao tentar cadastrar um processo que já foi
cadastrado anteriormente.
3. Como usuário quero poder consultar os números de processos que salvei.
4. Como usuário quero poder excluir um número de processo que salvei.
5. Como usuário quero poder adicionar um Réu a um processo que já cadastrei
anteriormente.

6. **Pensando em ações de legado e ajustes de estrutura, o meu objetivo é demonstrar que posso trabalhar com vários tipos de situação, estudando documentação, resolvendo conflitos de merge no git - CLI - github e ajudando na reestrutura para obter as melhores práticas e gestão para manutenção.**

## Arquitetura e stack
* VSCode: Editor de código com plugins de suporte a Spring e Java.
* JDK 17 ou superior: Para rodar projetos Spring Boot.
* PostgreSQL: Banco de dados relacional.
* Maven: Ferramenta de automação de build para gerenciar dependências.
* Liquibase CLI: Para gerenciar migrações de banco de dados. 

## Instalação e configuração
* Extensões VSCode - Java Extension Pack
> Com essa extensão poderemos instalar no VSCode todas as ferramentas necessárias para o projeto. Seja para reconhecimento da linguagem Java, teste, debug, manager, maven e mais.
* Instalação Java
```
https://www.openlogic.com/openjdk-downloads?field_java_parent_version_target_id=406&field_operating_system_target_id=436&field_architecture_target_id=All&field_java_package_target_id=All 
```
* Abrir Configurações do Sistema > Configurações Avançadas do Sistema > Variáveis de Ambiente.
Encontre a variável Path em "Variáveis do Sistema" e adicione o caminho da pasta binária do JDK.

> se utiliza o Ubuntu, basta abrir o terminal dentro do VSCode. Porém se utiliza o Windows será necessário instalar o WSL do Ubuntu, para isso siga os passos desse tutorial abaixo.
```
https://ubuntu.com/desktop/wsl
```

* No terminal do VSCode
``` 
sudo apt install mave
```
depois 
```
sudo apt-get update
```
* Crie o projeto com CLI
```
mvn archetype:generate -DgroupId=com.example -DartifactId=processos-microservice -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Execução
* Após configurar e instalar as ferramentas, execute o projeto.
  
```
mvn spring-boot:run
```

```
mvn liquibase:update
```

## Usando o Postman para testar as funcionalidades
> O Postman é uma ferramenta gráfica que facilita o envio de requisições HTTP. Vamos testar os seguintes endpoints com ela:

* POST: Salvar números de processos.
* GET: Listar números de processos.
* DELETE: Excluir número de processo.
* PUT: Adicionar réu a um processo.

* Instalar o Postman
> Se ainda não o tiver instalado, você pode baixar o Postman no site oficial.
```
https://www.postman.com/downloads/
```

* Iniciar o Spring Boot
> Certifique-se de que o microsserviço está rodando no localhost na porta 8080. Caso contrário, ajuste o projeto para rodar nessa porta.

## Testando as Funcionalidades
* Testar o POST - Salvar Números de Processos
Abra o Postman e crie uma nova requisição POST.
Defina a URL como:
```
http://localhost:8080/processos
```
No corpo da requisição, escolha o formato raw e JSON.
Adicione o seguinte JSON como exemplo:
```
{
    "numeroProcesso": "123456"
}
```

* Testar o GET - Listar Processos
Crie uma nova requisição GET no Postman.
Defina a URL como:
```
http://localhost:8080/processos
```

* Testar o DELETE - Excluir um Processo
Crie uma nova requisição DELETE no Postman.
Defina a URL como:
> Substitua {id} pelo ID do processo que você quer deletar.
```
http://localhost:8080/processos/{id}
```
Exemplo:
> http://localhost:8080/processos/1

* Testar o PUT - Adicionar Réu a um Processo
Crie uma nova requisição POST no Postman.
Defina a URL como:
```
http://localhost:8080/reus/adicionar/{processoId}
```
Substitua {processoId} pelo ID de um processo existente.
No corpo da requisição, escolha o formato raw e JSON.
Adicione o seguinte JSON como exemplo:
```
{
    "nome": "João da Silva"
}
```

`Conclusão dos parametros do projeto sexta-feira 20/09/2024 ás 18:55h`

`Melhorias e reestruturação do projeto conforme objetivo do ponto 6, no parágrafo dos Objetivos.`
`Sabado dia 21/09/2024 ás 9:00h`

> Demonstrando ação de resolução de conflitos de merge no projeto.

<img src="https://github.com/haspimenta/Promad/blob/main/imagens/historicomergesgithub.jpg">

> Demonstrando ação de reestruturação de projeto para melhores práticas.
* Em muitas situações encontramos estruturas funcionais de código, porém sem a estrutura adequada e de melhores práticas; por isso a necessidade de se saber trabalhar com sistemas/códigos legados e paralelo a isso,a necessidade da leitura de documentação, adequando a criação e atualização do documento de técnico e melhorando a reestruturação.
* Antes.

<img src="https://github.com/haspimenta/Promad/blob/main/imagens/estruturaInicialFuncional.jpg">

* Depois

<img src="https://github.com/haspimenta/Promad/blob/main/imagens/estruturaFinalFuncional.jpg">

> Demonstrando melhores prática e organização das ações de teste. "Nesse caso, optei por usar o Postman, conforme imagem abaixo.

<img src="https://github.com/haspimenta/Promad/blob/main/imagens/postman.jpg">

## Conclusão
* A implementação deste microserviço de processos foi uma oportunidade valiosa para aplicar meus conhecimentos em Java, Spring Boot e arquitetura de microserviços. Durante o desenvolvimento, foquei em demonstrar possibilidades de estrutura e aplicação posterior no uso das melhores práticas de programação, como a organização modular do código, separação clara de responsabilidades com o uso de camadas (Controller, Service e Repository) e a adesão aos princípios de design. Além disso, fiz questão de manter a documentação clara e atualizada, de modo a garantir que o projeto seja compreensível e sustentável no longo prazo.

Pessoalmente, considero que todos os objetivos propostos foram atingidos, seguindo o padrão, com a lógica de negócio desacoplada da camada de persistência e interfaces bem definidas para a comunicação entre componentes.

Em resumo, acredito que este projeto reflete não só o uso eficiente de tecnologias modernas, mas também uma atenção meticulosa ao rigor técnico e à boa engenharia de software.

`Conclusão do projeto - Sabado dia 21/09/2024 ás 12:00h`

