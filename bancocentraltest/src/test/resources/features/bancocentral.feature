
@tag
Feature: Validar sitio de Banco Central

  @tag1
  Scenario: Validar título del sitio
    Given Abro el navegador Chrome
    When Accedo al sitio web del Banco Central
    Then Debería ver el título "Inicio - Banco Central de Chile"
    And Debería ver el valor de la UF, UTM, Dólar observado y Euro

