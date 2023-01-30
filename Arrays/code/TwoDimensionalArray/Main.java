
public class Main {
    public static void main(String []args){
        TwoDimensionalArray1 a2d=new TwoDimensionalArray1();
         a2d.CreateTwoDimensionalArray(4, 3);
         a2d.insert(0, 0, 10);
         a2d.insert(0, 1, 20);
         a2d.insert(0, 2, 30);
         a2d.insert(1, 0, 40);
         a2d.insert(1, 1, 50);
         a2d.insert(1, 2, 60);
         a2d.insert(2, 0, 70);
         a2d.insert(2, 1, 80);
         a2d.insert(2, 2, 90);
         a2d.insert(3, 0, 100);
         a2d.insert(3, 1, 110);
         a2d.insert(3, 2, 120);
 
         a2d.access(0, 0);
         a2d.access(0, 1);
         a2d.traverse();
         a2d.search(100);
         a2d.deleteAt(0, 0);
         a2d.traverse();
         a2d.deleteAt(0, 1);
         a2d.traverse();
 
       
 
     }
}

//what is prototype model in software engineering and how it is different from waterfall model?


