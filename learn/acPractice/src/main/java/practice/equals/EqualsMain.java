package practice.equals;

import javax.swing.plaf.synth.SynthScrollBarUI;
import java.util.List;

public class EqualsMain {


    public static void main(String[] args) {
        EqualsAbstractEntity entity = new EqualsEntity();

        List<String> skip = entity.getSkip();
        entity.deal();
//        System.out.println(skip.toString());
    }
}
