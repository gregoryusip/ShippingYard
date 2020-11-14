
public class perahuLayar extends Kapal{

	private int beratKapal;
	private int hargaLayar;
	private int jumlahLayar;
	
	public perahuLayar(int beratKapal, int hargaLayar, int jumlahLayar) {
		this.beratKapal = beratKapal;
		this.hargaLayar = hargaLayar;
		this.jumlahLayar = jumlahLayar;
	}

	@Override
	int hargaKapal() {
		return (beratKapal * 1000000) + (hargaLayar * jumlahLayar);
	}

}
