package Vaney;

public class Matriz {

	public int[][] C = new int[10][10];
	public int k = 100;
	public int longitud,inicio;
	
	public Matriz() {
		for(int i=0; i<10; i++){
		 for(int j=0; j<10;j++){
			 C[i][j]= k;
			 k--;
		 }	
		}
		inicio=0;
		longitud=10;
	}

	public int getLongitud(){ return longitud;}
	public void setLongitud() {longitud--;}
	public int getInicio(){return inicio;}
	public void setInicio(){inicio++;}
	public void getMatriz(){
		for(int i=inicio; i<longitud;i++){
			for(int j=inicio; j<longitud;j++){
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}	
	}
	
	public void recorridoHaciaAdelanteC(int fila){
		for(int j =inicio; j<longitud;j++){
			System.out.print(C[fila][j]+ " ");
		}
		System.out.println();
	}
	public void recorridoHaciaAbajoF(int columna){
		for(int i = inicio +1; i<longitud;i++){
			System.out.print(C[i][columna]+ " ");
		}
		System.out.println();
	}
	public void recorridoHaciaAtrasC(int fila){
		for(int j = longitud-2; j>=inicio;j--){
			System.out.print(C[fila][j]+ " ");
		}
		System.out.println();
	}
	public void recorridoHaciaArribaF(int columna){
		for(int i = longitud-1; i>inicio;i--){
			System.out.print(C[i][columna]+ " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
        Matriz salida = new Matriz();
        int fila, columna, dim;
        
        dim=salida.getLongitud();
        fila=salida.getInicio();
        columna=salida.getInicio();
        
        System.out.println("Matriz Original: ");
        salida.getMatriz();
        System.out.println();
        System.out.println("Matriz en Espiral: ");
        
        
        while(fila!=((dim/2))&&columna!=((dim/2))){
        	if(fila==salida.getInicio()&&columna==salida.getInicio()){
        		salida.recorridoHaciaAdelanteC(fila);
        		columna=salida.getLongitud()-1;
        		
        	}
        	if(columna==salida.getLongitud()-1&&fila==salida.getInicio()){
        		salida.recorridoHaciaAbajoF(columna);
        		fila=salida.getLongitud()-1;
        		
        	}
        	if(columna==salida.getLongitud()-1&&fila==salida.getLongitud()-1){
        		salida.recorridoHaciaAtrasC(fila);
        		columna=salida.getInicio();
        	}
        	if(columna==salida.getInicio()&&fila==salida.getLongitud()-1){
        		salida.setLongitud();
        		salida.recorridoHaciaArribaF(columna);
        		salida.setInicio();
        		fila=salida.getInicio();
        		columna=salida.getInicio();
        	}
            
        }
        

	}

}

