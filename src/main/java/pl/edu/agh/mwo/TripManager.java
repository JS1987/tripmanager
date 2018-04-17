package pl.edu.agh.mwo;

import java.util.ArrayList;

public class TripManager {

private ArrayList<Trip> trips = new ArrayList<Trip>();
	
	public void addTrip(Trip trip) {
		this.trips.add(trip);
	}
	
	public ArrayList<Trip> getTrips() {
		return trips;
	}
	
	public void removeTrip(Trip trip) {
		this.trips.remove(trip);
	}
	
	public Trip findTrip(String keyword) {
		for(Trip trip: this.trips) {
			if (trip.name == keyword || trip.description == keyword) {
				return trip;
			} else {
				ArrayList<Photo> tripPhotos = trip.getPhotos();				
				for(Photo photo: tripPhotos) {
					if (photo.comment == keyword) {
						return trip;
					}
				}
			}
		}
		return null;
	}
	
}
