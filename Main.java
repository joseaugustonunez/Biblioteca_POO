package Tarea;

public class Main {

    public static void main(String[] args) {
        Autor autor= new Autor("Jose Augusto", "Nuñez Vicente");

        Libro libro = new Libro();
        libro.setTitulo("El libro");
        libro.setAnioPublicacion("2020");
        libro.agregarCapitulo(new Capitulo("Cap 1"));
        libro.agregarCapitulo(new Capitulo("Cap 2"));
        //Numero del capitulo a buscar
        libro.setBuscarCapitulo(2);

        Capitulo capitulo1 = new Capitulo();
        capitulo1.agregarTema(new Tema("* Introduccion"));
        capitulo1.agregarTema(new Tema("* Desarrollo"));
        capitulo1.agregarTema(new Tema("* Conclusion"));

        Capitulo capitulo2 = new Capitulo();
        capitulo2.agregarTema(new Tema("* Introduccion"));
        capitulo2.agregarTema(new Tema("* Desarrollo"));
        capitulo2.agregarTema(new Tema("* Conclusion"));

        System.out.println("Nombre del libro: " + libro.getTitulo() );
        System.out.println( "Año de Publicacion: " + libro.getAnioPublicacion());
        System.out.println("El libro cuenta con: " + libro.getContadorCapitulo()+" capitulos");
        System.out.println("Autores: "+ autor.getNombres() +" "+ autor.getApellidos());
        System.out.println("- Capitulo 1");
        for(Tema tem: capitulo1.getTema()){
        System.out.println(tem.getNombreTema());
        }
        System.out.println("- Capitulo 2");
        for(Tema tem: capitulo2.getTema()){
            System.out.println(tem.getNombreTema());
        }
        System.out.println("-------------BUSCAR----------");
        libro.buscarCapitulo();
    }

}
