Feature: Test Intro Demo nopCommerce
  @testinit
  Scenario: Validar comportamiento direccionamiento opc Software
    Given el usuario ingresa a la pagina de Demo Nop Commerce
    When el usuario de click en la seccion de computers
    And el usuario da click en software
    Then visualiza los 3 productos de software