package com.epam.steps;

import org.jbehave.core.annotations.*;
import static org.junit.Assert.assertTrue;

public class ApproveRequestSteps {

    @Given("OSM-User is logged as a '$role'")
    public void userLogIn(final String role) {
        System.out.println(String.format("User [%s] is logged in", role));
    }

    @Given("OSM-User navigates to My Requests page")
    public void navigateToMyRequestsTable() {
        System.out.println("Method navigate to page with ‘My Requests’ table");
    }

    @Then("Location requests table with movements details are presented")
    public void managerSeeActiveRequests() {
        System.out.println("Method should check that active requests table is present.");
    }

    @Given("OSM-User has assigned requests")
    public void userHasAssingedRequests() {
        System.out.println("Method should check that user has assigned requests.");
        assertTrue(true);
    }

    @When("OSM-User click on Approve button above the requests table")
    public void userClickOnApproveButtonAboveTheRequestTable() {
        System.out.println("Method should click on Approve button.");
    }

    @When("OSM-User click on Approve button")
    public void userClickOnApproveButton() {
        System.out.println("Method should click on Approve button.");
    }

    @When("OSM-User click on Request number")
    public void userClickOnRequestNumber() {
        System.out.println("Method should click on Request number.");
    }

    @When("OSM-User click on Approve button on Request Details page")
    public void userClickOnApproveButtonOnRequestDetailsPage() {
        System.out.println("OSM-User click on Approve button on Request Details page");
    }

    @Then("Employees movement request is completed")
    public void employeesMovementRequestIsCompleted() {
        System.out.println("Employees movement request should be completed.");
        assertTrue(true);
    }

    @When("OSM-User selects requests by clicking on checkbox")
    public void selectNecessaryRequestsForApprovalByClickingOnCheckbox() {
        System.out.println("Select necessary requests for approval by clicking on checkbox.");
    }
}
