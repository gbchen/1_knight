package sia.knights;

import java.io.PrintStream;

/**
 * 杀死恐龙探险任务
 *
 * Slay:杀死
 * @author chen
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }

}
