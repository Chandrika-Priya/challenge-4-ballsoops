import processing.core.PApplet;
class challengeballsoop{
    PApplet p;
    int w=1,x=1,y=1,z=1;
    public static final int HEIGHT = 1000;
    challengeballsoop(PApplet p1){
        p=p1;
    }
    public void drawcircle1(){
        p.ellipse(w,(1*(HEIGHT/5)),20,20);
        w += 1;
    }
    public void drawcircle2(){
        p.ellipse(x,(2*(HEIGHT/5)),20,20);
        x += 2;
    }
    public void drawcircle3(){
        p.ellipse(y,(3*(HEIGHT/5)),20,20);
        y += 3;
    }
    public void drawcircle4(){
        p.ellipse(z,(4*(HEIGHT/5)),20,20);
        z += 4;
    }

}

public class balls extends PApplet {
    challengeballsoop p1=new challengeballsoop(this);
    public static void main(String[] args) {
        PApplet.main("balls", args);
    }
    @Override
    public void settings() {
        super.settings();
        size(1000, 1000);
    }
    @Override
    public void draw () {
       p1.drawcircle1();
       p1.drawcircle2();
       p1.drawcircle3();
       p1.drawcircle4();
    }
}

