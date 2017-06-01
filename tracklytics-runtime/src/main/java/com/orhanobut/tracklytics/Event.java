package com.orhanobut.tracklytics;

import java.util.Map;

/**
 * This is the container for the triggered tracking event.
 * All related information is kept in here.
 */
@SuppressWarnings("WeakerAccess")
public class Event {

  public final String eventName;
  public final int[] filters;
  public final String[] tags;
  public final Map<String, Object> attributes;
  public final Map<String, Object> superAttributes;

  public Event(String eventName, int[] filters, String[] tags, Map<String, Object> attributes,
               Map<String, Object> superAttributes) {
    this.eventName = eventName;
    this.filters = filters;
    this.tags = tags;
    this.attributes = attributes;
    this.superAttributes = superAttributes;
  }

  public Event(TrackEvent trackEvent, Map<String, Object> attributes, Map<String, Object> superAttributes) {
    this.eventName = trackEvent.value();
    this.filters = trackEvent.filters();
    this.tags = trackEvent.tags();
    this.attributes = attributes;
    this.superAttributes = superAttributes;
  }
}
