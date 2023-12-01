# SISTEMA DE RESERVA DE SALÃO DE FESTAS DE CONDOMÍNIO 

**UNIESP**
**Curso:** Sistemas para Internet - P4
**Disciplina:** Tecnologia para Back-End II
**Professor:** André Farias
**Alunos:** Gabriel Santana e Lucas Muniz

## Projeto:

Sistema de reserva de Salão de Festas de um Condomínio Residencial, onde é possível o morador se cadastrar no sistema, pode escolher a área que gostaria de reservar, visualizar tudo o que está incluso na reserva e por fim fazer a reserva. O sistema será desenvolvido em Java, utilizando o framework Spring Boot e o banco de dados MySQL.


O projeto consiste em um Sistema de Reserva de Salão de Festas destinado a um Condomínio Residencial. A principal funcionalidade é permitir que os moradores realizem reservas para áreas específicas do condomínio, como salões de festas ou churrasqueiras. O sistema proporciona uma experiência amigável, permitindo que os moradores se cadastrem, escolham a área desejada para a reserva e visualizem as informações relevantes associadas à reserva.

O desenvolvimento do sistema foi realizado em Java, aproveitando o framework Spring Boot para facilitar o processo de construção e configuração. Além disso, o banco de dados escolhido para armazenar as informações do sistema foi o MySQL, integrando-se perfeitamente com o ambiente Java por meio de tecnologias de persistência de dados.

O projeto visa oferecer uma solução eficaz e intuitiva para a administração e utilização dos espaços comuns dentro do condomínio, proporcionando aos moradores uma maneira conveniente de planejar e realizar eventos. O uso do Spring Boot e do MySQL visa garantir uma implementação robusta, escalável e de fácil manutenção.

Principais Funcionalidades:

1.	Cadastro de Moradores:

●	Os moradores podem se cadastrar no sistema, fornecendo informações básicas como nome, número de apartamento e telefone.

2.	Reserva de Áreas Comuns:

●	Os moradores têm a capacidade de escolher entre as áreas comuns disponíveis para reserva, como salões de festas ou churrasqueiras.

3.	Visualização de Informações:

●	Antes de confirmar a reserva, os moradores podem visualizar detalhes sobre a área selecionada, incluindo capacidade, disponibilidade de datas e
 
quaisquer informações adicionais relevantes.

4.	Confirmação e Notificação:

●	Após selecionar a área e a data desejadas, os moradores podem confirmar a reserva. O sistema enviará automaticamente uma notificação de confirmação, garantindo que o morador tenha um registro claro da reserva realizada.

5.	Administração de Reservas:

●	Os administradores do condomínio terão acesso a um relatório abrangente de todas as reservas feitas. Esse relatório pode ser filtrado por data, área e morador, possibilitando uma gestão eficiente dos espaços comuns.


3.	Histórias de Usuários:

●	Cadastro de Moradores:


-	História do Usuário: Como usuário do sistema, quero me cadastrar fornecendo informações pessoais básicas para ter acesso às funcionalidades de reserva.

-	Critérios de Aceitação:

-	Deve haver um formulário de cadastro com campos para nome, número de apartamento e telefone;
 
-	Os dados do morador devem ser armazenados de forma segura no banco de dados.

-	Descrição do cenário:

Dado que um novo morador fornece informações de cadastro válidas;
Quando o morador envia o formulário de cadastro;
Então suas informações, como nome, número de apartamento e telefone, devem ser armazenadas de forma segura no banco de dados.


●	Reserva de Áreas Comuns:


-	História do Usuário: Como morador, quero poder reservar áreas comuns do condomínio para realizar eventos.

-	Critérios de Aceitação:

-	Deve haver uma lista de áreas disponíveis para reserva, como salão de festas e churrasqueiras;

-	Ao selecionar uma área, o sistema deve apresentar informações sobre capacidade, disponibilidade de datas e demais detalhes relevantes.

-	Descrição do cenário:

Dado que o morador deseja realizar uma reserva;
Quando ele escolhe uma área comum e uma data disponível;
Então a reserva deve ser registrada no banco de dados, associando-a ao morador, à área comum e à data escolhida;
E a disponibilidade da área deve ser atualizada no banco de dados.


●	Visualização de Informações:


-	História do Usuário: Como morador, quero visualizar detalhes específicos sobre a área que estou interessado para fazer reserva.

-	Critérios de Aceitação:

-	Ao selecionar uma área, o sistema deve exibir informações detalhadas, incluindo capacidade, disponibilidade de datas, e quaisquer instruções ou restrições associadas.
 
-	Descrição do cenário:

Dado que o morador deseja visualizar  informações  detalhadas  sobre uma área comum;
Quando ele seleciona a área desejada;
Então o sistema deve consultar o banco de dados para obter e apresentar as informações, incluindo capacidade, disponibilidade de datas e instruções/restrições associadas.


●	Confirmação e Notificação:


-	História do Usuário: Como morador, quero receber uma uma notificação após realizar a reserva, com todos os detalhes para confirmar a mesma.

-	Critérios de Aceitação:

-	Após confirmar a reserva, o sistema deve exibir uma mensagem de confirmação;

-	.O sistema deve enviar automaticamente uma notificação por e-mail ou mensagem SMS com os detalhes da reserva.

-	Descrição do cenário:

Dado que um morador conclui uma reserva com sucesso.
Quando a reserva é confirmada.
Então o sistema deve enviar uma notificação por e-mail ou mensagem SMS ao morador, contendo os detalhes da reserva. E as informações da reserva devem ser registradas no banco de dados.


●	Administração de Reservas:


-	História do Usuário: Como administrador do condomínio, quero ter acesso a um relatório abrangente para visualizar todas as reservas feitas.

-	Critérios de Aceitação:

-	Deve existir uma seção administrativa com acesso restrito;
 
-	.O relatório deve incluir informações sobre locais, datas, moradores e eventos associados às reservas;

-	Deve ser possível filtrar o relatório por data, área e morador.

-	Descrição do cenário:

Dado que um administrador deseja visualizar o relatório de reservas. Quando ele acessa a seção administrativa e aplica filtros, se necessário.
Então o sistema deve consultar o banco de dados e apresentar um relatório com informações sobre locais, datas, moradores e eventos associados às reservas.
