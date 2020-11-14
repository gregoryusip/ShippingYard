
public class Main {

	public Main() {
		Kapal perahuMotor = new perahuMotor(100, 100000000);
		Kapal perahuLayar = new perahuLayar(200, 50000000, 3);
		Kapal kapalPesiar = new kapalPesiar(1000, 2, 100000000, 100000000);
		
		System.out.println("Harga Perahu Motor: " + perahuMotor.hargaKapal());
		System.out.println("Harga Perahu Layar: " + perahuLayar.hargaKapal());
		System.out.println("Harga Kapal Pesiar: " + kapalPesiar.hargaKapal());
	}

	public static void main(String[] args) {
		new Main();
	}

}
