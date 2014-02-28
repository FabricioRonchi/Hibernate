import java.util.ArrayList;
import persistence.entities.User;
import persistence.entities.UserDAO;

public class TestarPersistence {
 
    public static void main(String[] args) {
        try {
            //createUsers();
            showAllUser();
        } catch (Exception ex) {
            System.out.println("A tentativa de criar usuários falhou!/n... " + ex.getMessage());
        }
        
    }
    
    private static void createUsers() throws Exception {
        System.out.println("Criando usuários...");
        UserDAO dao = new UserDAO();
        User admin = (User) dao.getNewInstance();
        admin.setName("Administrador");

        User guest = (User) dao.getNewInstance();
        guest.setName("Convidado");
        
        User user = (User) dao.getNewInstance();
        user.setName("Ayrton Senna");

        dao.create(admin);
        dao.create(guest);
        dao.create(user);

        System.out.print(" OK!");

    }    
    
    private static void showAllUser() throws Exception { 
        System.out.println("Listando usuários...");
        UserDAO dao = new UserDAO();
        ArrayList users = (ArrayList) dao.findAll();
        User o;
        
        for (int i=0; i<users.size(); i++) {
            o = (User) users.get(i);
            System.out.println(o);
        }
        
        
        User admin = (User) dao.getNewInstance();    
    
    
    }
    
    
}