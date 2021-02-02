package proyectoarray;

public class Main2 {

    

    public static void main(String[] args) {
        final int Filas = 5;
        final int Columnas = 5;
        char[][]letras = new char[Filas] [Columnas];
        char letraAleatoria = 'A';
        
        for (int f=0; f<Filas; f++){
            
            for(int c=0; c<Columnas; c++){
                letras[f][c] = letraAleatoria;
                letraAleatoria++;
                
            }
        }
        
        for(int f=0; f<Filas; f++){
            for(int c=0; c<Columnas; c++){
                System.out.print(letras[f][c] + "");
            }
            System.out.println();
        }
        
    }

}
