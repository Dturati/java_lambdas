import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;;

public class Teste{
    public static void main(String[] args) {
        System.out.println("Teste");
        Usuario usuario1 = new Usuario("David", 100);
        Usuario usuario2 = new Usuario("José", 90);
        Usuario usuario3 = new Usuario("Marinete", 80);
        Usuario usuario4 = new Usuario("Evelin", 70);
        Usuario usuario5 = new Usuario("Leandro", 70);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        usuarios.add(usuario5);

        for(Usuario usuario : usuarios){
            System.out.println(usuario.getNome());
        }

        System.out.println("\n############# lambdas ##################\n");

        usuarios.forEach(p -> System.out.println(p.getNome()));
        
        System.err.println("\n########### Consumer ##########################\n");
        Mostrar mostrar = new Mostrar();
        usuarios.forEach(mostrar);


        System.out.println("###################### Classe anonima #######################");
        Consumer<Usuario> consumer = new Consumer<Usuario>() {
            public void accept(Usuario u){
                System.out.println(u.getNome());
            }
        };

        usuarios.forEach(consumer);
    
        System.out.println("############ Consumer ##################");
        List<Usuario> listDois = new ArrayList<Usuario>();
        usuarios.forEach(new Consumer<Usuario>() {
            public void accept(Usuario u){
                // listDois.add(u);
            }
        });
        
        // System.out.println(listDois.get(0).getNome());
        
        System.err.println("########### Lambda ###############");
        // Consumer<Usuario> lambda = (Usuario u) -> System.out.println(u.getNome());
        
        usuarios.forEach(p -> listDois.add(p) );
        listDois.forEach(l -> System.out.println(l.getNome()) );
    }
}