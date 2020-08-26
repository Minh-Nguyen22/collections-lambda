package phylosophy_of_java.adding_groups_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow {}
    class Powder extends Snow {}
    class Lights extends Powder {}
    class Heavy extends Powder {}
    class Crusty extends  Snow {}
    class Slush extends Snow {}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(
                new Crusty(), new Slush(), new Powder());

        // Не компилируется:
         List<Snow> snow2 = Arrays.asList(new Lights(), new Heavy());
        // Компилятор сообщает:
        // получено  : java.util.List<Powder>
        // требуется : java.util.List<Snow>
        // У Co;;ections.addAll() проблем нет:
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Lights(), new Heavy());

        // Подсказка с явно указанным аргументом типа:
        List<Snow> snow4 =
                Arrays.<Snow>asList(new Lights(), new Heavy());
        System.out.println(snow1);
        System.out.println(snow2);
        System.out.println(snow3);
        System.out.println(snow4);
    }
}
