package com.dev.ustglobal.operations;

import java.sql.Connection;

public interface Operations {
	
	public void searchSong();
	public void showAllSong();
	public void playAllSong();
	public void playRandomSong();
	public void playParticularSong();
	public void addSong();
	public void editSong();
	public void deleteSong();
	public Connection establishConnection();
	
	


	
	
}
