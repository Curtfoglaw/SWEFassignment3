
import java.util.ArrayList;

public class SelectingRoute {
    
    selectingRoute(int busNumber, int numberOfStops, ArrayList<location> stops) {
        // Constructor
    }

    int getBusNumber() {
        // Return the bus number
        return 0;
    }
    int getNumberOfStops() {
        // Return the number of stops
        return 0;
    }
    ArrayList<location> getStops(int busNumber) {
        // Return the list of stops
        return null;
    }

    boolean isValidBusNumber(int busNumber) {
        // Validate the bus number
        checkBusNumber(busNumber); // checks to see if bus number is in the list of valid bus numbers
        if (checkBusNumber(busNumber) == true) {
            return true;
        } else {
            return false;
        }
    }

    void calculateRoute() {
        // Calculate the route based on the stops
        if (isValidBusNumber(getBusNumber()) == true && getNumberOfStops() > 0) {
            // Perform route calculation
            System.out.println("Calculating route for bus number: " + getBusNumber());
            ArrayList<location> stopsOnRoute = getStops(getBusNumber());

            

        } else {
            // Handle invalid bus number or no stops
            System.out.println("Invalid bus number or no stops provided.");
            return;
        }
    }


}
