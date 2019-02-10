import java.util.Scanner;

public class ApRefrescos{
	public static void main(String[] args){
		Stock miStock = new Stock();
		Scanner leer= new Scanner(System.in);
		int producto;
			miStock.llenarRieles();
		do{
			
			miStock.mostrarStock();
			
			System.out.print("¿Qué producto desea? (1-8): ");
			producto = leer.nextInt();
			if(producto <=8 && producto>=1)
				if(producto !=25565 && miStock.getRieles(producto-1)>0 && producto<=8){
					System.out.println("Despacharemos un producto "+producto);
					producto--;
					miStock.despachar(producto);
					producto++;
				} else
					System.out.println("La maquina ya no cuenta con el producto "+producto+". Por favor seleccione otro.");
			else if (producto != 25565)
				System.out.println("El producto "+producto+" no existe. Ingrese un valor valido (1-8).");
			
		}while(producto != 25565);
		
		System.out.println("Apagando maquina...");	
	}
}