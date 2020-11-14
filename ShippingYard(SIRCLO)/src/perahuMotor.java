
public class perahuMotor extends Kapal {

	private int beratKapal;
	private int hargaMesin;
	
	public perahuMotor(int beratKapal, int hargaMesin) {
		this.beratKapal = beratKapal;
		this.hargaMesin = hargaMesin;
	}
	
	@Override
	int hargaKapal() {
		return (beratKapal * 1000000) + hargaMesin;
	}

}
