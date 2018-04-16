package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TripTest {
	
	@Test
	public void createTrip() {	
		Trip trip = new Trip("Wakacje", "Odpoczynek z rodzina");
		assertEquals("Wakacje", trip.name);	
		assertEquals("Odpoczynek z rodzina", trip.description);	
	}
	
	@Test
	public void addPhoto() {	
		Trip trip = new Trip("Wakacje", "Odpoczynek z rodzina");
		Photo photo = new Photo("z rodzina");
		assertEquals(0, trip.getPhotos().size());	
		trip.addPhoto(photo);
		assertEquals(1, trip.getPhotos().size());	
	}

}