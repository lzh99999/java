public class Formula {
    //     B      DEF
    //A + --- + ------- = 10
    //     C      GHI
    //
    public static void main(String[] args) {
        int count = 0;
        for (int A = 1; A < 10; A++) {
            for (int B = 1; B < 10 ; B++) {
               if (A != B) {
                   for (int C = 1; C < 10; C++) {
                       if (A != C && B != C) {
                           for (int D = 1; D < 10; D++) {
                               if (D != A && D != B && D != C) {
                                   for (int E = 1; E < 10; E++) {
                                       if (E != A && E != B && E != C && E != D) {
                                           for (int F = 1; F < 10; F++) {
                                               if (F != A && F != B && F != C && F != D && F != E) {
                                                   for (int G = 1; G < 10; G++) {
                                                       if (G != A && G != B && G != C && G != D && G != E && G != F) {
                                                           for (int H = 1; H < 10; H++) {
                                                               if (H != A && H != B && H != C && H != D && H != E && H != F
                                                                       && H != G ) {
                                                                   for (int I = 1; I < 10; I++) {

                                                                       if ( I != A && I != B && I != C && I != D && I != E && I != F
                                                                               && I != G && I != H&&A + B * 1.0 / C + (D*100 + E *10 + F )* 1.0/(G *100 + H * 10+ I ) == 10.0) {
                                                                           count++;
                                                                           System.out.print("第"+count+"种："+A +" " + B +" "+C+" "+ D+" "+E+" "+F+" "+G+" "+H+" "+I);
                                                                           System.out.println();
                                                                       }
                                                                   }
                                                               }
                                                           }
                                                       }
                                                   }
                                               }
                                           }
                                       }
                                   }
                               }
                           }
                       }
                   }
               }
            }
        }
        System.out.println("总共"+count+"种方法");
    }
}
