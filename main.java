import java.util.Scanner;
public class main
{
    static int rand1;
    static int tile;
    static int check = 0;
    static int game = 0;
    static int score = 0;
    static int a = 0;
    static int b = 0;
    static int c = 0;
    static int d = 0;
    static int e = 0;
    static int f = 0;
    static int g = 0;
    static int h = 0;
    static int i = 0;
    static int j = 0;
    static int k = 0;
    static int l = 0;
    static int m = 0;
    static int n = 0;
    static int o = 0;
    static int p = 0;
    static int w = 0;
    static int x = 0;
    static int y = 0;
    static int z = 0;
    static int a1 = 0;
    static int b1 = 0;
    static int c1 = 0;
    static int d1 = 0;
    static int e1 = 0;
    static int f1 = 0;
    static int g1 = 0;
    static int h1 = 0;
    static int i1 = 0;
    static int j1 = 0;
    static int k1 = 0;
    static int l1 = 0;
    static int m1 = 0;
    static int n1 = 0;
    static int o1 = 0;
    static int p1 = 0;
    static int win = 0;
    static int zeroInt = 0;
    static int cmSwitch = 0;
    static String zeros = "";
    static String move;
    static void randomTile(){
        rand1 = (int)(Math.random()*10);
        if (rand1==0){
            tile = 4;
        } else{
            tile = 2;
        }
        check = 0;
        while (check==0){
            rand1 = (int)(Math.random()*16);
            if (rand1==0 && a==0){
                a=tile;
                check=1;
            } else if (rand1==1 && b==0){
                b=tile;
                check=1;
            } else if (rand1==2 && c==0){
                c=tile;
                check=1;
            } else if (rand1==3 && d==0){
                d=tile;
                check=1;
            } else if (rand1==4 && e==0){
                e=tile;
                check=1;
            } else if (rand1==5 && f==0){
                f=tile;
                check=1;
            } else if (rand1==6 && g==0){
                g=tile;
                check=1;
            } else if (rand1==7 && h==0){
                h=tile;
                check=1;
            } else if (rand1==8 && i==0){
                i=tile;
                check=1;
            } else if (rand1==9 && j==0){
                j=tile;
                check=1;
            } else if (rand1==10 && k==0){
                k=tile;
                check=1;
            } else if (rand1==11 && l==0){
                l=tile;
                check=1;
            } else if (rand1==12 && m==0){
                m=tile;
                check=1;
            } else if (rand1==13 && n==0){
                n=tile;
                check=1;
            } else if (rand1==14 && o==0){
                o=tile;
                check=1;
            } else if (rand1==15 && p==0){
                p=tile;
                check=1;
            } 
        }
    }
    static void calcZeros(){
        if (zeroInt<10){
            zeros = "   ";
        } else if (zeroInt<100){
            zeros = "  ";
        } else if (zeroInt<1000){
            zeros = " ";
        } else {
            zeros = "";
        }
    }
    static void display(){
        System.out.println("Score: "+score);
        zeroInt=a;
        calcZeros();
        System.out.print(zeros+a+" | ");
        zeroInt=b;
        calcZeros();
        System.out.print(zeros+b+" | ");
        zeroInt=c;
        calcZeros();
        System.out.print(zeros+c+" | ");
        zeroInt=d;
        calcZeros();
        System.out.println(zeros+d+" | ");
        zeroInt=e;
        calcZeros();
        System.out.print(zeros+e+" | ");
        zeroInt=f;
        calcZeros();
        System.out.print(zeros+f+" | ");
        zeroInt=g;
        calcZeros();
        System.out.print(zeros+g+" | ");
        zeroInt=h;
        calcZeros();
        System.out.println(zeros+h+" | ");
        zeroInt=i;
        calcZeros();
        System.out.print(zeros+i+" | ");
        zeroInt=j;
        calcZeros();
        System.out.print(zeros+j+" | ");
        zeroInt=k;
        calcZeros();
        System.out.print(zeros+k+" | ");
        zeroInt=l;
        calcZeros();
        System.out.println(zeros+l+" | ");
        zeroInt=m;
        calcZeros();
        System.out.print(zeros+m+" | ");
        zeroInt=n;
        calcZeros();
        System.out.print(zeros+n+" | ");
        zeroInt=o;
        calcZeros();
        System.out.print(zeros+o+" | ");
        zeroInt=p;
        calcZeros();
        System.out.println(zeros+p+" | ");
    }
    static void compressLogic(){
        for (int forClock=0;forClock<3;forClock++){
            if (x>0 && w==0){
                w=x;
                x=0;
            }
            if (y>0 && x==0){
                x=y;
                y=0;
            }
            if (z>0 && y==0){
                y=z;
                z=0;
            }
    }
    }
    static void mergeLogic(){
        if (w==x){
            w*=2;
            x=0;
            score+=w;
        }
        if (x==y){
            x*=2;
            y=0;
            score+=x;
        }
        if (y==z){
            y*=2;
            z=0;
            score+=y;
        }
    }
    static void cORm(){
        if (cmSwitch==0){
            compressLogic();
        } else {
            mergeLogic();
        }
    }
    static void compressMerge(){
        if (move.equals("w")){
            w=a;
            x=e;
            y=i;
            z=m;
            cORm();
            a=w;
            e=x;
            i=y;
            m=z;
            w=b;
            x=f;
            y=j;
            z=n;
            cORm();
            b=w;
            f=x;
            j=y;
            n=z;
            w=c;
            x=g;
            y=k;
            z=o;
            cORm();
            c=w;
            g=x;
            k=y;
            o=z;
            w=d;
            x=h;
            y=l;
            z=p;
            cORm();
            d=w;
            h=x;
            l=y;
            p=z;
        }
        if (move.equals("a")){
            w=a;
            x=b;
            y=c;
            z=d;
            cORm();
            a=w;
            b=x;
            c=y;
            d=z;
            w=e;
            x=f;
            y=g;
            z=h;
            cORm();
            e=w;
            f=x;
            g=y;
            h=z;
            w=i;
            x=j;
            y=k;
            z=l;
            cORm();
            i=w;
            j=x;
            k=y;
            l=z;
            w=m;
            x=n;
            y=o;
            z=p;
            cORm();
            m=w;
            n=x;
            o=y;
            p=z;
        }
        if (move.equals("s")){
            w=m;
            x=i;
            y=e;
            z=a;
            cORm();
            m=w;
            i=x;
            e=y;
            a=z;
            w=n;
            x=j;
            y=f;
            z=b;
            cORm();
            n=w;
            j=x;
            f=y;
            b=z;
            w=o;
            x=k;
            y=g;
            z=c;
            cORm();
            o=w;
            k=x;
            g=y;
            c=z;
            w=p;
            x=l;
            y=h;
            z=d;
            cORm();
            p=w;
            l=x;
            h=y;
            d=z;
        }
        if (move.equals("d")){
            w=d;
            x=c;
            y=b;
            z=a;
            cORm();
            d=w;
            c=x;
            b=y;
            a=z;
            w=h;
            x=g;
            y=f;
            z=e;
            cORm();
            h=w;
            g=x;
            f=y;
            e=z;
            w=l;
            x=k;
            y=j;
            z=i;
            cORm();
            l=w;
            k=x;
            j=y;
            i=z;
            w=p;
            x=o;
            y=n;
            z=m;
            cORm();
            p=w;
            o=x;
            n=y;
            m=z;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        randomTile();
        randomTile();
        System.out.println("2048\nUse WASD to play");
        display();
        while (game==0){
        while (game==0){
            move = scan.nextLine();
            move = move.toLowerCase();
            a1=a;
            b1=b;
            c1=c;
            d1=d;
            e1=e;
            f1=f;
            g1=g;
            h1=h;
            i1=i;
            j1=j;
            k1=k;
            l1=l;
            m1=m;
            n1=n;
            o1=o;
            p1=p;
            cmSwitch = 0;
            compressMerge();
            cmSwitch = 1;
            compressMerge();
            cmSwitch = 0;
            compressMerge();
            if (a!=a1 || b!=b1 || c!=c1 || d!=d1 || e!=e1 || f!=f1 || g!=g1 || h!=h1 || i!=i1 || j!=j1 || k!=k1 || l!=l1 || m!=m1 || n!=n1 || o!=o1 || p!=p1){
                randomTile();
            }
            display();
            if (a!=0 && b!=0 && c!=0 && d!=0 && e!=0 && f!=0 && g!=0 && h!=0 && i!=0 && j!=0 && k!=0 && l!=0 && m!=0 && n!=0 && o!=0 && p!=0){
                if (!(a==b || b==c || c==d || e==f || f==g || g==h || i==j || j==k || k==l || m==n || n==o || o==p || a==e || e==i || i==m || b==f || f==j || j==n || c==g || g==k || k==n || d==h || h==l || l==p)){
                    game=1;
                }
            }
            if ((a==2048 || b==2048 || c==2048 || d==2048 || e==2048 || f==2048 || g==2048 || h==2048 || i==2048 || j==2048 || k==2048 || l==2048 || m==2048 || n==2048 || o==2048 || p==2048)&& win==0){
                game=2;
            }
        }
        if (game==2){
            System.out.println("You win!\nContinue?(y/n)");
            move = scan.nextLine();
            move = move.toLowerCase();
            if (move.equals("y")){
                game=0;
                win=1;
                display();
            }
        } 
    }
        System.out.println("You lose\nScore: "+score);
}
}
