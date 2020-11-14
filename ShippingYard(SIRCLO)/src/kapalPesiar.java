
public class kapalPesiar extends Kapal{

	private int beratKapal;
	private int jumlahMesin;
	private int hargaMesin;
	private int hargaAksesoris;
	
	public kapalPesiar(int beratKapal, int jumlahMesin, int hargaMesin, int hargaAksesoris) {
		this.beratKapal = beratKapal;
		this.jumlahMesin = jumlahMesin;
		this.hargaMesin = hargaMesin;
		this.hargaAksesoris = hargaAksesoris;
	}

	@Override
	int hargaKapal() {
		return (((beratKapal * 1000000) + (jumlahMesin * hargaMesin)) + hargaAksesoris);
	}

}
