public class Stock{
	
	private final int maxProductos=8;
	private int rieles[] = new int [maxProductos];
	private int capacidadRiel;
	
	public void despachar(int indice){
		rieles[indice]--;
	}
	
	public void llenarRieles(){
		for(int i=0;i<maxProductos;i++)
			rieles[i]=20;
	}
	
	public void mostrarStock(){
		System.out.println("Mi stock es:");
		for(int i=0;i<maxProductos;i++)
			System.out.println("Producto "+(i+1)+":"+rieles[i]);
	}
	
	public int getRieles(int indice){
		return rieles[indice];
	}
}