

    public class Main {
        public static void main(String[] args) {

            System.out.println("Estudiante " + args[0] + ": ");

            System.out.println(veredicto(args[1], args[2]));

        }

        // Iván Bonmatí Baeza

        private static String veredicto (String valor1, String valor2) {

            if(Integer.parseInt(valor1) > Integer.parseInt(valor2)) {
                return "Poco tiempo de estudio. Debes dedicar más tiempo.";
            } else if (Integer.parseInt(valor1) == Integer.parseInt(valor2)) {
                return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";

            }
            return "Ideal. Trabajas los contenidos en casa.";
        }
    }