package com.epam.travelagency.tour;

import java.util.Date;
import java.util.Objects;

public abstract class Tour {

  public int price;
  public Date startDate;
  public Date endDate;
  public byte rating;
  private boolean isHot;
  public int duration;

  public boolean isHot() {
    return isHot;
  }

  public void setHot(boolean hot) {
    isHot = hot;
  }
}
