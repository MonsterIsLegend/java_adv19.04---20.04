package user;

import java.time.LocalDate;

public class Main {


    public boolean isActivated(Object o ){
        return ((User) o) .isStatus();
    }


    public static void main(String[] args) {
//        User user = new User(
//                "js","js", "jaaanek9(@gmail.com",
//                LocalDate.of(1999,5,16)
//        );
//        System.out.println(user);
//
//        Admin admin = new Admin("aa", "bb", "ja@wp.pl", LocalDate.of(1999 , 5 , 16),
//        new String[]{"R","W","a"},"Jan", "Solski"
//        );
//
//        admin.setName("XD");
//        admin.setStatus(false);
//        System.out.println(admin);
        // POLIMORFIZM - wielopostaciowość
        User u1 = new User(
                "js","js", "jaaanek9(@gmail.com",
                LocalDate.of(2003,2,24));
        System.out.println(u1.getClass().getName());

        Object u2 = new Admin("aa", "bb", "ja@wp.pl", LocalDate.of(1999 , 5 , 16),
       new String[]{"R","W","a"},"Jan", "Solski"
        );

        Object u3 = u2;
        System.out.println(u2.getClass().getName());
        System.out.println(u3.getClass().getName());
        System.out.println(u2 == u3);
        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());
        System.out.println(u3.hashCode());
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);


        Main main = new Main();
        ((User) u1).setStatus(false);
        System.out.println(main.isActivated(u1));
        System.out.println(main.isActivated(u2));
        System.out.println(main.isActivated(u3));
        System.out.println(main.isActivated(
             new  User("x","y","z",LocalDate.of(1999,24,6))
        ));
    }


}
