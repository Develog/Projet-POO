public class Parchment {
	
	private int idParchment;
	private boolean isActive;
	
	public Parchment(int idParchment) {
		this.idParchment = idParchment;
	}
	
	public int getIdParchment() {
		return this.idParchment;
	}
	
	public void isActive(boolean active) {
		this.isActive = active;
	}
}
