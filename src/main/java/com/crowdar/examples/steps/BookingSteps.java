package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.Booking.BookingHomeService;
import com.crowdar.examples.services.Challenge.PhpHomeService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingSteps extends PageSteps {
    @Given("El usuario se encuentra en la home")
    public void elUsuarioSeEncuentraEnLaHome() {
        BookingHomeService.goHome();
    }

    @When("El usuario tapea la opcion Hotels")
    public void elUsuarioTapeaLaOpcionHotels() {
    }

    @And("Completa el formulario con sus requerimientos")
    public void completaElFormularioConSusRequerimientos() {
    }

    @Then("le reenvia al los posibles hoteles disponibles")
    public void leReenviaAlLosPosiblesHotelesDisponibles() {
    }
}
