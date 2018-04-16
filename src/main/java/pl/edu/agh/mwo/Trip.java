package pl.edu.agh.mwo;

import java.util.ArrayList;

public class Trip {
	
	private ArrayList<Photo> photos = new ArrayList<Photo>();
	public String name;
	public String description;
	
	public Trip(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public void addPhoto(Photo photo) {
		this.photos.add(photo);		
	}

	public ArrayList<Photo> getPhotos() {
		return photos;
	}

}