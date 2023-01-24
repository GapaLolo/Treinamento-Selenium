$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("desconto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Receber desconto da qazando",
  "description": "Eu como usu�rio da qazando\r\nquero receber cupom de desconto para\r\ncomprar um curso com valor reduzido",
  "id": "receber-desconto-da-qazando",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "Visualizar codigo de desconto",
  "description": "",
  "id": "receber-desconto-da-qazando;visualizar-codigo-de-desconto",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 9,
  "name": "que estou no site da qazando",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "eu preencho meu e-mail",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "clico em ganhar cupom",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu vejo o codigo de desconto",
  "keyword": "Entao "
});
formatter.match({
  "location": "DescontosStep.acessar_site_qazando()"
});
formatter.result({
  "duration": 3202671100,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.eu_preencho_meu_e_mail()"
});
formatter.result({
  "duration": 2104521000,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.clico_em_ganhar_cupom()"
});
formatter.result({
  "duration": 52329100,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.eu_vejo_o_codigo_de_desconto()"
});
formatter.result({
  "duration": 32022900,
  "status": "passed"
});
});