// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class Main {



    public static void main(String[] args) {
        A a = new A();
        A ab = new B();
        B b = new B();
        a.f(a);
        a.f(ab);
        a.f(b);
        ab.f(a);
        ab.f(ab);
        ab.f(b);
        b.f(a);
        b.f(ab);
        b.f(b);
        /*Exercice 8 le fragment donne apres compilation affiche:
            void f(A o) dans A
            void f(A o) dans A
            void f(B o) dans A
            void f(A o) dans B
            void f(A o) dans B
            void f(B o) dans B
            void f(A o) dans B
            void f(A o) dans B
            void f(B o) dans B
            */
        /*Exercice 9
        Cette operation d'ajout  a la class B est une surcharge
        le fragment aprés ajout de la classe B affiche:
        void f(A o) dans A
            void f(A o) dans A
            void f(B o) dans A
            void f(A o) dans B
            void f(A o) dans B
            void f(B o) dans B
            void f(A o) dans B
            void f(A o) dans B
            void f(B o) dans B
         */
           /*Exercice 10
        Cette operation d'ajout  a la class A est une surcharge
        le fragment aprés ajout de la classe A affiche:
        void f(A o) dans A
            void f(A o) dans A
            void f(B o) dans A
            void f(A o) dans B
            void f(A o) dans B
            void f(B o) dans B
            void f(A o) dans B
            void f(A o) dans B
            void f(B o) dans B
         */

        System.out.println();
        System.out.println(a instanceof A);
        System.out.println(ab instanceof A);
        System.out.println(b instanceof A);
        System.out.println(a instanceof B);
        System.out.println(ab instanceof B);
        System.out.println(b instanceof B);
        /* Exercice 10
            Le fragment donner affiche:
            true
            true
            true
            false
            true
            true
          */

    }
}