import java.util.function.Consumer;

class Mostrar implements Consumer<Usuario>{
    public void accept(Usuario u){
        System.out.println(u.getNome());
    }    
}