package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TripManagerTest {
	
	@Test
	public void addPhoto() {
		Trip trip = new Trip();
		Photo photo = new Photo();
		assertEquals(0, trip.getPhotos().size());
		trip.addPhoto(photo);
		assertEquals(1, trip.getPhotos().size());
	}
	

	
}
