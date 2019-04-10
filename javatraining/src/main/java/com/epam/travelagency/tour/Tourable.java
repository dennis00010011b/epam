package com.epam.travelagency.tour;


import java.util.Date;
/**
 * Interface {@code Tourable} describes methods for communicate with Tour objects
 *
 * @author Dennis Tikhomirov
 * @version 1.0
 * @since 2019-04-09
 */
public interface Tourable {
  Tour findTour(String destination, Date startDate);

}
