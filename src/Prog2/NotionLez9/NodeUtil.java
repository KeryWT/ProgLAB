package Prog2.NotionLez9;

public class NodeUtil {
    public static void scriviOutput(Node p){
        Node temp = p;
        String s = "";
        while (temp != null){
            s = s + " || " + temp.getElem();
            temp = temp.getNext();
        }
        System.out.println(s);
    }

    public static int length(Node p){
        int length =0;
        while (p != null) {
            p = p.getNext();
            length++;
        }
        return length;
    }


    public static int sum(Node p){
        int s = 0;
        while(p != null){
            s = s + p.getElem();
            p = p.getNext();
        }
        return s;
    }

    public static int max(Node p){
        assert p!= null: "Errore, hai provato a trovare il massimo di una lista vuota";
        int m = p.getElem();
        p = p.getNext();
        while (p != null){
            m = Math.max(p.getElem(), m);
            p = p.getNext();
        }
        return m;
    }

    public static boolean member(Node p, int x){
        while (p != null){
            if (p.getElem() == x){
                return true;
            }
            p = p.getNext();
        }
        return false;
    }

    public static String toString(Node p){
        String s = "";
        while (p != null){
            s = s + " " + p.getElem();
            p = p.getNext();
        }
        return s;
    }

    public static boolean sorted(Node p){
        if (p == null) return true;

        while (p.getNext() != null) {
            if(p.getNext().getElem() > p.getElem()) return false;

            p = p.getNext();
        }
        return true;
    }

    public static boolean equals(Node p, Node q){
        while (p != null && q != null){
            if (p.getElem() != q.getElem()) return false;

            p = p.getNext();
            q = q.getNext();
        }
        return (p==q);
    }

    public static void main(String[] args){
        System.out.println( "Main di prova per gli esercizi 0-7");
        System.out.println( "---------------------");

//aggiungo i nodi di q={10,20,30,40} a sinistra, dunque parto da 40
        Node q=new Node(40,null); q=new Node(30,q);q=new Node(20,q);
        q=new Node(10,q);
        System.out.println( "Lista q:");
        scriviOutput(q);
        System.out.println( "---------------------");

//aggiungo i nodi di p={10,20,30,40,30,20,10} a sinistra
        Node p=new Node(10,null); p=new Node(20,p); p=new Node(30,p);
        p=new Node(40,p); p=new Node(30,p); p=new Node(20,p);
        p=new Node(10,p);
        System.out.println( "Lista p:");
        scriviOutput(p);

        System.out.println( "---------------------");
        System.out.println( "1. length(p) = "       + length(p));
//        System.out.println( "1. length_rec(p) = "   + length_rec(p));
        System.out.println( "---------------------");
        System.out.println( "2. sum(p) = "          + sum(p));
//        System.out.println( "2. sum_rec(p) = "      + sum_rec(p));
        System.out.println( "---------------------");
        System.out.println( "3. max(p) = "          + max(p));
//        System.out.println( "3. maxr_rec(p) = "     + max_rec(p));
        System.out.println( "---------------------");
        System.out.println( "4. member(p,30) = "    + member(p,30));
        System.out.println( "4. member(p,50) = "    + member(p,50));
//        System.out.println( "4. member_rec(p,30) = "+ member_rec(p,30));
//        System.out.println( "4. member_rec(p,50) = "+ member_rec(p,50));
        System.out.println( "---------------------");
        System.out.println( "5. toString(q) = "     + toString(q));
        System.out.println( "5. toString(p) = "     + toString(p));
        System.out.println( "---------------------");
        System.out.println( "6. sorted(q) = "       + sorted(q));
        System.out.println( "6. sorted(p) = "       + sorted(p));
        System.out.println( "---------------------");
        System.out.println( "7. equals(p,q) = "     + equals(p,q));
        System.out.println( "7. equals(p,p) = "     + equals(p,p));
        System.out.println( "7. equals(q,q) = "     + equals(q,q));
        System.out.println( "7. equals(q,p) = "     + equals(q,p));}

}
