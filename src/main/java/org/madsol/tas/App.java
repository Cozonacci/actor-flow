package org.madsol.tas;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        // as a user
        Actor guardian = new Actor("main-actor");

        // i want to execute simple actions
        Action resetDashboard = new Action("reset dashboard");
        guardian.performs(resetDashboard);

        // i want to execute simple flows
        Flow googleSearch = new Flow(Arrays.asList(
                new Action("launch browser"),
                new Action("open google.com"),
                new Action("type the search term"),
                new Action("click the search button")));
        guardian.performs(googleSearch);
    }
}
