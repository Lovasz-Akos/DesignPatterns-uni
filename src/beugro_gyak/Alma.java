package beugro_gyak;

public class Alma implements IAlma {
	private int price = 100;

	@Override
	public int Buy(int db) {
		if(db>100) {
			return (int) ((price*db)/2);
		}
		return price * db;
	}
}
