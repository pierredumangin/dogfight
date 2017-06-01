package jpu2016.dogfight.model;

import java.util.ArrayList;

public interface IDogfightModel {
	/* MÉTHODES */
	public IArea getArea();
	public void buildArea(Dimension dimension);
	public void addMobile(IMobile Mobile);
	public void removeMobile(IMobile Mobile);
	public ArrayListe<IMobile> getMobiles();
	public IMobile getMobileByPlayer(int player);
	public void setMobilesHavesMoved();

}
