
public abstract class Kapal {
	
	private String namaKapal;
	private String jenisKapal;

	public Kapal() {
		// TODO Auto-generated constructor stub
	}

	public String getNamaKapal() {
		return namaKapal;
	}

	public void setNamaKapal(String namaKapal) {
		this.namaKapal = namaKapal;
	}

	public String getJenisKapal() {
		return jenisKapal;
	}

	public void setJenisKapal(String jenisKapal) {
		this.jenisKapal = jenisKapal;
	}
	
	
	abstract int hargaKapal();

}
