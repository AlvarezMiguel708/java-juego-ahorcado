import java.util.Scanner;
public class Ahorcado {
    public static void main(String[] args) throws Exception {
        //clase scanner q permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);
        
        //Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;
        
        //Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            //System.out.print(letrasAdivinadas[i]);
        }
        
        while(!palabraAdivinada && intentos < intentosMaximos){
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " " + palabraSecreta.length() + " letras");
            
            System.out.println("Introduce una letra: ");
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            
            boolean letraCorrecta = false;
            
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
                       

            }
            
            if(!letraCorrecta){
            intentos++;
                System.out.println("Incorrecto, te quedan " + (intentosMaximos - intentos) + " intentos");
            }
            
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Adivinaste la palabra! Es: " + palabraSecreta);
            }

        }
        
        if(!palabraAdivinada){
            System.out.println("game over");
        }
        scanner.close();
    }
}
