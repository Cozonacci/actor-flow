package org.madsol.tas;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.madsol.tas.AppConfig.REST_DRIVER;

public class SampleJunitTest {

    @Test
    public void shouldExecuteComplexUserFlows(){
        // as a user
        Actor guardian = new Actor("main-actor");

        // i want to execute simple actions
        Action resetDashboard = new SyncAction("reset dashboard", REST_DRIVER);
        guardian.performs(resetDashboard);

        // i want to execute simple flows
        Task googleSearch = new Task("google search", asList(
                new Action("launch browser"),
                new Action("open google.com"),
                new Task("search google term", asList(
                        new Action("type the search term"),
                        new Action("click the search button")))
        ));
        guardian.performs(googleSearch);
    }
}
