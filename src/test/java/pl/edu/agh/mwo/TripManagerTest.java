package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TripManagerTest {
	
	@Test
	public void addTrip() {	
		TripManager tm = new TripManager();
		Trip trip = new Trip("delegacja", "PSE");
		assertEquals(0, tm.getTrips().size());	
		tm.addTrip(trip);
		assertEquals(1, tm.getTrips().size());
	
	}

	@Test
	public void removeTrip() {	
		TripManager tm = new TripManager();
		Trip trip = new Trip("delegacja", "PSE");
		tm.addTrip(trip);
		assertEquals(1, tm.getTrips().size());	
		tm.removeTrip(trip);
		assertEquals(0, tm.getTrips().size());	
	}

	@Test
	public void findTripByDescription() {	
		TripManager tm = new TripManager();
		Trip trip = new Trip("delegacja", "PSE");
		tm.addTrip(trip);
		Trip trip1 = new Trip("delegacja1", "energa");
		tm.addTrip(trip1);
		Trip trip2 = new Trip("delegacja2", "PGE");
		tm.addTrip(trip2);
		assertEquals(trip2, tm.findTrip("PGE"));	
	}
	
	@Test
	public void findTripByName() {	
		TripManager tm = new TripManager();
		Trip trip = new Trip("delegacja", "PSE");
		tm.addTrip(trip);
		Trip trip1 = new Trip("delegacja1", "energa");
		tm.addTrip(trip1);
		Trip trip2 = new Trip("delegacja2", "PGE");
		tm.addTrip(trip2);
		assertEquals(trip1, tm.findTrip("delegacja1"));	
	}
	
	@Test
	public void tripNotFound() {	
		TripManager tm = new TripManager();
		Trip trip = new Trip("delegacja", "PSE");
		tm.addTrip(trip);
		Trip trip1 = new Trip("delegacja1", "energa");
		tm.addTrip(trip1);
		Trip trip2 = new Trip("delegacja2", "PGE");
		tm.addTrip(trip2);
		assertEquals(null, tm.findTrip("Tauron"));	
	}	
	
}