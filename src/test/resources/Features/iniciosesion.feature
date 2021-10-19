Feature: Inicio de sesion en Advantage

  Scenario: Inicio de sesion
    Given The user is on advantage page
    When  The user type his credentials
    Then The user should see his username on the page