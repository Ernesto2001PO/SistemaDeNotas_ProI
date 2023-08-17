import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Entrada por teclado
        Saludo(true,"BIENVENIDOS A MI SISTEMAS DE NOTAS");
        Scanner sc = new Scanner(System.in);
        System.out.println("------------SISTEMA DE NOTAS-------------");
        System.out.println("Ingrese su pin ");
        String docente = sc.next();
        System.out.println("  ");
        System.out.println("------------REGISTRO DE MATERIAS -------------");
        System.out.println("-------------INGENERIA DE SISTEMAS---------- ");
        System.out.println("----------------I SEMESTRE---------------");
        System.out.println("CODIGO        MATERIAS");
        String materias []={"Contabilidad I","Programacion I","Algebra I","Administracion I","Taller de Actualizacion I ","Expresion Oral y Escrita ","Liderazgo Moral para la trasnformacion"};
        int codigo[]={1,2,3,4,5,6,7};
       for (int i = 0; i < materias.length ; i++) {
           System.out.println(  codigo[i] +  "             " +   materias[i]);
        }
        System.out.println(" ");

        System.out.println("Ingrese  la materia que quiere ponderar");
        String materia = sc.next();

        switch (materia) {
            case ("Contabilidad"):
                System.out.println("-----CONTABILIDAD I-------");
                System.out.println("Ingrese el nombre del estudiante ");
                String alumno = sc.next();
                System.out.println("Ingrese el apellido del estudiante ");
                String apellido = sc.next();
                System.out.println("Ingrese el numero de regsitro del estudiante ");
                int nRegistro=sc.nextInt();
                //NOTAS
                System.out.println("Primer parcial   /20");
                int primerParcial = sc.nextInt();
                System.out.println("Segundo parcial /20 ");
                int segundoParcial = sc.nextInt();
                System.out.println("Examen Final /30 ");
                int examenFinal = sc.nextInt();
                System.out.println("Trabajos Practicos  /20");
                int practicos = sc.nextInt();
                System.out.println("Control de lectura y asistencia  /10");
                int controlyAsistencia = sc.nextInt();
                System.out.println("Nota final");
                int notaFinal = primerParcial + segundoParcial + examenFinal + practicos + controlyAsistencia;
                System.out.println(notaFinal);
                //IMPRIMIR CON BUCLE
                System.out.println("Estudiante : " + alumno + apellido);
                System.out.println("Numero de registro: " + nRegistro);
                System.out.println("---------------------------------------CONTABILIDAD I------------------------------------------");
                System.out.println("PrimerParcial" + "        SegundoParcial "  +    "      ExamenFinal "   +   "         TrabajosPracticos "  + "  ControlyAsistencias"  + " NotaFinal");

                int notas[]={primerParcial,segundoParcial,examenFinal,practicos,controlyAsistencia,notaFinal};

                for (int i = 0; i <notas.length; i++) {
                    System.out.print( notas[i] + "                   ");


                }

                if (notaFinal >= 51) {

                    System.out.println("\n" +  "Aprobado");
                } else {

                    System.out.println("\n" +  "Reprobado");
                }
                System.out.println("--------------------------------------------------------------------------------------------------------");
                Despedida(true,"GRACIAS POR USAR EL SISTEMAS DE NOTAS");
                break;
            case ("Programacion"):
                System.out.println("----PROGRAMACION I------");
                System.out.println("Ingrese el nombre del estudiante ");
                String alumnoPro = sc.next();
                System.out.println("Ingrese el apellido del estudiante ");
                String apellidoPro = sc.next();
                System.out.println("Ingrese el numero de regsitro del estudiante ");
                int nRegistroPro=sc.nextInt();
                //NOTAS

                System.out.println("Primer parcial   /100 = 15%");
                double primerParcialPro = sc.nextInt()*0.15;
                System.out.println("Segundo parcial /100 = 15%");
                double segundoParcialPro = sc.nextInt()*0.15;
                System.out.println("Examen Final /100 = 25%");
                double examenFinalPro =  (sc.nextInt()*0.25);
                System.out.println("Controles y Practicos  /100 = 20%");
                double practicosPro = sc.nextInt()*0.20;
                System.out.println("Proyecto Final  /100 = 25% ");
                double proyectoFinal = sc.nextInt()*0.25;
                System.out.println("Nota final");
                double notaFinalPro = primerParcialPro + segundoParcialPro + examenFinalPro + practicosPro +proyectoFinal;
                System.out.println(notaFinalPro);
                System.out.println("Estudiante : " + alumnoPro + apellidoPro);
                System.out.println("Numero de registro: " + nRegistroPro);
                System.out.println("---------------------------------------PROGRAMACION I------------------------------------------");
                System.out.println("PrimerParcial" + "           SegundoParcial "  +    "      ExamenFinal "   +   "         ControlesyPracticos "  + "        ProyectoFinal"  + "     NotaFinal");

                double notasPro[]={primerParcialPro,segundoParcialPro,examenFinalPro,practicosPro,proyectoFinal, notaFinalPro};

                for (int i = 0; i <notasPro.length; i++) {
                    System.out.print( notasPro[i] + "                   ");

                }
                if (notaFinalPro >= 51) {

                    System.out.println("\n" + " Aprobado");
                } else {

                    System.out.println("\n" + "Reprobado");
                }
                System.out.println("--------------------------------------------------------------------------------------------------------");
                Despedida(true,"GRACIAS POR USAR EL SISTEMAS DE NOTAS");
                break;
            case ("Algebra"):
                System.out.println("----ALGEBRA I------");
                System.out.println("Ingrese el nombre del estudiante ");
                String alumnoAlg= sc.next();
                System.out.println("Ingrese el apellido del estudiante ");
                String apellidoAlg = sc.next();
                System.out.println("Ingrese el numero de regsitro del estudiante ");
                int nRegistroAlg=sc.nextInt();
                //NOTAS
                System.out.println("Primer parcial   /100 = 25%");
                double primerParcialAlg = sc.nextInt()*0.25;
                System.out.println("Segundo parcial /100 = 25%");
                double segundoParcialAlg = sc.nextInt()*0.25;
                System.out.println("Examen Final /100 = 25%");
                double examenFinalAlg =  (sc.nextInt()*0.25);
                System.out.println("Controles y Asistencia  /100 = 5%");
                double controlyAsisteniciaAlg = sc.nextInt()*0.05;
                System.out.println("Practiccos  /100 = 20% ");
                double practicosAlg = sc.nextInt()*0.20;
                System.out.println("Nota final");
                double notaFinalAlg = (primerParcialAlg + segundoParcialAlg + examenFinalAlg + controlyAsisteniciaAlg +practicosAlg);
                System.out.println(notaFinalAlg);
                System.out.println("Estudiante : " + alumnoAlg + apellidoAlg);
                System.out.println("Numero de registro: " + nRegistroAlg);
                System.out.println("------------------------------------------------ALGEBRA I-------------------------------------------------------");
                System.out.println("PrimerParcial" + "          SegundoParcial "  +    "      ExamenFinal "   +   "           ControlesyAsistencia "  + "   Practicos"  + "           NotaFinal");

                double notasAlg[]={primerParcialAlg,segundoParcialAlg,examenFinalAlg,controlyAsisteniciaAlg,practicosAlg,notaFinalAlg};

                for (int i = 0; i <notasAlg.length; i++) {
                    System.out.print( notasAlg[i] + "                   ");

                }
                if (notaFinalAlg >= 51) {

                    System.out.println("\n" + " Aprobado");
                } else {

                    System.out.println("\n" + "Reprobado");
                }
                System.out.println("--------------------------------------------------------------------------------------------------------");
                Despedida(true,"GRACIAS POR USAR EL SISTEMAS DE NOTAS");

                break;
            case ("Administracion"):
                System.out.println("----ADMINISTRACION I------");
                System.out.println("Ingrese el nombre del estudiante ");
                String alumnoAdm = sc.next();
                System.out.println("Ingrese el apellido del estudiante ");
                String apellidoAdm = sc.next();
                System.out.println("Ingrese el numero de regsitro del estudiante ");
                int nRegistroAdm=sc.nextInt();
                //NOTAS
                System.out.println("Primer parcial   /20");
                int primerParcialAdm = sc.nextInt();
                System.out.println("Segundo parcial /20 ");
                int segundoParcialAdm = sc.nextInt();
                System.out.println("Examen Final /20 ");
                int examenFinalAdm = sc.nextInt();
                System.out.println("Trabajos Practicos  /30");
                int practicosAdm = sc.nextInt();
                System.out.println("Control de lectura y asistencia  /10");
                int controlyAsistenciaAdm = sc.nextInt();
                System.out.println("Nota final");
                int notaFinalAdm = primerParcialAdm + segundoParcialAdm + examenFinalAdm + practicosAdm + controlyAsistenciaAdm;
                System.out.println(notaFinalAdm);
                //IMPRESION
                System.out.println("Estudiante : " + alumnoAdm + apellidoAdm);
                System.out.println("Numero de registro: " + nRegistroAdm);
                System.out.println("---------------------------------------ADMINISTRACION I------------------------------------------");
                System.out.println("PrimerParcial" + "        SegundoParcial "  +    "      ExamenFinal "   +   "       TrabajosPracticos "  + "  ControlyAsistencias"  + " NotaFinal");

                int notasAdm[]={primerParcialAdm,segundoParcialAdm,examenFinalAdm,practicosAdm,controlyAsistenciaAdm,notaFinalAdm};

                for (int i = 0; i <notasAdm.length; i++) {
                    System.out.print( notasAdm[i] + "                   ");

                }

                if (notaFinalAdm >= 51) {

                    System.out.println("\n" + " Aprobado");
                } else {

                    System.out.println("\n" + "Reprobado");
                }
                System.out.println("--------------------------------------------------------------------------------------------------------");
                Despedida(true,"GRACIAS POR USAR EL SISTEMAS DE NOTAS");

                break;

            case ("Taller"):
                System.out.println("----TALLER DE ACTUALIZACION I------");
                System.out.println("Ingrese el nombre del estudiante ");
                String alumnoTaller = sc.next();
                System.out.println("Ingrese el apellido del estudiante ");
                String apellidoTaller = sc.next();
                System.out.println("Ingrese el numero de regsitro del estudiante ");
                int nRegistroTaller=sc.nextInt();
                //NOTAS
                System.out.println("Primer parcial   /10");
                int primerTaller = sc.nextInt();
                System.out.println("Segundo parcial /10 ");
                int segundoParcialTaler = sc.nextInt();
                System.out.println("Examen Final /20 ");
                int examenFinalTaller = sc.nextInt();
                System.out.println("Trabajos Practicos  /50");
                int practicosTaller = sc.nextInt();
                System.out.println("Control de lectura y asistencia  /10");
                int controlyAsistenciaTaller = sc.nextInt();
                System.out.println("Nota final");
                int notaFinalTaller = primerTaller + segundoParcialTaler + examenFinalTaller + practicosTaller + controlyAsistenciaTaller;
                System.out.println(notaFinalTaller);

                //IMPRESION
                System.out.println("Estudiante : " + alumnoTaller + apellidoTaller);
                System.out.println("Numero de registro: " + nRegistroTaller);
                System.out.println("---------------------------------------TALLER DE ACTUALIZACION I------------------------------------------");
                System.out.println("PrimerParcial" + "        SegundoParcial "  +    "      ExamenFinal "   +   "       TrabajosPracticos "  + "  ControlyAsistencias"  + " NotaFinal");

                int notasTaller[]={primerTaller,segundoParcialTaler,examenFinalTaller,practicosTaller,controlyAsistenciaTaller,notaFinalTaller};

                for (int i = 0; i <notasTaller.length; i++) {
                    System.out.print( notasTaller[i] + "                   ");

                }

                if (notaFinalTaller>= 51) {

                    System.out.println("\n" + " Aprobado");
                } else {

                    System.out.println("\n" + "Reprobado");
                }
                System.out.println("--------------------------------------------------------------------------------------------------------");
                Despedida(true,"GRACIAS POR USAR EL SISTEMAS DE NOTAS");

                break;
            case ("Expresion"):
                System.out.println("-----EXPRESION ORAL Y ESCRITA-------");
                System.out.println("Ingrese el nombre del estudiante ");
                String alumnoExp = sc.next();
                System.out.println("Ingrese el apellido del estudiante ");
                String apellidoExp = sc.next();
                System.out.println("Ingrese el numero de regsitro del estudiante ");
                int nRegistroExp=sc.nextInt();
                //NOTAS
                System.out.println("Primer parcial   /15");
                int primerParcialExp = sc.nextInt();
                System.out.println("Segundo parcial /15 ");
                int segundoParcialExp = sc.nextInt();
                System.out.println("Examen Final /15 ");
                int examenFinalExp = sc.nextInt();
                System.out.println("Trabajos Practicos  /25");
                int practicosExp = sc.nextInt();
                System.out.println("Control de lectura y asistencia  /30");
                int controlyAsistenciaExp = sc.nextInt();
                System.out.println("Nota final");
                int notaFinalExp = primerParcialExp + segundoParcialExp + examenFinalExp + practicosExp + controlyAsistenciaExp;
                System.out.println(notaFinalExp);
                //IMPRIMIR CON BUCLE
                System.out.println("Estudiante : " + alumnoExp + apellidoExp);
                System.out.println("Numero de registro: " + nRegistroExp);
                System.out.println("---------------------------------------EXPRESION ORAL Y ESCRITA------------------------------------------");
                System.out.println("PrimerParcial" + "        SegundoParcial "  +    "      ExamenFinal "   +   "         TrabajosPracticos "  + "  ControlyAsistencias"  + " NotaFinal");

                int notasExp[]={primerParcialExp,segundoParcialExp,examenFinalExp,practicosExp,controlyAsistenciaExp,notaFinalExp};

                for (int i = 0; i <notasExp.length; i++) {
                    System.out.print( notasExp[i] + "                   ");

                }

                if (notaFinalExp >= 51) {

                    System.out.println("\n" +  "Aprobado");
                } else {

                    System.out.println("\n" +  "Reprobado");
                }
                System.out.println("--------------------------------------------------------------------------------------------------------");
                Despedida(true,"GRACIAS POR USAR EL SISTEMAS DE NOTAS");
                break;
            case ("Liderazgo"):
                System.out.println("----LIDERAZGO MORAL PARA LA TRANSFORMACION------");
                System.out.println("Ingrese el nombre del estudiante ");
                String alumnoLid = sc.next();
                System.out.println("Ingrese el apellido del estudiante ");
                String apellidoLid = sc.next();
                System.out.println("Ingrese el numero de regsitro del estudiante ");
                int nRegistroLid=sc.nextInt();
                //NOTAS
                System.out.println("Primer parcial   /20");
                int primerParcialLid = sc.nextInt();
                System.out.println("Segundo parcial /20 ");
                int segundoParcialLid = sc.nextInt();
                System.out.println("Examen Final /20 ");
                int examenFinalLid = sc.nextInt();
                System.out.println("Trabajos Practicos  /30");
                int practicosLid = sc.nextInt();
                System.out.println("Control de lectura y asistencia  /10");
                int controlyAsistenciaLid = sc.nextInt();
                System.out.println("Nota final");
                int notaFinalLid = primerParcialLid + segundoParcialLid + examenFinalLid + practicosLid + controlyAsistenciaLid;
                System.out.println(notaFinalLid);
                //IMPRESION
                System.out.println("Estudiante : " + alumnoLid + apellidoLid);
                System.out.println("Numero de registro: " + nRegistroLid);
                System.out.println("---------------------------------------TALLER DE ACTUALIZACION I------------------------------------------");
                System.out.println("PrimerParcial" + "        SegundoParcial "  +    "      ExamenFinal "   +   "       TrabajosPracticos "  + "  ControlyAsistencias"  + " NotaFinal");

                int notasLid[]={primerParcialLid,segundoParcialLid,examenFinalLid,practicosLid,controlyAsistenciaLid,notaFinalLid};

                for (int i = 0; i <notasLid.length; i++) {
                    System.out.print( notasLid[i] + "                   ");

                }
                if (notaFinalLid>= 51) {

                    System.out.println("\n" + " Aprobado");
                } else {

                    System.out.println("\n" + "Reprobado");
                }
                System.out.println("--------------------------------------------------------------------------------------------------------");
                Despedida(true,"GRACIAS POR USAR EL SISTEMAS DE NOTAS");
                break;
        }

    }

    //FUNCIONES

    static  boolean Saludo(boolean entrada1,String saludo){
        if (entrada1){
            System.out.println(saludo);
        }
        return entrada1;
    }


    static  boolean Despedida(boolean salida,String despedida){
if (salida){
    System.out.println(despedida);
}
     return salida;
    }







}
