package co.edu.umanizales;

// Primera forma: Estándar (más común)
// public, static, void, parámetro String[]
public class Main {
    public static void main(String[] args) {
        System.out.println("Forma 1: Estándar");
    }
}

// Segunda forma: Notación estilo C
// Los corchetes van después del nombre del parámetro
class Main2 {
    public static void main(String args[]) {
        System.out.println("Forma 2: Notación estilo C");
    }
}

// Tercera forma: Varargs (desde Java 5)
// Usa ... en lugar de []
class Main3 {
    public static void main(String... args) {
        System.out.println("Forma 3: Varargs");
    }
}

// Cuarta forma: Con strictfp
// Garantiza precisión consistente en operaciones float/double
class Main4 {
    public static strictfp void main(String[] args) {
        System.out.println("Forma 4: Con strictfp");
    }
}

// Quinta forma: Con synchronized
// Sincroniza el metodo o bloques de codigo que accedena  recursos compartidos
class Main5 {
    public static synchronized void main(String[] args) {
        System.out.println("Forma 5: Con synchronized");
    }
}

// Sexta forma: Parámetro final
// Previene reasignación de la referencia args
class Main6 {
    public static void main(final String[] args) {
        System.out.println("Forma 6: Parámetro final");
    }
}

// Séptima forma: Múltiples modificadores
// Combina strictfp y synchronized
class Main7 {
    public static synchronized strictfp void main(String[] args) {
        System.out.println("Forma 7: Múltiples modificadores");
    }
}

// Octava forma: Nombre de parámetro personalizado
// El nombre del parámetro puede ser cualquiera
class Main8 {
    public static void main(String[] parametros) {
        System.out.println("Forma 8: Parámetro con nombre personalizado");
    }
}

// Novena forma: Sobrecarga del método main
// Puedes tener múltiples versiones del método main con diferentes parámetros
// IMPORTANTE: Solo main(String[] args) es el punto de entrada del programa
class Main9 {
    // Este es el punto de entrada que ejecuta la JVM
    public static void main(String[] args) {
        System.out.println("Forma 9: Sobrecarga del método main");
        System.out.println("Llamando versiones sobrecargadas...");
        
        // Llamadas explícitas a las versiones sobrecargadas
        main();
        main(10);
        main("Hola", "Mundo");
    }
    
    // Sobrecarga sin parámetros
    public static void main() {
        System.out.println("  - main() sin parámetros");
    }
    
    // Sobrecarga con int
    public static void main(int numero) {
        System.out.println("  - main(int): " + numero);
    }
    
    // Sobrecarga con múltiples String
    public static void main(String arg1, String arg2) {
        System.out.println("  - main(String, String): " + arg1 + " " + arg2);
    }
}
