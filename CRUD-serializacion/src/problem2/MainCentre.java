package problem2;

import problem2.dto.ShoppingCentre;
import problem2.interfaces.ICentre;
import problem2.service.CentreImpl;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainCentre {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opc = "1";
        ICentre repo = new CentreImpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Menu \n 1. Add  \n 2. Get \n 3. Update " +
                    "\n 4. Delete  \n 5. exit \n =>");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("Id centre: ");
                    Integer id = s.nextInt();
                    System.out.println("name centre: ");
                    String nam = s.next();
                    System.out.println("city: ");
                    String cat = s.next();
                    System.out.println("address: ");
                    String pri = s.next();

                    repo.save(new ShoppingCentre(id,nam, cat, pri));
                    break;
                }
                case "2": {
                    List<ShoppingCentre> productos = repo.findAll();
                    if(!productos.isEmpty()){
                        productos.forEach(System.out::println);
                    }else{
                        System.out.println("No hay registros");
                    }
                    break;
                }
                case "3": {
                    System.out.println("===== update ====");
                    System.out.print("id centre: ");
                    Integer idp = s.nextInt();
                    System.out.print("enter name: ");
                    String nom = s.next();
                    System.out.print("enter city: ");
                    String cat = s.next();
                    System.out.print("enter address:");
                    String pri = s.next();
                    ShoppingCentre beaActualizar = new ShoppingCentre(idp, nom, cat, pri);
                    repo.update(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== delete ======");
                    System.out.print("enter id of the register: ");
                    Integer id = s.nextInt();
                    repo.delete(repo.findById(id));
                    repo.findAll().forEach(System.out::println);
                    break;
                }
                case "5": {
                    opc = "5";
                    break;
                }
            }
        } while (opc != "5");
    }
    }

