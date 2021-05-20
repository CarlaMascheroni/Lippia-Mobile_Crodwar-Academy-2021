package com.crowdar.examples.services.Booking;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.Booking.HomeBookingConstants;

public class BookingHomeService extends MobileActionManager {
    public static void goHome(){
        isPresent(HomeBookingConstants.BANNER_HOME_XPATH);
    }
}
