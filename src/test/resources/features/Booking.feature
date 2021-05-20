Feature: El usuario realiza la reserva  en la App Booking

  @Demo
  Scenario: Realizar reserva de un Hotel en la app Booking
    Given El usuario se encuentra en la home
    When El usuario tapea la opcion Hotels
    And Completa el formulario con sus requerimientos
    Then le reenvia al los posibles hoteles disponibles